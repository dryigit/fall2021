package ternary;

import java.util.Arrays;
import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
				
				// Get two sentences from the user.
				// print the first sentence if the first sentence is longer than the second sentence
				// print the second sentence if the second sentence is longer than the first sentence
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Please write the first sentence");
		String str1=scan.nextLine();
		
		System.out.println("Please write the second sentence");
		String str2=scan.nextLine();
		
		String result=str1.length()>str2.length() ? "This is the long sentence you have entered: " + str1: "This is the long sentence you have entered: " +str2;
		
		System.out.println(result);
		
		scan.close();
		
		
	}

}
