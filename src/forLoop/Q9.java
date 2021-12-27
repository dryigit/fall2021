package forLoop;

public class Q9 {
public static void main(String[] args) {
	/*
	A
	A B
	A B C
	A B C D
	A B C D E
	A B C D E F

	*/
	
	char letter=65;
	for (letter=65; letter<71; letter++){
		for (char i='A'; i<letter; i++) {
			
				System.out.print(i + " ");
			
				
		}
		System.out.println(letter);
	}
	
}
}
