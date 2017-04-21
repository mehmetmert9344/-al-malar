package rekürsifÖdev;

import java.util.Scanner;

public class rekürsif1 {
public static void main(String[] args) {
	Scanner oku = new Scanner(System.in);
int a = oku.nextInt();
try{
	if (a == 0) {
		throw new NumberFormatException("a Sýfýr Olmamalý.");
	} else {
		int toplam = 0;
		for (int i = 1; i <= a; i++) {
			toplam += i;
			System.out.println("i:" + i);
		}
	System.out.println("sonuc:"+ toplam);
	}
	
	}catch (Exception e) {
		System.out.println(e.getMessage());
	}
	
}
	

}
