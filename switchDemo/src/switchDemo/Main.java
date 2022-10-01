package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'D';
		// girilen notu A olarak seçtiğimiz için çalıştırırsak mükemmel geçtiniz yazar
		// ama char grade'de atadığımız notu değiştirebiliriz.
		// a b c d f notları dışında bir not girildiğinde geçersiz not girdiniz uyarısı
		// gelecek.
		switch (grade) {
		case 'A':
			System.out.println("Mükemmel : Geçtiniz");
			break;
		case 'B':
			System.out.println("Çok Güzel : Geçtiniz");
			break;
		case 'C':
			System.out.println("İyi : Geçtiniz");
			break;
		case 'D':
			System.out.println("Fena Değil : Geçtiniz");
			break;
		case 'F':
			System.out.println("Maalesef Kaldınız");
			break;
		default:
			System.out.println("Geçersiz not girdiniz");

		}
	}

}
