package OSS;

public class Soru {
	public void soru1(){
		System.out.println("A d�rt basamakl� bi say�,B �� basamakli bir say�d�r.");
		System.out.println("Buna g�re,A.B �arp�m� en az ka� basamakl� olur?");
		System.out.println("A =1000 x B =100 , sonuc = A*B=1000000");
		int A =1000;
		int B =100;
		int sonuc ;
		sonuc = A*B;
		System.out.println("Sonu�:"+ sonuc + "   6 Basamakl� olur");
	
		}
	public void soru2(){
		System.out.println("�� basamakl� 10 say�n�n her birinin y�zler basamag�ndaki"
				+ "say� degeri 2 artt�r�l�r,onlar basamag�ndaki say� 4 azalt�l�rsa"
				+ "say�lar�n toplam� ne kadar artar?");
		int A =100*2;
		int B =-10*4;
		int C = (A+B)*10;
		System.out.println("Cevap:A =100*2 - B =(-10)*4 sonuc=(A+B)*10" + "Sonuc:");
		System.out.print(C);
		}
	public void soru3(){
		
		System.out.println("ABC �� basamakl� Do�al say�d�r.");
		System.out.println("A = B + 1 ");
		System.out.println("B = 2C+1");
		System.out.println("olduguna g�re bu ko�ullar� saglayan ABC"
				+ "say�lar�n�n toplam� kact�r");
		int ABC=210;
		int ABC1=431;
		int ABC2=652;
		int ABC3=873;
		int sonuc;
		sonuc = ABC + ABC1 + ABC2 + ABC3;
		System.out.println("ABC=210 + ABC1=431 + ABC2=652 + ABC3:" + sonuc);
	}
	public void soru4(){
		System.out.println("ABC rakanlar� farkl� �� basamakl� dogal say�d�r.");
		System.out.println("A+B+C=7");
		System.out.println("olduguna g�re, bu �arta uyan kac farkl� ABC"
				+ "say�s� yaz�labilir?");
		System.out.println("Durum 1 - A=0 + B=1 + C=6 ");
		System.out.println("Durum 2 - A=0 + B=2 + C=5");
		System.out.println("Durum 3 - A=0 + B=3 + C=4");
		System.out.println("Durum 4 - A=1 + B=2 + C=4");
	    System.out.println("Toplam 18 Say� Yaz�labilir.");
		
		}
	
}

