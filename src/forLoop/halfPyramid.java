package forLoop;

public class halfPyramid {
public static void main(String[] args) {
	
	/*
        1
        2 3 2
        3 4 5 4 3
        4 5 6 7 6 5 4

Create a program that prints the half pyramid shape above as many as the number of lines entered by the user.
         */
	
	
	for (int i = 1; i <= 4; i++) {
		System.out.print(i+" ");
		for (int j = 1; j < i; j++) {
			System.out.print(i+j+" ");
		}
		for (int k = i+i-2; k > i-1; k--) {
			System.out.print(k+" ");
		}
		System.out.println();
	}
}
}
