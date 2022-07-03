package com.assignment2;

/*It's because In case of method Overloading

The most specific method is choosen at compile time.

As 'java.lang.String' is a more specific type than 'java.lang.Object'. 
In your case the method which takes 'String' as a parameter is choosen.
*/

public class AB11 {
	
	public static void method(Object o) {
		  System.out.println("Object method");
		 }
	
	public static void method(String s) {
		  System.out.println("String method");
		 }

	public static void main(String[] args) {
		method(null);

	}
	
}
