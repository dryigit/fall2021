package stringBuilder;

public class Q1 {

	public static void main(String[] args) {
			// Question : Let's do 1000 times with the for loop.
			// Let's check the time before and after and compare the performances of StringBuilder and String classes.
			//Hint: long TimeSb = System.nanoTime(); let's use
				
				@SuppressWarnings("unused")
				String str="Hello";
				StringBuilder sb = new StringBuilder("Hello");
				sb.trimToSize(); //Reduces capacity to length
				
				
				//for string
				
				long time1=System.nanoTime();
				
				for (int i = 0; i < 1000; i++) {
					str+=" ";
				}
				
				long time2=System.nanoTime();
				
				long stringSure=time2-time1;
				
				
				//for StringBuilder
				
				long time3=System.nanoTime();
				
				for (int i = 0; i < 1000; i++) {
					sb.append(" ");
				}
				
				long time4=System.nanoTime();
				
				long sbSure=time4-time3;
				
				if (sbSure>stringSure) {
					System.out.println("String is faster");
				} else {
					System.out.println("StringBuilder is faster");
				}
				
				System.out.println(stringSure/sbSure);
				System.out.println("String time " + stringSure);
				System.out.println("StringBuilder time " + sbSure);


	}

}
