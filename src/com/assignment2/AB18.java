package com.assignment2;

//  If a class is marked as final then no class can inherit any feature(properties) from the final class.
// final keyword is used to restrict the access.

final class Dog1{
    public void bark(){
        System.out.println("woof");
    }
}
class Hound1 extends Dog1{
    public void sniff(){
        System.out.println("sniff");
    }
 
    public void bark(){
        System.out.println("bowl");
    }
}
 
public class AB18{
    public static void main(String [] args){
        Dog1 dog = new Hound1();
        dog.bark();
    }
}
