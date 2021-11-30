package scanner;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		/*
		Take the user's weight and height
		Write a program that calculates the body mass index.
		Hint: Body Mass Index (BMI) = Body Weight (kg.) / Height squared (m.)
		SAMPLE:
		INPUT : Weight: 71
		Height: 1.72
		OUTPUT: Your Body Mass Index: 23
		*/
		
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Enter your weight");
		double weight=scan.nextDouble();
		
		System.out.println("Enter your height");
		double height=scan.nextDouble();
		
		height =height /100;
		
		double bmi=weight/ (height*height);
		System.out.println("Your BMI is: "+bmi);

		scan.close();
		
	}

}
