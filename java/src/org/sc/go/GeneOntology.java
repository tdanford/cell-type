package org.sc.go;

import java.io.*;

import org.sc.obo.OBOOntology;
import org.sc.obo.OBOParser;

public class GeneOntology {
	
	public static void main(String[] args) throws IOException { 
		GeneOntology go = new GeneOntology(new File(args[0]));
		System.out.println(go.ontology.getStanzas().size() + " stanzas.");
	}
	
	private OBOOntology ontology;

	public GeneOntology(File f) throws IOException { 
		OBOParser parser = new OBOParser();
		parser.parse(f);
		ontology = parser.getOntology();
	}
}
