package com.BasicJavaPeograms;

import java.util.Scanner;

public class Loop2 {

	public static void main(String[] args) {
		//Syntax
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the age");
		
		int age=scn.nextInt();
		//do while loop statement
		do {
			System.out.println("Eligible to vote");
			
		}while(age>=18);

	}

}
