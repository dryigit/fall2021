package variables;

public class F03_Variables {



		public static void main(String[] args) {
			int sayi1= 10;
			int sayi2= 20;
			
			String sayi3="10";
			String sayi4="20";
			
			System.out.println(sayi1+sayi2); //30
			System.out.println(sayi3+sayi4); //1020
			
			//Fartklı data türleri aynı değeri alabilir.
			//burada önemli olan bu değişkenleri değişken türüne göre işlem yapabileceğimdir. 
			String harf1="A";
			char harf2='A';
			
			
			//yukarıdaki değişkenleri kullanarak 30A yazdırın
			
			System.out.println(sayi1+sayi2+harf1); //30A
			System.out.println(sayi1+sayi2+harf2); //95
			
			//CHAR EKSTRA ÖZELLİĞİ SEBEBİYLE matematiksel işlemlerde numerik değer alır. 
			
			System.out.println(harf1+sayi1+sayi2); //A1020
			System.out.println(sayi1+harf1+sayi2); //10A20
			System.out.println(harf1+(sayi1+sayi2)); //A30

			@SuppressWarnings("unused")
			int sayi =10;
			int a=10;
			int b=20;
			a=b;
			System.out.println(a+b);
			
		
			
		}

	}
