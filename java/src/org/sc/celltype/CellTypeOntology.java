package org.sc.celltype;

import java.io.*;
import java.util.*;

import javassist.CannotCompileException;

import org.sc.obo.OBOOntology;
import org.sc.obo.OBOParser;
import org.sc.obo.OBOStanza;
import org.sc.obo.OBOTerm;
import org.sc.obo.annotations.JavaExporter;
import org.sc.obo.annotations.OBOTermCreator;

public class CellTypeOntology {
	
	public static void main(String[] args) throws IOException, CannotCompileException { 
		File f = new File(args[0]);
		CellTypeOntology ct = new CellTypeOntology(f);
	}
	
	private Map<String,OBOTerm> terms;
	private Map<String,Class> termClasses;
	
	public CellTypeOntology(File f) throws IOException, CannotCompileException {
		
		String javaClassName = f.getName().split("\\.")[0];
		//String javaFileName = Character.toUpperCase(javaClassName.charAt(0)) + javaClassName.substring(1, javaClassName.length()) + ".java";
		String javaFileName = "CellType.java";
		File outputf = new File(f.getParent(), javaFileName);
		
		PrintWriter pw = new PrintWriter(new FileWriter(outputf));
		
		pw.println("package org.sc.celltype;\n");
		pw.println("import org.sc.obo.annotations.Relates;");
		pw.println("import org.sc.obo.annotations.Term;");
		
		terms = new TreeMap<String,OBOTerm>();
		termClasses = new TreeMap<String,Class>();

		OBOParser parser = new OBOParser();
		parser.parse(f);

		OBOOntology ontology = parser.getOntology();

		OBOTermCreator classCreator = new OBOTermCreator();
		
		JavaExporter java = new JavaExporter();
		
		for(OBOStanza stanza : ontology.getStanzas()) { 
			if(stanza instanceof OBOTerm) { 
				OBOTerm term = (OBOTerm)stanza;
				
				if(!term.isObsolete()) { 

					terms.put(term.id(), term);
					Class termClass = classCreator.createTerm(ontology, term);
					termClasses.put(term.id(), termClass);

					pw.println(java.export(termClass));
					//System.out.println(java.export(termClass));
				}
			}
		}
		
		pw.close();
		System.out.println("Output: " + outputf);
	}
}
