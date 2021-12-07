package switchCase;

import java.util.Scanner;

public class ATMproject {

	public static void main(String[] args) {
		System.out.println("*** Welcome to the ATM ***");
		System.out.println("Please choose what you want to do");
		System.out.println();

		Scanner scan = new Scanner(System.in);
		String mainScreen = " 1: MY BALANCE \n 2: WITHDRAWAL \n 3: DEPOSIT \n 4: EXIT";

		System.out.println(mainScreen);

		int selection = 0;
		int myBalance = 5000;
		int withdrawal = 0;
		int deposit = 0;

		selection = scan.nextInt();

		switch (selection) {

		case 1:
			System.out.println("Your current balance is " + myBalance + " USD");
			break;

		case 2:
			System.out.println("How much do you want to withdraw?");
			withdrawal = scan.nextInt();
			if (withdrawal > myBalance) {
				System.out.println("You don't have enough balance to withdraw " + withdrawal + " USD");

			} else {
				myBalance -= withdrawal;
				System.out.println("You have successfully withdrawn " + withdrawal + " USD"
						+ "\nYour remaining balance is " + myBalance + " USD");
			}

			break;

		case 3:
			System.out.println("How much do you want to deposit?");
			deposit = scan.nextInt();
			myBalance = deposit + myBalance;
			System.out.println("You have successfully deposited " + deposit
					+ " USD to your addount. \nYour new balance is " + myBalance + " USD");
			break;
		case 4:
			System.out.println("Thanks for choosing our ATM");
			break;

		default:
			break;
		}
		scan.close();

	}

}
