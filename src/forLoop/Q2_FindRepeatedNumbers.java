package forLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q2_FindRepeatedNumbers {

	public static void main(String[] args) {
				// Ask the user to enter a set of numbers and a single digit,
				// then check how many times the digit is repeated in the set using loops.

		Scanner scan =new Scanner (System.in);
		System.out.println("Please type the number");
		String num=scan.next();
		
		System.out.println("Please type the number you want to check");
		String numCheck=scan.next();
		
		String numArr[]= num.split("");
		System.out.println("The array is "+ Arrays.toString(numArr));
		
		int count=0;
		List<String> newList=new ArrayList<>();
		
		for (int i = 0; i < numArr.length; i++) {
			if(numArr[i].contains(numCheck)) {
				count++;
				newList.add(numCheck);
				
			}
		}
		System.out.println("The number of accurence = "+ count);
		System.out.println("The repeated numbers: "+ newList);
		
		scan.close();
	}

}
