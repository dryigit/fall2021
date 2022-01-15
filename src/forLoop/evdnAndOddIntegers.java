package forLoop;

import java.util.Scanner;

public class evdnAndOddIntegers {
public static void main(String[] args) {
	
	/*
	Write a program that prompts the user to input an integer and then
	outputs the number with the digits reversed.
	For example, if the input is 12345, the output should be 54321.
	
	 */
	
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the number");
	int num=scan.nextInt();
	
	for (int i=0; i<num; i++) {
		
		for (int j=0; j<i; j++){
			System.out.println();
		}
	}

}
}
