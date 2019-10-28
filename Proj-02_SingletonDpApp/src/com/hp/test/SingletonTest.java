package com.hp.test;

import com.hp.sdp.Printer;

public class SingletonTest {

	public static void main(String[] args) {
		Printer p1,p2=null;
		
		p1=Printer.getInstance();
		p2=Printer.getInstance();
		
		System.out.println(p1.hashCode()+"<------->"+p2.hashCode());
		System.out.println("P1==P2 ? "+(p1==p2));
	}

}
