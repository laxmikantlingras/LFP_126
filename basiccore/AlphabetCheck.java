package com.bridgelabz.basiccore;
import java.util.Scanner;

public class AlphabetCheck {
	public static void main(String[] args) {

        char ch;
        System.out.println("Enter a alphabet to check the Entered Alphabet is Vowel or Consonant");
        Scanner sc = new Scanner(System.in);
        ch = sc.next().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");

    }

}
