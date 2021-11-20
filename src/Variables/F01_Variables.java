package Variables;

public class F01_Variables {

	public static void main(String[] args) {
		//variable oluşturmak ve değer atamak farklı işlemlerdir. 
				//istersek  variable oluşturma ve değer atamayı tek satırda yapabiliriz. 
				
				String ogrenciIsim ="Celal";
				
				System.out.println(ogrenciIsim); //Celal
				
				//istersek de önce oluşturur, istediğimiz zaman da değer atayabiliriz.
				int sayi;
				sayi=10;
				
				System.out.println(sayi);//10
				
				//biz daha önce oluşturulmuş ve değer ataması yapılmış bir değişkene 
				//yeni değer atayabiliriz. 
				//bu durumda java variable'in eski değerini silip yeni değeri variale'a atar.
				sayi=25;
				System.out.println(sayi);//25
				
				ogrenciIsim="Mustafa";
				
				System.out.println(ogrenciIsim); //Mustafa

	}

}
