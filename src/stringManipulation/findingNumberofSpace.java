package stringManipulation;

public class findingNumberofSpace {
public static void main(String[] args) {
	//type code to find the number of space characters in a String
	
	String str1="John went to the 2 school";
	
	String str2= str1.replaceAll("[\\S]","");
	
	System.out.println(str2.length());
	
}
}
