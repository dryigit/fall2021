package forLoop;

public class Q4 {
public static void main(String[] args) {
	//Print the numbers from 100 to 0, divisible by 13, and their sums (from largest to smallest).
	
	int num= 0;
	
	for (int i = 100; i >0; i--){
		if (i%13==0){
			System.out.println(i + " can be divided equally by 13");
			num=num+i;
			
		}
		
	}System.out.println("The total of numbers from 100 to 0 that can be divided equally by 13 is ;"+num);
}
}
