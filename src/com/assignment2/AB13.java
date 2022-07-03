package com.assignment2;

// we can overload a static method 

class ABC1{
	static void  display() {
		System.out.println("hi");
	}
}



public class AB13 extends ABC1 {
	/*static void display() {
		System.out.println("hello");
	}*/
	
	static void display(int a, int b) {
		System.out.println(a+b);
	}
	
	static void display(int a,int b, int c) {
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
		//display(5);
		display(5,10);
		display(5,10,15);
		AB13 ab13= new AB13();
		ab13.display();
	}

}

/*
Method overriding is an example of runtime polymorphism. 
In method overriding, a subclass overrides a method with the same signature as that of in its superclass. 
During compile time, the check is made on the reference type. 
However, in the runtime, JVM figures out the object type and would run the method that belongs to that particular object.
*/

/* Java program to show that if static method is redefined by
a derived class, then it is not overriding. 

//Superclass
class Base {
  
 // Static method in base class which will be hidden in subclass
 public static void display() {
     System.out.println("Static or class method from Base");
 }
  
  // Non-static method which will be overridden in derived class
  public void print()  {
      System.out.println("Non-static or Instance method from Base");
 }
}

//Subclass
class Derived extends Base {
  
 // This method is hidden by display() in Base
 public static void display() {
      System.out.println("Static or class method from Derived");
 }
  
 // This method overrides print() in Base
 public void print() {
      System.out.println("Non-static or Instance method from Derived");
}
}

//Driver class
public class Test {
 public static void main(String args[ ])  {
    Base obj1 = new Derived();
     
    // As per overriding rules this should call to class Derive's static
    // overridden method. Since static method can not be overridden, it
    // calls Base's display()
    obj1.display(); 
     
    // Here overriding works and Derive's print() is called
    obj1.print();    
 }
}


Output:
Static or class method from Base
Non-static or Instance method from Derived
*/


