package org.sc.celltype;

import java.io.File;
import java.util.*;

public class CellTypeProperties {
	
	private File cellTypeOntologyFile;

	public CellTypeProperties(String name) { 
		ResourceBundle bundle = ResourceBundle.getBundle(name);
		cellTypeOntologyFile = new File(bundle.getString("cell.obo"));
	}
	
	public CellTypeProperties() { 
		this("org.sc.celltype.cell");
	}
	
	public File getCellTypeOntologyFile() { return cellTypeOntologyFile; }
}
