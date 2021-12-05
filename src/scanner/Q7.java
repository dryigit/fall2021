package scanner;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// Ask the user to enter a four-digit number and find the sum of the digits of that number.

		// Sample Output:

		// The sum of the digits of the given integer is 10.
				
				Scanner scan = new Scanner (System.in);
				System.out.println("Enter a four digit number");
				int sayi=scan.nextInt();
			    while (sayi<1000 || sayi>9999) {
				System.out.println("Please enter a four digit number");
			    sayi=scan.nextInt();
				}
				
				int birler=sayi%10;
				int onlar=(sayi/10)%10;
				int yuzler=(sayi/100)%10;
				int binler=sayi/1000;
				System.out.println("The sum of the digits of the given integer is "+ (birler+onlar+yuzler+binler));


				scan.close();

			}

		}
