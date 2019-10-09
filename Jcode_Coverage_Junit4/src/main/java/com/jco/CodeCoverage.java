package com.jco;

enum NUMTYPE{
	ODD,
	EVEN;
}

public class CodeCoverage {
	
	public boolean simpleMethod() {
		System.out.println("Simple Method call success");
		return true;
	}
	
	public NUMTYPE multipleBranchMethod(int num) {
		
		if(num<0) {
			throw new UnsupportedOperationException(num+" is a negative number.");
		}
		
		if(num%2 == 0) {
			System.out.println(num+" is Even Number.");
			return NUMTYPE.EVEN;
		} else {
			System.out.println(num+" is Odd Number.");
			return NUMTYPE.ODD;
		}
	}
	
}