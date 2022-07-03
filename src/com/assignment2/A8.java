package com.assignment2;

class D8{
	void display(){
		System.out.println("Hello World");
	}
}

class C8 extends D8{
    
}

class B8 extends C8{
   
}

public class A8 extends B8{
	

	public static void main(String[] args) {
		A8 a8 = new A8();
		a8.display();

	}

}
