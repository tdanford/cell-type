package org.sc.celltype;

import java.util.*;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

import javax.swing.*;
import javax.swing.tree.*;

import org.sc.obo.OBOTerm;

public class Browser extends JPanel {

	public static void main(String[] args) throws IOException { 
		CellTypeOntology ont = new CellTypeOntology(new File(args[0]));
		new Browser(ont, "CL:0000222", "develops_from").new Frame();
	}
	
	private DefaultMutableTreeNode root;
	private DefaultTreeModel model;
	private JTree tree;
	private String relationshipTypedef;
	
	private DAG isa_rev;
	
	public Browser(CellTypeOntology ont) { 
		this(ont, "CL:0000000", "is_a");
	}
	
	public Browser(CellTypeOntology ont, String rootNode, String rel) { 
		super(new BorderLayout());
	
		relationshipTypedef = rel;
		setPreferredSize(new Dimension(400, 700));
		
		isa_rev = ont.getIsaDag().flipEdges();
		
		if(rel.equals("is_a")) { 
			DAG is_a = ont.getIsaDag().flipEdges();
			root = createTreeFromDag(rootNode, ont, is_a);
		} else { 
			DAG dag = ont.getRelationshipDag(rel).flipEdges();
			root = createTreeFromDag(rootNode, ont, dag);			
		}
		
		model = new DefaultTreeModel(root);
		tree = new JTree(model);
		
		add(new JScrollPane(tree), BorderLayout.CENTER);
	}
	
	private DefaultMutableTreeNode createTreeFromDag(String node, CellTypeOntology ont, DAG dag) { 
		OBOTerm term = ont.getTerm(node);
		DefaultMutableTreeNode tree = new DefaultMutableTreeNode(term.getName());
		
		for(String nb : dag.edges(node)) { 
			OBOTerm t = ont.getTerm(nb);
			if(!t.isObsolete()) { 
				tree.add(createTreeFromDag(nb, ont, dag)); 
			}
		}
		
		return tree;
	}
	
	public class Frame extends JFrame { 
		public Frame() { 
			super("Cell Types");
			Container c = (Container)getContentPane();
			c.setLayout(new BorderLayout());
			c.add(Browser.this, BorderLayout.CENTER);
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			setVisible(true);
			pack();
		}
	}
}
