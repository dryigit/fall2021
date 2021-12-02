package ifStatements;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		/*
		 * Problem definition :
		 *
		 * Get the number and list price of the product purchased from the user, ask if
		 * there is a customer card
		 *
		 * If the customer has a card and buys more than 10 products, 20% off, otherwise
		 * 15% off if the customer does not have a card and buys more than 10 products
		 * 15% off, and if less than 10 products 10% off
		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("How many products did you add to your basket? ");
		int productNumber = scan.nextInt();

		System.out.print("What is the price of each product you have added to your basket? ");
		double price = scan.nextDouble();

		System.out.println("Do you have a customer card? 1=YES or 2=No");
		int customerCard = scan.nextInt();

		double finalPrice = productNumber * price;

		if (customerCard == 1) {
			if (productNumber > 10) {
				System.out.println(
						"The total amount you should pay is: " + ((finalPrice) - (finalPrice * 20 / 100)) + " USD");
			} else {
				System.out.println(
						"The total amount you should pay is: " + ((finalPrice) - (finalPrice * 15 / 100)) + " USD");

			}

		} else if (productNumber > 10) {
			System.out.println(
					"The total amount you should pay is: " + ((finalPrice) - (finalPrice * 15 / 100)) + " USD");

		} else {
			System.out.println(
					"The total amount you should pay is: " + ((finalPrice) - (finalPrice * 10 / 100)) + " USD");

		}

		scan.close();
	}

}
