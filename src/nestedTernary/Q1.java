package nestedTernary;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		
		// If the employee is a woman, she can retire when she is over 60.
		// If the employee is male, he can retire if he is over 65. 
		
		Scanner scan=new Scanner(System.in);
				
		System.out.println("Select your gender; \nM--> for Male \nF--> for Female?");
		char gender=scan.next().toUpperCase().charAt(0);
		
		System.out.println("How old are you?");
		int age=scan.nextInt();
		
		String finalScenario= gender== 'M'  ? (age>65? "You can retire": "You can't retire"): 
											  (age>60? "You can retire": "You can't retire");
		
		System.out.println(finalScenario);
		
		scan.close();

	}

}
