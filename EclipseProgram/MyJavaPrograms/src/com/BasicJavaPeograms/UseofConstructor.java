package com.BasicJavaPeograms;

public class UseofConstructor {
	
	//Non static variables
	String name;
	int age;
	double sal;
	String Gender;
	//Use of constructor to initailse non static variable
	//Keyword this- used to refer Non static variable of current object
	public UseofConstructor(String name,int age,double sal,String Gender) {
		     this.name=name;
		     this.age=age;
		     this.sal=sal;
		     this.Gender=Gender;
		   }
	
	public void display() {
		System.out.println("[Name:-"+name+",Age:-"+age+",Salary:-"+sal+",Gender:-"+Gender+"]");
	}
	
	public static void main(String[] args) {
		UseofConstructor u=new UseofConstructor("Josee",24,252236.25,"Male");
		u.display();
		UseofConstructor u1=new UseofConstructor("Zeina",26,582254.25,"FeMale");
		u1.display();
	}

}
