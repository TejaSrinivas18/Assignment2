package com.assignment2;

public class A4 {
	//int a = 90;
	//int b = 89;
	
	int a;
	int b;
	
	public A4(int a, int b) {
		this.a = b;
		this.b = a;
	}


	/*public A4() {
		
		int temp =a;
		a = b;
		b = temp;
	}*/

	public static void main(String[] args) {
		A4 iv = new A4(90,89);
		System.out.println("a is " +iv.a);
		System.out.println("b is " +iv.b);
	}

}
