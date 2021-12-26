package forLoop;

public class Q7 {
public static void main(String[] args) {
	/*
     Write a code where you can create a pyramid with asterisks (*).
            The result should be like this;

                   *
                  * *
                 * * *
                * * * *
               * * * * *
     */
	int row=5;
	for (int i = 1; i <= row; i++) {
		if (i == 1) {
			System.out.print("    *    ");
			System.out.println();
		} else if(i==2){
			System.out.print("   * *   ");
			System.out.println();
		} else if(i==3){
			System.out.println("  * * *  ");
		} else if(i==4){
			System.out.println(" * * * * ");
		}else {
			System.out.println("* * * * *");
		}
		
	}
	
}
}
