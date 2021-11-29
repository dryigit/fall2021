package variables;

public class Q01 {

	public static void main(String[] args) {
		// Write a Java program to break an integer into a sequence of individual digits.
		// Hint: use / and %
		// ex: input: 12345
		//		    output: 1
		//		            2
		//		            3
		//		            4
		//		            5

		
		int num=12345;
		int num1=num%10;
		int num2=(num/10)%10;
		int num3=(num/100)%10;
		int num4=(num/1000)%10;
		int num5=num/10000;

		
		System.out.print(num5 + "\n"+ num4 + "\n"+num3+ "\n"+num2+ "\n"+num1);

	}

}
