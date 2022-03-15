package com.bridgelabz.basiccore;

import java.util.Scanner;

public class LardestNumber {
	
	
	public static void main(String[] args)   
	{  
		int a, b, c;// x and y are to swap   
	       Scanner sc = new Scanner(System.in);  
	       System.out.println("Enter the Three Numbers");  
	       a = sc.nextInt();  
	       b = sc.nextInt();
	       c =sc.nextInt();
	if(a>=b && a>=c)  
	System.out.println(a+" is the largest Number");  
	
	else if (b>=a && b>=c)  
	System.out.println(b+" is the largest Number");  
	else  
	
	System.out.println(c+" is the largest number");  
	}  
}
