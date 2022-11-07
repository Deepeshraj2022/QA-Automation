package com.BasicJavaPeograms;

public class Createanobject {

	//Data members
	//Non static variable
	 int a;
	 double s;
	  
	
	public static void main(String[] args) {
		
		//State-Value(Variable) Beaviour-Functionality(Method)
		//Syntax to create object
		Createanobject co=new Createanobject();
		System.out.println(co.a);
		System.out.println(co.s);
		co.a=2373;
		co.s=272.282;
				
		System.out.println(co.a);
		System.out.println(co.s);

	}

}
