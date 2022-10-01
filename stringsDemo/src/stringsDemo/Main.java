package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		System.out.println(mesaj);

		System.out.println("--------------------------");

		System.out.println("Eleman sayısı = " + mesaj.length());
		// mesaj.lenght()=> mesaja atadığımzı içeriğin karakter sayısını verir. Nokta vs
		// ve boşluklarda karakter sayılır.

		System.out.println("--------------------------");

		System.out.println("5.eleman = " + mesaj.charAt(4));
		// mesaj.charAt(4)=> mesajdaki 5.karakteri yani indekse göre 4.karakteri verir.

		System.out.println("--------------------------");

		System.out.println(mesaj.concat(" Yaşasın!"));
		// concatta mesaja atadığımız değişkene ekleme yapar.

		System.out.println("--------------------------");

		// startsWith("B") b ile başlıyor mu demek eğer b ile başlıyorsa true döner
		// başka bir karakter ile başlıyorsa false döner. Büyük küçük harf duyarlılığı
		// vardır.
		System.out.println(mesaj.startsWith("B"));
		System.out.println(mesaj.startsWith("A"));

		System.out.println("--------------------------");

		// endsWith(".") nokta ile mi bitiyor diyor eğer nokta ile bitiyorsa true döner
		// başka bir şeyle bitiyorsa false döner. Büyük küçük harf duyarlılığı vardır.
		System.out.println(mesaj.endsWith("."));
		System.out.println(mesaj.endsWith("H"));

		System.out.println("--------------------------");

		// mesaj.getcharsla seçtiğimiz kısmı alabiliyoruz aşağıda yazdığımız kodla ilk 5
		// karakteri almış olduk. tabi bunun için yeni char açıyoruz en başta.

		char[] karakterler = new char[5];

		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);

		System.out.println("--------------------------");

		// alttaki indexOf a karakterinin kaçıncı karakter olduğunu verir. İlk bulduğu a
		// yı söyler. UNUTULMAMASI LAZIM BOŞLUKLARDA BİRER KARAKTERDİR. indexOf("av")
		// şeklinde kelime grubu olarakta aratabiliriz.

		System.out.println(mesaj.indexOf("a"));

		System.out.println("--------------------------");

		// lastIndexOf("a")'da en sağdaki a'nın sırasını soldan başlayarak sayar ve
		// sırasını söyler. Yani sayma işini soldan yapar.

		System.out.println(mesaj.lastIndexOf("a"));

		System.out.println("--------------------------");

		// mesaj.replace('a','A') komutunda da mesaja atadığımız değişken içerisindeki
		// küçük a ları büyük A ile değiştir demek anlamına geliyor. ama bu komut sadece
		// böyle yazarsak çalışır tekrardan system.out.println(mesaj) yazarsak hiç
		// değişmemiş halini yazacaktır.

		System.out.println(mesaj.replace('a', 'A'));

		// ama replace ile değiştirdiğimiz değişkeni farklı bir stringe atayabiliriz.

		String yeniMesaj = mesaj.replace('a', 'A');
		System.out.println(yeniMesaj);

		System.out.println("--------------------------");

		// mesaj.substring(2) demek 2.indexten itibaren kes ve yaz. yani 2.index g harfi
		// olduğu için "gün hava çok güzel" yazacaktır.

		System.out.println(mesaj.substring(2));

		// alttaki 2.indexten 5.indexe kadar kes komutu

		System.out.println(mesaj.substring(2, 5));
		
		System.out.println("--------------------------");

		// aşağıda da split komutuyla ayırma yapıyoruz iç kısmına boşluk koyduğumuz
		// içinden her boşluğa gelince önündeki ve arkasındaki karakterleri ayırıp alt
		// alta yazıyor.

		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
			
			System.out.println("--------------------------");

			// harfleri küçültmek veya büyütmek için kullandığımız komut.
			
			System.out.println(mesaj.toLowerCase());
			System.out.println(mesaj.toUpperCase());
			
			//başka bir kaynaktan veri aldığımızda aralarda boşluk varsa onları kaldırmak için alttaki komutu kullanırız.
			
			System.out.println(mesaj.trim());

		}

	}

}
