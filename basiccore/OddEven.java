package com.bridgelabz.basiccore;

import java.util.Scanner;
public class OddEven {
	public static void main(String args[])
	  {
	    int num;
	    System.out.println("Enter an Integer number:");
	    Scanner scan = new Scanner(System.in);
	    num = scan.nextInt();
	    
	    
	    if ( num % 2 == 0 )
	        System.out.println("Entered number is even");
	     else
	        System.out.println("Entered number is odd");
	  }
}
