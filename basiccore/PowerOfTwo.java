package com.bridgelabz.basiccore;

import java.util.Scanner;

public class PowerOfTwo {
	
	public static void main(String[] args) {
		int powerOfTwo=1;
		int n;
		int i=1;
	      System.out.println("Enter an number :: ");
	      Scanner sc = new Scanner(System.in);
	      n = sc.nextInt();
	      
	      while(i<=n) {
	    	  powerOfTwo = 2 * powerOfTwo;
	    	  System.out.println( powerOfTwo); 
	    	
	    	  i = i + 1;
	      }
}
}
