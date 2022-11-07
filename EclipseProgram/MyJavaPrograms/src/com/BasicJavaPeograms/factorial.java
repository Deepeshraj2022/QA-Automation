package com.BasicJavaPeograms;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number");
		
		int a=scn.nextInt();
		int fact=1;//120
		for(int i=1;i<=a;i++)
		{
			fact=fact*i;
		}
System.out.println("The factorial of "+a+" is "+fact);
	}

}
