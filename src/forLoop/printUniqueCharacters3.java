package forLoop;

public class printUniqueCharacters3 {

public static void main(String[] args) {
	
	/*
	type cope to print  unique characters on the console
	 */
	
	String str="Welcome to the Java world!";
	
	for(int i=0; i<str.length(); i++) {
		char c= str.charAt(i);
		if(str.indexOf(c)==str.lastIndexOf(c)){
			System.out.print(c);
		}
	}
	
}
}
