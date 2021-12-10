package stringManipulation;

public class length {

	public static void main(String[] args) {
		

		String name="Linda";
		System.out.println(name.length()); //the number of characters in the string.
		
		System.out.println(name.length()-1); //last index of the string.
		
		String name2="Christmas";
		System.out.println(name2.length()); //9 characters
		System.out.println(name2.length()-1); //8 last index of name2
		
		System.out.println(name.charAt(name.length()-1)); //the last character of the name is a
		System.out.println(name2.charAt(name2.length()-1)); // the last character of the name2 is s
		

	}

}
