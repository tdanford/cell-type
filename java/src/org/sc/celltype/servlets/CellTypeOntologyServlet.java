package org.sc.celltype.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

import javax.servlet.*;
import javax.servlet.http.*;

import org.sc.celltype.CellTypeOntology;
import org.sc.celltype.CycleDetectedException;
import org.sc.celltype.DAG;
import org.sc.obo.OBOTerm;

public class CellTypeOntologyServlet extends HttpServlet {
	
	private CellTypeOntology ontology;
	private DAG isaDag, subclassDag, developsIntoDag;
	
	public CellTypeOntologyServlet(CellTypeOntology ont) { 
		ontology = ont;
	
		isaDag = ontology.getIsaDag();
		
		try {
			isaDag = isaDag.getConnectedDAG();
		} catch (CycleDetectedException e) {
			throw new IllegalArgumentException("Cycle detected in ontology is_a graph.");
		}
		subclassDag = isaDag.flipEdges();
		developsIntoDag = ontology.getDevelopsFromDag().flipEdges();
	}
	
	public CellTypeOntologyServlet() throws IOException { 
		this(new CellTypeOntology());
	}
	
	public Set<String> reduceByIsa(Collection<String> ids) {
		String[] base = ids.toArray(new String[0]);
		TreeSet<String> reduced = new TreeSet<String>(ids);
		
		// do nothing, for now.
		
		return reduced;
	}
	
	public void printDevelopsGraph(PrintWriter writer, int depth, String id, String suffix) { 
		for(int i = 0; i < depth; i++) { 
			//writer.print("  ");
		}
		
		writer.println("<li>");
		
		OBOTerm developsIntoTerm = ontology.getTerm(id);
		//writer.println(String.format("%s ! %s\t%s", id, developsIntoTerm.getName(), suffix));
		writer.println(String.format("<a href=\"/celltypes?term=%s\">%s</a>", id, developsIntoTerm.getName()));

		writer.println("<ul>");
		for(String next : developsIntoDag.edges(id)) { 
			printDevelopsGraph(writer, depth+1, next, "");
		}
		
		for(String subclass : subclassDag.edges(id)) { 
			OBOTerm subclassTerm = ontology.getTerm(subclass);
			for(String next : developsIntoDag.edges(subclass)) { 
				printDevelopsGraph(writer, depth+1, next,
						"");
						//String.format("(via %s ! %s)", subclass, subclassTerm.getName()));				
			}
		}
		writer.println("</ul>");
		
		writer.println("</li>");
	}

	/**
	 * Responds to parameters: 
	 * ?term=TERM_ID
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
		String term = request.getParameter("term");
		if(term == null) { 
			response.sendError(HttpServletResponse.SC_BAD_REQUEST, "No 'term' parameter specified.");
			return;
		}
		
		term = URLDecoder.decode(term, "UTF-8");
	
		OBOTerm oboTerm = ontology.getTerm(term);

		if(oboTerm==null) { 
			response.sendError(HttpServletResponse.SC_GONE, String.format("No term with id %s was found in ontology.", term));
			return;
		}

		response.setStatus(HttpServletResponse.SC_OK);
		//response.setContentType("text");
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		//oboTerm.print(writer);
	
		writer.println("<div>");
		writer.println(oboTerm.getName());
		writer.println("<br>");
		
		Set<String> developsInto = new TreeSet<String>(developsIntoDag.edges(term));
		
		for(String isaID : isaDag.edges(term)) { 
			OBOTerm isaTerm = ontology.getTerm(isaID);
			writer.println(String.format("is_a: <a href=\"/celltypes?term=%s\">%s</a><br>",
					isaID,
					isaTerm.getName()));
			//developsInto.addAll(developsIntoDag.edges(isaID));
		}
		writer.println("</div>");
		
		writer.println("<ul>");
		printDevelopsGraph(writer, 0, term, "");
		writer.println("</ul>");
		
		//developsInto = reduceByIsa(developsInto);

		/*
		for(String developsIntoID : developsInto) { 
			OBOTerm developsIntoTerm = ontology.getTerm(developsIntoID);
			writer.println(String.format("develops_into: %s", developsIntoTerm.getName()));			
		}
		*/
		
	}
}
