package org.sc.celltype;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import java.util.*;
import java.util.regex.*;

import org.sc.obo.OBOTerm;
import org.sc.obo.OBOValue;

public interface CellTerm {

	public String id();
	public String name();
	public String def();
	
	public CellTerm[] derives_from();
}

class CellTermProxy extends Proxy {
	
	protected CellTermProxy(InvocationHandler h) {
		super(h);
	}
}

class CellTermClassInvocationHandler implements InvocationHandler {
	
	private Class cls;
	
	public CellTermClassInvocationHandler(Class cls) { 
		this.cls = cls;
	}

	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		
		return null;
	} 
	
}

class CellTermStanzaInvocationHandler implements InvocationHandler {
	
	private OBOTerm term;
	private Map<String,Set<CellTerm>> relationships;
	
	private static Pattern relPattern = Pattern.compile("^\\s*([^\\s]+)\\s+(.*)\\s+(?:!\\s+(.*))?$");
	
	public CellTermStanzaInvocationHandler(CellTypeOntology ont, OBOTerm term) { 
		this.term = term;
		relationships = new TreeMap<String,Set<CellTerm>>();
		
		if(term.hasValue("relationship")) { 
			for(OBOValue value : term.values("relationship")) {
				Matcher m = relPattern.matcher(value.getValue());
				if(m.matches()) { 
					String typedef = m.group(1);
					String id = m.group(2);
					
					if(!relationships.containsKey(typedef)) { 
						relationships.put(typedef, new HashSet<CellTerm>()); 
					}
					
					CellTerm cellTerm = ont.fromTerm(ont.getTerm(id));
					relationships.get(typedef).add(cellTerm);
					
				} else { 
					System.err.println(String.format("Unrecognized relationship line: \"%s\"", value.getValue()));
				}
			}
		}
	}

	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {

		String name = method.getName();

		if(name.equals("def") || name.equals("id") || name.equals("name")) {  
			if(term.hasValue(name)) { 
				return term.values(name).get(0).getValue();
			} else { 
				return "";
			}
		} else if (name.equals("hashCode")) {
			return term.id().hashCode();
			
		} else if (name.equals("equals")) { 
			Object v = args[0];
			if(!(v instanceof CellTerm)) { return false; }
			CellTerm t = (CellTerm)v;
			return term.id().equals(t.id());

		} else if(relationships.containsKey(name)) {
			return relationships.get(name).toArray(new CellTerm[0]);

		} else {
			return new CellTerm[0];
		}
	} 
	
}