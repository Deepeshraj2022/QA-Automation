package com.BasicJavaPeograms;

import java.util.Scanner;

public class Sumofdigits {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number");
		
		int n=scn.nextInt();//0
		int a=n;
		int sum=0;//23
		while(n>1) {
			int r=n%10;
			 sum=sum+r;
			 n=n/10;
		}
System.out.println("The sum of digits of "+a+" is "+sum);
	}

}
