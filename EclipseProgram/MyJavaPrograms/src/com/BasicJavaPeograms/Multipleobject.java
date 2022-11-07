package com.BasicJavaPeograms;

public class Multipleobject {

	String name;
	int age;
	
	public static void main(String[] args) {
		Multipleobject m=new Multipleobject();
		m.name="Zeina";
		m.age=26;
		Multipleobject m1=new Multipleobject();
        m1.name="Josee";
        m1.age=25;
        
        System.out.println(m.name);
        System.out.println(m.age);
        System.out.println(m1.name);
        System.out.println(m1.age);
	}

}
