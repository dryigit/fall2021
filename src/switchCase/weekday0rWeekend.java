package switchCase;

import java.util.Scanner;

public class weekday0rWeekend {

	public static void main(String[] args) {
		// find out whether it is weekend or weekday based on the number of the day
		
		System.out.println("Which day are you looking for? 1 to 7");
		
		Scanner scan= new Scanner(System.in);
		
		int selection=scan.nextInt();
		
		switch (selection) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Today is weekday");
			break;
		case 6:
		case 7:
			System.out.println("Today is weekend");
			break;
		default:
			System.out.println("Invalid choice");
			break;
		}
		scan.close();

	}

}
