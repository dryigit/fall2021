package forLoop;

public class printUniqueCharacters {
public static void main(String[] args) {
	/*
	type cope to print  unique characters on the console
	 */
	
	String s1= "Anna Maria";
	
	for (int i=0; i<s1.length();  i++ ){
	
		char c=s1.charAt(i);
		if (s1.indexOf(c)==s1.lastIndexOf(c)){
			System.out.print(s1.charAt(i));
		}
		
	}
}
}
