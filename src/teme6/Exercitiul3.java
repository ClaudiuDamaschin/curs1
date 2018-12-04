//Sa se implementeze o metoda care primeste ca parametru un sir de numere si returneaza cate perechi de numere din sir
//au suma egala cu 10
//Ex: {1,3,5,6,7,8,9} => 2

package teme6;

public class Exercitiul3 {
	private static final int Number = 10;

	public static void main(String[] args) {
		int[] array = { 1, 3, 5, 6, 7, 8, 9 };

		sum(array);
	}

	private static void sum(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i] + array[j] == Number) {
					System.out.println(array[i] + "+" + array[j] + "=" + Number);
				}

			}
		}

	}
}
