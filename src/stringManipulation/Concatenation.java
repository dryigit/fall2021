package stringManipulation;

public class Concatenation {

	public static void main(String[] args) {
		
		String name= "John";
		String surname= "Jone";
		
		System.out.println(name.concat(surname)); // JohnJone
		
		System.out.println(name.concat(" ".concat(surname))); //John Jone


	}

}
