package stringManipulation;

public class equalsIgnoreCase {

	public static void main(String[] args) {
		String str1="john";
		String str2="klain";
		String str3= "John Klain";
		String str4=str1+" "+str2;
		
		System.out.println(str4);//John Klain
		System.out.println(str3==str4); //false
		System.out.println(str3.equals(str4)); // false
		
		System.out.println(str3.equalsIgnoreCase(str4)); //true because the content is similar and it is not case sensitive
		
	}

}
