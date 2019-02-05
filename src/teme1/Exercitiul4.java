package teme1;

//Sa se implementeze o metoda care returneaza produsul numerelor nenule dintr-un sir de numere primit ca parametru.

public class Exercitiul4 {
	public static void main(String[] args) {
		int array[] = { 2, 5, 6, 7, 9, 8 };
		System.out.println(productNumber(array));
		productNumber(array);
	}

	private static int productNumber(int[] array) {
		int product = 1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				continue;
			}
			product *= array[i];
		}
		return product;
	}

}
