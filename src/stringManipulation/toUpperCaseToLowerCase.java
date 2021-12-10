package stringManipulation;

public class toUpperCaseToLowerCase {

	public static void main(String[] args) {
		

		String name="jOHN";
		System.out.println(""+name.toUpperCase().charAt(0)
							 +name.toLowerCase().charAt(1)
							 +name.toLowerCase().charAt(2)
							 +name.toLowerCase().charAt(3)); //John
		
		System.out.println(name.toLowerCase()); //john
		System.out.println(name.toUpperCase()); //JOHN               

		

	}

}
