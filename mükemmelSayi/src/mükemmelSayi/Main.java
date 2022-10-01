package mükemmelSayi;

public class Main {

	public static void main(String[] args) {
		
		
		//kendisini bölen sayıların toplamına eşit olan sayılara mükemmel sayı denir.
		
		int number = 28;
		int total = 0;
		
		//döngümüzü yazarız. 0'a bölünme olmadığı için 1 den başlatırız. İ seçtiğimiz sayı olan number'dan küçük olmalı.
		//eğer number i'ye bölünür ve 0 kalırsa total = total+i olur total'e de 0'ı atamıştık.
		
		for(int i=1;i<number;i++) {
			if(number % i == 0) {
				total = total + i ;
				
			}
		}

		if(total == number) {
			System.out.println("Mükemmel sayıdır.");
		}else {
			System.out.println("Mükemmel sayı değildir.");
		}
	}

}
