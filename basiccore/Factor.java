package com.bridgelabz.basiccore;
import java.util.Scanner;
public class Factor {
	
    public static void main(String[] args){
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number to find its Factors::");
        n = scanner.nextInt();
      
        System.out.print("Factors of " + n + " are: ");

        for (int i = 1; i <= n; ++i) {
          if (n % i == 0) {
            System.out.print(i + " ");
          }
        }
    }
}
