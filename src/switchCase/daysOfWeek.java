package switchCase;

import java.util.Scanner;

public class daysOfWeek {

	public static void main(String[] args) {


		Scanner scan= new Scanner (System.in);
		System.out.println("Please make a selection from 1 to 7");

		int selection=scan.nextInt();
		
		switch (selection) {
		case 1:
			System.out.println("Today is Monday");
			break;
		case 2:
			System.out.println("Today is Tuesday");
			break;
		case 3:
			System.out.println("Today is Wednesday");
			break;
		case 4:
			System.out.println("Today is Thursday");
			break;
		case 5:
			System.out.println("Today is Friday");
			break;
		case 6:
			System.out.println("Today is Saturday");
			break;
		case 7:
			System.out.println("Today is Sunday");
			break;

		default:
			System.out.println("Invalid choice");
			break;
		}
		scan.close();
	}

}
