package org.sc.celltype;

public class CycleDetectedException extends Exception { 
	public CycleDetectedException() { super(); }
	public CycleDetectedException(String n) { super(n); }
}