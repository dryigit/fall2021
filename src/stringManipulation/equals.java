package stringManipulation;

public class equals {

	public static void main(String[] args) {
		

		String name="John";
		String name2="John";
		System.out.println(name.equals(name2)); //true
		
		String name3="South";
		System.out.println(name.equals(name3)); // false
		
		
		int a=10;
		int b=a+0;
		System.out.println(a==b); //true
		
		String str1="John";
		String str2="Klain";
		String str3= "John Klain";
		String str4=str1+" "+str2;
		System.out.println(str4);//John Klain
		System.out.println(str3==str4); //false because the values are similar but they are different objects
		System.out.println(str3.equals(str4)); // true because .equals only looks for the value not references.
			

	}

}
