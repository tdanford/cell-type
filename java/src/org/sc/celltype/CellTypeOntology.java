package org.sc.celltype;

import java.io.*;
import java.lang.reflect.Proxy;
import java.util.*;

import javassist.CannotCompileException;

import org.sc.obo.OBOOntology;
import org.sc.obo.OBOParser;
import org.sc.obo.OBOStanza;
import org.sc.obo.OBOTerm;
import org.sc.obo.annotations.parsers.JavaExporter;
import org.sc.obo.annotations.parsers.OBOTermCreator;

public class CellTypeOntology {
	
	public static void main(String[] args) throws IOException, CannotCompileException { 
		File f = new File(args[0]);
		CellTypeOntology ct = new CellTypeOntology(f);

		DAG isa = ct.getIsaDag();
		Set<String> roots = isa.findRootNodes();
		isa = isa.flipEdges();
		
		for(String r : roots) { 
			isa.printNode(r, System.out, ct.terms);
		}
	}
	
	private File ontologyFile;
	private OBOOntology ontology;
	
	private Map<String,OBOTerm> terms;	
	private Map<String,Class> termClasses;
	private Map<String,CellTerm> cellTerms = new TreeMap<String,CellTerm>();
	
	public CellTypeOntology() throws IOException { 
		this(new CellTypeProperties().getCellTypeOntologyFile());
	}
	
	public CellTypeOntology(File f) throws IOException {
		ontologyFile = f;
		
		OBOParser parser = new OBOParser();
		parser.parse(f);

		ontology = parser.getOntology();

		terms = new TreeMap<String,OBOTerm>();
		for(OBOStanza stanza : ontology.getStanzas()) { 
			if(stanza instanceof OBOTerm) { 
				OBOTerm term = (OBOTerm)stanza;
				if(!term.isObsolete()) { 
					terms.put(term.id(), term);
				}
			}
		}
	} 
	
	public OBOTerm getTerm(String id) { 
		return terms.get(id);
	}
	
	public CellTerm fromTerm(OBOTerm term) { 
		if(cellTerms.containsKey(term.id())) { 
			return cellTerms.get(term.id());
		} else { 
			CellTerm newTerm = (CellTerm)Proxy.newProxyInstance(
					CellTerm.class.getClassLoader(),
					new Class[] { CellTerm.class },
					new CellTermStanzaInvocationHandler(this, term));
			cellTerms.put(term.id(), newTerm);
			return newTerm;
		}
	}
	
	public DAG getDevelopsFromDag() { 
		return getRelationshipDag("develops_from");
	}
	
	public DAG getRelationshipDag(String typedef) { 
		DAG d = new DAG();
		
		for(String node : terms.keySet()) { 
			d.addNode(node);
		}
		
		for(String node : terms.keySet()) { 
			OBOTerm t =terms.get(node);
			for(String parent : t.relationship(typedef)) { 
				OBOTerm p = terms.get(parent);
				d.addEdge(node, parent);
			}
		}
		
		return d;
	}
	
	public DAG getIsaDag() { 
		DAG d = new DAG();
		for(String node : terms.keySet()) { 
			d.addNode(node);
		}
		
		for(String node : terms.keySet()) { 
			OBOTerm t =terms.get(node);
			for(String parent : t.isa()) { 
				OBOTerm p = terms.get(parent);
				d.addEdge(node, parent);
				//System.out.println(String.format("%s -> %s", t.getName(), p.getName()));
			}
			
			for(String parent : t.intersectionOf()) { 
				OBOTerm p = terms.get(parent);
				d.addEdge(node, parent);				
			}
		}
		
		return d;
	}
	
	public void createTermClasses() throws IOException, CannotCompileException { 
		String javaClassName = ontologyFile.getName().split("\\.")[0];
		//String javaFileName = Character.toUpperCase(javaClassName.charAt(0)) + javaClassName.substring(1, javaClassName.length()) + ".java";
		
		String javaFileName = "CellType.java";
		File outputf = new File(ontologyFile.getParent(), javaFileName);

		PrintWriter pw = new PrintWriter(new FileWriter(outputf));
		
		pw.println("package org.sc.celltype;\n");
		pw.println("import org.sc.obo.annotations.Relates;");
		pw.println("import org.sc.obo.annotations.Term;");
		
		termClasses = new TreeMap<String,Class>();

		OBOTermCreator classCreator = new OBOTermCreator();
		
		JavaExporter java = new JavaExporter();

		for(String id : terms.keySet()) { 
			OBOTerm term = terms.get(id);

			if(!term.isObsolete()) { 

				terms.put(term.id(), term);
				Class termClass = classCreator.createTerm(ontology, term);
				termClasses.put(term.id(), termClass);

				pw.println(java.export(termClass));
				//System.out.println(java.export(termClass));
			}
		}
		
		pw.close();
		System.out.println("Output: " + outputf);
	}
}
