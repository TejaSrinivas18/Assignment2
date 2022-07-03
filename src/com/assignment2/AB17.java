package com.assignment2;

// Final method cannot be overridden because that is the purpose of the final keyword, something that cannot be changed or overridden.
//final keyword is used to restrict the access.

class Dog{
    public final void bark(){
        System.out.println("woof ");
    }
}
class Hound extends Dog{
    public void sniff(){
        System.out.println("sniff ");
    }
 
    public void bark(){
        System.out.println("bowl");
    }
}
 
public class AB17{
    public static void main(String [] args){
        Dog dog = new Hound();
        dog.bark();
    }
}


