package arkadasSayilar;

public class Main {

	public static void main(String[] args) {
		
		int sayi1=220;
		int sayi2=284;
		int toplam1=0;
		int toplam2=0;
		
		for (int i=1;i<sayi1;i++) {
			if(sayi1%1==0) {
				toplam1 = toplam1 +i;
				
			}
		}

		for(int i=1;i<sayi2;i++) {
			if(sayi2%i==0) {
				toplam2 = toplam2 +i;
				
			}
		}
		
		// && and operatörü iki koşulunda tutması gerekiyor demek
		// || bu da or operatörü ikisinden birisinin olması yeter anlamına gelir.
		
		if(sayi1==toplam2 && sayi2==toplam1) {
			System.out.println("bu iki sayı arkadaştır");
		}else {
			System.out.println("Bu iki sayı arkadaş değildir.");
		}
	}

}
