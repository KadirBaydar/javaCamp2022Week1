package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		// 25 asal mı değil mi onu arayacağız

		int number = 25;
		int remainder = number % 2;
		System.out.println(remainder);

		boolean isPrime = true;

		// isPrime asal sayı mı anlamına geliyor.

		// herkesin kendine göre bir algoritması olabilir.

		if (number == 1) {
			System.out.println("Sayı asal değildir.");
			return;
			// return sayı 1'se devamındaki komutlara hiç ilerlememesini sağlıyor. Yazmazsak
			// sonraki döngülere yine de girer.

		}

		if (number < 1) {
			System.out.println("Geçersiz sayı.");
		}

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}
			// Üstte diyorki: number yani 25, 2 den 24'e kadar olan sayılardan birilerine
			// tam bölünürse 25 asal değildir. Asal sayı kuralı 2 den başladığı için i'yi
			// 2'den başlattık.
		}

		if (isPrime) {
			System.out.println("Sayı Asaldır.");

		} else {
			System.out.println("Sayı Asal Değildir.");
		}

	}

}
