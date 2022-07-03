package com.assignment2;

abstract class CustDetails{
	int id,age;
	String name;
	long mobileNo;
	
	public CustDetails(int id, int age, String name, long mobileNo) {
		this.id = id;
		this.age = age;
		this.name = name;
		this.mobileNo = mobileNo;
	}
}

public class A9 extends CustDetails{
    public A9() {
		super(1,30,"Rohan",7893256489L);
		
	}

	public static void main(String[] args) {
		CustDetails cd = new A9();
		System.out.println(cd.id + " "+ cd.age +" "+cd.name+" "+cd.mobileNo+" ");
	}

}
