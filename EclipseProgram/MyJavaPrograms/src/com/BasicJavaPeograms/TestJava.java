package com.BasicJavaPeograms;

public class TestJava {
	//1.Variable
	//2.Method
	//3.Constructor
	//Default constructor
	TestJava(){
		System.out.println("TestJava class constructor");
	}
	//Parametrized constructor
	TestJava(String name)
	{
		System.out.println("Name="+name);
	}

	public static void main(String[] args) {
		TestJava t=new TestJava();
		TestJava t1=new TestJava();
		TestJava t2=new TestJava("Deepesh");
	}

}
