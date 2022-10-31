package com.BasicJavaPeograms;

import java.util.Scanner;

public class Loop1 {

	public static void main(String[] args) {
		//1. Loop statement
		//while loop
		//Syntax
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the age");
		
		int age=scn.nextInt();//25
		while(age>=18) {
			
			System.out.println("Eligible to vote......");
			age--;
		         }

	}

}
