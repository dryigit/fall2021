package forLoop;

import java.util.Scanner;

public class sumGivenNumbers {
public static void main(String[] args) {
	// Ask the user for two numbers.
	// Write a program that adds the entered numbers and all the integers between them and prints the result.
	System.out.println("Please enter the first number");
	Scanner scan = new Scanner (System.in);
	int num1=scan.nextInt();
	System.out.println("Please enter the second number");
	int num2=scan.nextInt();
	
	if (num1<num2){
		int numbers=0;
	for (int i=num1; i<=num2; i++){
		numbers+=i;
	}
		System.out.println(numbers);
	}
	
	if(num2<num1){
		int numbers=0;
		for (int i=num2; i<=num1; i++){
			numbers+=i;
		}
		System.out.println(numbers);
	}

}
}
