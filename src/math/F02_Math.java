package math;

public class F02_Math {

	public static void main(String[] args) {


		int num1=10;
		int num2=20;
		
		String strg1="John";
		@SuppressWarnings("unused")
		String strg2="Seul";
		
		System.out.println(num1 + num2 + strg1); //30John //Java starts from left to right. it first gets the sum of num1 and num2 then add strg1
		
		System.out.println(strg1+num1+num2); //John1020 //since the first element strg1 is string, java writes it and then add the num1 making it John10.
											//at this point this is a string and then when java see num2, it adds num2 as a string after 10 

		System.out.println(strg1+ (num1+num2)); //John30 // in order to get the sum of the numbers, we write the numbers inside brackets. 
		
		System.out.println(strg1+num1*num2);//John200 // java first does the multiplication and then does the other operations. 
	}

}
