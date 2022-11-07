package com.BasicJavaPeograms;

public class ConstructorOver {

	//COnstructor Overloading
	ConstructorOver(){
		System.out.println("Default constructor");
	}
	ConstructorOver(int i){
		System.out.println("Constructor with int params a="+i);
	}
	
	ConstructorOver(String s,int a)
	{
		System.out.println("Name="+s+",Age="+a);
	}
	
	
	
	public static void main(String[] args) {
		ConstructorOver c=new ConstructorOver();
        ConstructorOver c1=new ConstructorOver(32);
        ConstructorOver c2=new ConstructorOver("Deepesh", 29);
	}

}
