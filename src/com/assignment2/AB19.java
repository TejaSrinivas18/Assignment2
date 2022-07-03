package com.assignment2;

// in abstract methods we have to do only declaration. we should not do implementation.
// if a class has atleast one abstract method then it's class should be declared as abstract.
// abstract class should not be instantiated. abstract class can have abstract methods , non-abstract methods and constructors.

class Dog2{
    public void bark(){
        System.out.println("woof ");
    }
}
class Hound2 extends Dog2{
    public abstract void sniff(){
        System.out.println("sniff ");
    }
 
    public abstract void bark(){
        System.out.println("bowl");
    }
}
 
public class AB19{
    public static void main(String [] args){
        Dog2 dog = new Hound2();
        dog.bark();
    }
}
