package forLoop;

public class Q5 {
public static void main(String[] args) {
	
	// print the number below as it is seen
	//        1
	//        2 6
	//        3 7 10
	//        4 8 11 13
	//        5 9 12 14 15
	
	for (int i = 1; i <=5; i++){
		
		for (int j = 1; j <= i; j++){
			if (j==1){
				System.out.print(i+" ");
			} else if (j==2){
				System.out.print(i+j+2+" ");
			} else if (j==3){
				System.out.print(i+j+4+" ");
			} else if (j==4){
				System.out.print(i+j+5+" ");
			} else if (j==5){
				System.out.println(i+j+5+" ");
			}
		}
		System.out.println();
	}
}
}
