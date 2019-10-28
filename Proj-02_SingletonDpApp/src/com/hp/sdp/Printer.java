package com.hp.sdp;

public class Printer {
	//private static Printer INSTANCE;
	private static Printer INSTANCE=new Printer();
	
	private Printer() {
		System.out.println("Printer ::: 0-Parameter Constructor");
	}
	
	/*public static Printer getInstance() {
		if(INSTANCE==null)
			INSTANCE=new Printer();
		return INSTANCE;
	}*/
	
	public static Printer getInstance() {
		return INSTANCE;
	}
}
