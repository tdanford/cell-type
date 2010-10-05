package org.sc.celltype.servlets;

import java.io.IOException;
import java.net.URLDecoder;

import javax.servlet.*;
import javax.servlet.http.*;

import org.sc.celltype.CellTypeOntology;
import org.sc.obo.OBOTerm;

public class CellTypeOntologyServlet extends HttpServlet {
	
	private CellTypeOntology ontology;
	
	public CellTypeOntologyServlet(CellTypeOntology ont) { 
		ontology = ont;
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
		response.setContentType("text");
		oboTerm.print(response.getWriter());
	}
}
