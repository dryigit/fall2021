package forLoop;

public class asterix3 {
public static void main(String[] args) {
	/*
	Write a program to print following :
    *
   **
  ***
 ****
*****
	
	 */
	
	
	for (int i=0; i<6; i++){
		for (int k=5; k>i; k--){
			System.out.print(" ");
		}
		for (int j=0; j<i; j++){
			System.out.print("*");
		}
		System.out.println();
	}
	
}
}
