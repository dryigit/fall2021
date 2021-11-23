package math;

public class F01_Math {

	public static void main(String[] args) {
		// 
		
		System.out.println(4*(2+5)/2); //14. first, the result between parentheses (2+5) and then 
										//since * and / are equally important, Java does the * first and then /
		
		System.out.println(4*(2+5)/3); //since the numbers here are int the result will be 9 not 9,333333....
		
		//if we want to give the result with comma
		
		double result=4*(2+5)/3; //9.0 
								// the reason it does not give 9.3333 is that java first does find the value on the right of the equality
								// then assign it to double result. The value of the numbers is 9 because they are int. 
								// then java assigns 9 to doubel result and prints it as 9.0
		
		System.out.println(result); // since we asked for double result, we get 9.0 not 9

		result=(double) 4* (2+5)/3; //we cast a number to double while writing as (double)
		System.out.println(result); //9.333333333333334
		
		
		int num1=5;
		int num2=2;
		double num3=2;
		
		System.out.println(num1/num2); //since both num1 and num2 are int , java gives 2 as the result of the process
		
		System.out.println(num1/num3); // since num3 is double and num1 is int , java gives double result as 2.5
		
		
	}

}
