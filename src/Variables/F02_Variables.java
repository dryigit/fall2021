package Variables;

public class F02_Variables {

	public static void main(String[] args) {
		
		String okul="Yıldız Koleji";
		
		//aynı isim ve değişken türü ile ikinci bir variable oluşturulamaz
		//String okul="Mehmet Koleji";
		
		//farklı data türü de olsa bir aynı isim ile ikinci defa variable oluşturulamaz.
		//int okul=20;
		
		
		//var olan bir variable'a yeni değer atayabiliriz.
		okul="Mehmet Koleji";
		
		
		System.out.println(okul); //Mehmet Koleji
		
		//yazdırma işleminde açıklama eklemek istersek
		//mesela okul adı : Mehmet Koleji yazdıralım
		
		System.out.println("Okul Adı: " + okul); //Mehmet Koleji
		
		System.out.println("Okul Adı: " + "okul"); //Okul Adı: okul
		
		
		
		
		
	}

}
