package com.assignment2;
class B7{
	B7(){
		System.out.println("I am parent constructor");
	}
}

public class A7 extends B7{
	A7(){
		System.out.println("I am child constructor");
	}

	public static void main(String[] args) {
		A7 a7 = new A7();
		
	}
}
