package math;

import java.util.Scanner;

public class F03_Modulus {

	public static void main(String[] args) {
		
		//get a 3 digit number from user and write the total of each digit. 
		
		@SuppressWarnings("resource")
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Please anter a 3 digit number");
		
		int num=scan.nextInt();
		
		int sumOfDigits=0;
		
		int digit=num%10; //gives the ones digit
		
		sumOfDigits+=digit; //sumOfDigits becomes the ones of the number
		
		//the num is still the same as the user entered. it did no change. 
		
		num/=10; //with this, now we have only two digit number
		
		digit=num%10; //we get the second digit
		
		sumOfDigits+=digit; //sum of the digits becomes digit1+digit2
				
		num/=10; //now we have only one digit as the number.
		
		sumOfDigits+=num; //sum of the digits becomes digit1+digit2+num
		
		System.out.println("Sum of the digits: "+ sumOfDigits);
		
		

	}

}
