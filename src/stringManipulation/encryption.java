package stringManipulation;

import java.util.Scanner;

public class encryption {

	public static void main(String[] args) {
				
				/*

		        Convert the First Name, Surname and credit card numbers you get from the user to the custom form as below
				 * Check the credit card number, otherwise print "Invalid credit card number" if it is less than 16 digits.
				 	* 
		         * input : John White 1234234534561478
		           output: Ad : J*** Soyad :W**** cardNo:***********1478 

				 */
				
				
				Scanner scan = new Scanner(System.in);
				
				System.out.println("Your name");
				String name=scan.nextLine();
				
				System.out.println("Your surname");
				String surname=scan.nextLine();
				
				System.out.println("Your card number");
				String cardno=scan.nextLine();
				
				
				cardno=cardno.replaceAll("\\s", "");
				
				if (cardno.length()==16) {
					System.out.println(name.toUpperCase().charAt(0) +name.substring(1).replaceAll("\\w", "*") +" "+surname.toUpperCase().charAt(0)+surname.substring(1).replaceAll("\\w", "*"));
					System.out.println(cardno.substring(0,12).replaceAll("\\d", "*")+cardno.substring(12)); 
					
				} else {
					
					System.out.println("Please check your card number");
				}
				scan.close();
					
				}
				
			}
