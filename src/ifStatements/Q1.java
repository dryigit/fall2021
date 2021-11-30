package ifStatements;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		/* 1. "Enter your midterm exam result:" 
		 * 2. midterm grade will be entered as a double value. 
		 * 3. "Enter midterm exam percentage" to the user. ->> should be double ->> 0,40 affects !!You enter the system how many percent it affects.!! 
		 * 4. Enter your final exam result to the user. 
		 * 5. The final grade should be double (eg: 65,5) 
		 * 6. "Enter the final exam percentage" to the user-->> it should be double ->> 0,60 affects. 
		 * 7. Visa To find the final average, 40 percent of the midterm and 60 percent of the final must be taken and the results must be added 
		 * 8. You can equalize the result (the grade point average of the course) to the double total 
		 * 
		 * todo : If the condition part is greater than 90 (including 90), AA as letter grade, 
		 * 								     BA between 80 (including 80) and 90, BB 
		 * 						             if between 70 (including 70) and 80, CB 
		 * 									    between 60 (including 60) and 70, CC 
		 * 										between 50 (including 50) and 60, DC
		 * 										between 30 (including 30) and 49, DD 
		 * 										between 0  (including 0)  and 29, FF
		 */ 
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Ener your mid-term exam result: ");
		double midterm=scan.nextDouble();
		System.out.print("Enter your final exam result: ");
		double finalExam=scan.nextDouble();
		
		double finalResult=(((midterm*40)/100) + (( finalExam*60)/100));
		
		if(finalResult<=29) {
			System.out.print("Your final grade is " + finalResult + " FF");

		} else if (finalResult<=49) {
			System.out.print("Your final grade is " + finalResult + " DD");

		} else if (finalResult<=60) {
			System.out.print("Your final grade is " + finalResult + " DC");

		} else if (finalResult<=70) {
			System.out.print("Your final grade is " + finalResult + " CC");

		} else if (finalResult<=80) {
			System.out.print("Your final grade is " + finalResult + " CB");

		} else if (finalResult<=90) {
			System.out.print("Your final grade is " + finalResult + " BB");

		} else {
			System.out.print("Your final grade is " + finalResult + " AA");

		}
		scan.close();

	}

}
