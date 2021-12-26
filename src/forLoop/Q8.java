package forLoop;

public class Q8 {
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
	
	
	for (int raw=1; raw<=5; raw++){
		for (int space=5; space>=raw; space--){
			System.out.print(" ");
		}
		for (int star=1; star<=raw; star++){
			System.out.print("* ");
		}
		System.out.println();
		
	}
}
}
