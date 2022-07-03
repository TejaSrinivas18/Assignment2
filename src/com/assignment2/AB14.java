package com.assignment2;

// if the final variable was blank, it should be initialized in constructor only.
// final variable cannot be blank. once final variable was assigned it can't be re-assigned.

public class AB14 {
	final int finalVar;
	
/*	AB14(){
		finalVar = 100;
	}
*/
	public static void main(String[] args) {
		AB14 ab = new AB14();
		System.out.println(ab.finalVar);

	}
}
