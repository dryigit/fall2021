package forLoop;

public class asterix2 {

public static void main(String[] args) {
	
	/*
	Write a program to print following :
*
**
***
****
*****
	
	 */
	
	for (int i = 1; i <6; i++){
		for (int j = 1; j <=i; j++){
			System.out.print("*");
		}
		System.out.println();
	}
	
}
}
