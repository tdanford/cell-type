package org.sc.celltype;

import java.io.PrintStream;
import java.util.*;

public class DAG {
	
	private Map<String,Set<String>> immediate;
	private Map<String,Set<String>> connected;

	public DAG() {
		immediate = new TreeMap<String,Set<String>>();
		connected = new TreeMap<String,Set<String>>();
	}
	
	public void addNode(String str) { 
		if(!immediate.containsKey(str)) { 
			immediate.put(str, new TreeSet<String>());
		}
	}
	
	public Set<String> edges(String node) { 
		return new TreeSet<String>(immediate.get(node));
	}
	
	public Set<String> findRootNodes() { 
		Set<String> roots = new TreeSet<String>();
		for(String n : immediate.keySet()) { 
			if(immediate.get(n).isEmpty()) { 
				roots.add(n);
			}
		}
		return roots;
	}
	
	public DAG flipEdges() { 
		DAG d = new DAG();
		for(String n : immediate.keySet()) { 
			d.addNode(n);
		}
		
		for(String n1 : immediate.keySet()) { 
			for(String n2 : immediate.get(n1)) { 
				d.addEdge(n2, n1);
			}
		}
		
		return d;
	}
	
	public void printNode(String node, PrintStream ps, Map<String,? extends Object> data) { 
		printNode(node, 0, ps, data);
	}
	
	private void printNode(String node, int depth, PrintStream ps, Map<String,? extends Object> data) { 
		for(int i = 0; i < depth; i++) { ps.print("  "); }
		String dstr = data.containsKey(node) ? String.valueOf(data.get(node)) : "";
		ps.println(String.format("%s %s", node, dstr));
		for(String neighbor : immediate.get(node)) { 
			printNode(neighbor, depth+1, ps, data);
		}
	}
	
	public boolean hasNode(String node) { return immediate.containsKey(node); }
	
	public boolean hasEdge(String n1, String n2) { 
		return immediate.get(n1).contains(n2);
	}
	
	public void addEdge(String n1, String n2) { 
		addNode(n1);
		addNode(n2);
		immediate.get(n1).add(n2);
	}
	
	public boolean isConnected(String n1, String n2) { 
		return connected.get(n1).contains(n2);
	}
	
	public Set<String> getConnected(String n1) { 
		return new TreeSet<String>(connected.get(n1));
	}
	
	public void calculateConnectivity() throws CycleDetectedException { 
		connected.clear();

		Map<String,Set<String>> pending = new TreeMap<String,Set<String>>();
		
		for(String n : immediate.keySet()) { 
			connected.put(n, new TreeSet<String>(immediate.get(n)));
			pending.put(n, new TreeSet<String>());
			for(String n2 : connected.get(n)) { 
				pending.get(n).addAll(immediate.get(n2));
			}
			pending.get(n).removeAll(connected.get(n));
		}
		
		boolean hasPending = true;
		while(hasPending) { 
			hasPending = false;
			
			for(String n1 : pending.keySet()) { 
				TreeSet<String> newPending = new TreeSet<String>();
				
				for(String n2 : pending.get(n1)) { 
					if(n2.equals(n1)) { 
						throw new CycleDetectedException(n1);
					}
					
					Set<String> nextEdges = edges(n2);
					nextEdges.removeAll(connected.get(n1));
					newPending.addAll(nextEdges);

					connected.get(n1).add(n2);
				}
				
				pending.put(n1, newPending);
				hasPending = hasPending || !newPending.isEmpty();
			}
		}
	}
}

class CycleDetectedException extends Exception { 
	public CycleDetectedException() { super(); }
	public CycleDetectedException(String n) { super(n); }
}
