package forLoop;

public class Q12 {
public static void main(String[] args) {
	//type all integers from from 11 to 44 in the same line with a space between consecutive integers.
	
	for( int i=11 ; i<45  ;i++ ){
		System.out.print(i + " ");
	}
	System.out.println();
	//type all integers from from 44 to 11 in the same line with a space between consecutive integers.
	
	for( int i=44 ; i>=11  ;i-- ){
		System.out.print(i + " ");
	}
	System.out.println();
	
	//type all even integers from from 11 to 120 in the same line with a space between consecutive integers.
	System.out.println();
	System.out.println("all even integers from from 11 to 120 in the same line");
	for (int i=11  ; i<121     ; i++){
		if (i%2==0){
			System.out.print (i + " ");
		}
		
	}
	
	//type all odd integers from from 120 to 11 in the same line with a space between consecutive integers.
	System.out.println("\n");
	System.out.println("all odd integers from from 120 to 11 in the same line");
	for(  int i=120   ;i>10    ; i--){
		if (i%2==1){
			System.out.print(i + " ");
		}
		
	}
	System.out.println("\n");
	System.out.println("all integers which are divisible by 4 and 6 from 120 to 11");
	//type all integers which are divisible by 4 and 6 from 120 to 11 in the same line with a space between consecutive integers.
	for(int i=120 ; i>10    ; i--  ){
		if(i%4==0 && i%6==0){
			System.out.print(i + " ");
		}
	}
	
	//convert "Java" to "J*a*v*a*"
	System.out.println("\n");
	System.out.println("Convert Java to J*a*v*a*");
	String str="Java";
	for( int i=0; i<str.length(); i++ ){
		System.out.print(str.charAt(i)+"*");
		
	}
}
	
}
