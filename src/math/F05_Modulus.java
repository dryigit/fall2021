package math;

import java.util.Scanner;

public class F05_Modulus {

	public static void main(String[] args) {
		// get a 3 digit number from user and write the total of each digit. 
		
		@SuppressWarnings("resource")
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Please anter a 4 digit number");
		int num=scan.nextInt();
		
		if (num>=1000 && num<9999) {
						
			int sumOfDigits=0;
	
			int digit=num%10; 			
			sumOfDigits+=digit; 
			
			num/=10; 
			digit=num%10;		
			sumOfDigits+=digit; 
					
			num/=10;
			digit=num%10;
			sumOfDigits+=digit; 
			
			num/=10;
			digit=num%10;
			sumOfDigits+=digit; 
			
			System.out.println("Sum of the digits: "+ sumOfDigits);
			
			
		} else {
			System.out.println("Please enter a 4 digit number");
		}
		
		int num3=627;
		System.out.println(num3/10); 
		

	}

}
