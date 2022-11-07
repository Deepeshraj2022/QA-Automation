package com.BasicJavaPeograms;

public class Methods1 {
   static String name;
   int age;
	
   //static method
   public static void details1(Methods1 m1) {
	   name="Zeina";
	   m1.age=26;
   }
	
   //non static method
   public void details2() {
	   name="Josee";
	   age=23;
   }
	
	
	public static void main(String[] args) {
		Methods1 m=new Methods1();
		m.details2();
		m.details1(m);

	}

}
