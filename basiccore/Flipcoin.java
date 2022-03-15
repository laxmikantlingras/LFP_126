package com.bridgelabz.basiccore;

import java.util.Random;
import java.util.Scanner;

public class Flipcoin {
public static void main(String[] args) {
		
	System.out.println("Please Enter The Number");
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	System.out.println("num:"+a);
	Random random =new Random();

	int x = random.nextInt(2);
	
	if(x==0) {
		
				System.out.println("tails");
				}

	else {
		System.out.println("heads");
	}
	

	}

}
