package reCapDemo2;

public class Main {

	public static void main(String[] args) {
		double[] myList = { 2.8, 4.6, 1.5, 3.4 };
		double total = 0;
		double max = myList[0];
		for (double number : myList) {
			if (max < number) {
				max = number;

			}
			total = total + number;
			System.out.println(number);
		}

		System.out.println("Toplam = " + total);
		System.out.println(" En Büyük = " + max);
	}

}
