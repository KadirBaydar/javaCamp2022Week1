package conditionals;

public class Main {

	public static void main(String[] args) {
		int sayi = 14 ;
		if (sayi<20) {
			System.out.println("Sayı 20'den küçüktür");
		}
			
		if (sayi<15) {
			System.out.println("Sayı 15'ten küçüktür");
		}
		
		int sayi2=21;
		if (sayi2<20) {
			System.out.println("Sayı 20'den küçüktür");
		}else {
			System.out.println("Sayı 20'den küçük değildir.");
		}
		
		int sayi3=20;
		if(sayi3<20) {
			System.out.println("Sayı 20'den küçüktür.");
		}else if(sayi3==20) {
			System.out.println("Sayı 20'ye eşittir.");
		}else {
			System.out.println("Sayı 20'den büyüktür.");
		}

	}

}
