package teme1;

//Sa se implementeze o metoda care returneaza cate numere negative se gasesc intr-un sir de numere primit ca parametru.

public class Exercitiul5 {
	public static void main(String[] args) {
		int array[] = { 7, -5, -5, -7, 2 };
		System.out.println(numereNegative(array));

	}

	private static int numereNegative(int[] array) {
		int negative = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0) {
				negative++;
			}

		}
		return negative;
	}

}
