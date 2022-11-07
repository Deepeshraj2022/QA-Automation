package com.BasicJavaPeograms;

import java.util.Scanner;

public class primenumber {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number");
		
		int n=scn.nextInt();//15
		int a=1;
		if(n<=1){  
			   System.out.println(n+" is less than 2");      
			  }else{

		for(int i=2;i<n;i++)
		{
			
			if(n%i==0)
			{
				a=0;
				break;
			}else {
				
			}
		}
		if(a==1)
		{
			System.out.println(n+" is a Prime number");
		}else {
			System.out.println(n+" is not a Prime number");
		}
			  }
	}

}
