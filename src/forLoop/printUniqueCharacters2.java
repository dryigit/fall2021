package forLoop;

public class printUniqueCharacters2 {
public static void main(String[] args) {
	
		/*
	type cope to print  unique characters on the console
	 */
		
		String str="Hello this is a test sentence where spaces are not unique";
		
		for(int i=0; i<str.length(); i++){
			
			char c=str.charAt(i);
			if (str.indexOf(c)==str.lastIndexOf(c)){
				System.out.print(c);
			}
			
		}
}
}
