package com.BasicJavaPeograms;

public class Blocks {
static int a;
int b;
	//Blocks in java
	//1. static block or static initialisation block
	//2.Non static block
	
public Blocks() {
	System.out.println("Default constructor");
}
	static
	{
		a=272;
		System.out.println("Static block1 a="+a);
	}
	static
	{
		System.out.println("Static block2 a="+a);
	}
	static
	{
		
		System.out.println("Static block3 a="+a);
	}
	
	
	{
		System.out.println("Non static block1");
	}
	{
		System.out.println("Non static block2");
	}
	{
		b=262;
		System.out.println("Non static block3");
	}
	public static void main(String[] args) {
		System.out.println("Main starts");
		Blocks b=new Blocks();
		Blocks b1=new Blocks();
		System.out.println(b.b);
        System.out.println("Main ends");
	}

}
