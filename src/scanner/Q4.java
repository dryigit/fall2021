package scanner;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		/*  Problem definition
        Write a code that takes the distance and speed and calculates the time.
        For example: The distance between Istanbul and Ankara is measured as 400 km. 
        How long does it take for a vehicle traveling at 120 km/h to reach its destination?

        Sample Screen Output
        Enter the distance: 400
        Enter speed: 100
        Duration is 4 hours.
     */
		
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Enter the distance in km");
		int distance=scan.nextInt();
		System.out.println("Enter your speed");
		int speed=scan.nextInt();
		
		int duration=distance/speed;
		
		System.out.println("You will arrive in "+ duration + " hours ");
		
		scan.close();

	}

}
