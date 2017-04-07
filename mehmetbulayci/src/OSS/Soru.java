package OSS;

public class Soru {
	public void soru1(){
		System.out.println("A dört basamaklý bi sayý,B üç basamakli bir sayýdýr.");
		System.out.println("Buna göre,A.B çarpýmý en az kaç basamaklý olur?");
		System.out.println("A =1000 x B =100 , sonuc = A*B=1000000");
		int A =1000;
		int B =100;
		int sonuc ;
		sonuc = A*B;
		System.out.println("Sonuç:"+ sonuc + "   6 Basamaklý olur");
	
		}
	public void soru2(){
		System.out.println("Üç basamaklý 10 sayýnýn her birinin yüzler basamagýndaki"
				+ "sayý degeri 2 arttýrýlýr,onlar basamagýndaki sayý 4 azaltýlýrsa"
				+ "sayýlarýn toplamý ne kadar artar?");
		int A =100*2;
		int B =-10*4;
		int C = (A+B)*10;
		System.out.println("Cevap:A =100*2 - B =(-10)*4 sonuc=(A+B)*10" + "Sonuc:");
		System.out.print(C);
		}
	public void soru3(){
		
		System.out.println("ABC üç basamaklý Doðal sayýdýr.");
		System.out.println("A = B + 1 ");
		System.out.println("B = 2C+1");
		System.out.println("olduguna göre bu koþullarý saglayan ABC"
				+ "sayýlarýnýn toplamý kactýr");
		int ABC=210;
		int ABC1=431;
		int ABC2=652;
		int ABC3=873;
		int sonuc;
		sonuc = ABC + ABC1 + ABC2 + ABC3;
		System.out.println("ABC=210 + ABC1=431 + ABC2=652 + ABC3:" + sonuc);
	}
	public void soru4(){
		System.out.println("ABC rakanlarý farklý üç basamaklý dogal sayýdýr.");
		System.out.println("A+B+C=7");
		System.out.println("olduguna göre, bu þarta uyan kac farklý ABC"
				+ "sayýsý yazýlabilir?");
		System.out.println("Durum 1 - A=0 + B=1 + C=6 ");
		System.out.println("Durum 2 - A=0 + B=2 + C=5");
		System.out.println("Durum 3 - A=0 + B=3 + C=4");
		System.out.println("Durum 4 - A=1 + B=2 + C=4");
	    System.out.println("Toplam 18 Sayý Yazýlabilir.");
		
		}
	
}

