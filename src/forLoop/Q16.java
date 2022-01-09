package forLoop;

import stringManipulation.length;

public class Q16 {
public static void main(String[] args) {
	
	/*
	type "helo world" 10 times
	 */
	
	String str="Hello World";
	
	for (int i = 0; i < 10; i++) {
		System.out.println(str);
	}
	
	
	/*
	print the given sentence in reverse
	 */
	
	String s1="Hello this is a great world";
	
	for (int i =s1.length()-1; i >=0; i--) {
		System.out.print(s1.charAt(i));
	}
}
}
