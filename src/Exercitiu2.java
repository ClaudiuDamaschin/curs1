//2. Sa se implementeze o metoda care returneaza numarul minim dintr-un sir de numere primit ca parametru.

public class Exercitiu2 {
	public static void main(String[] args) {

		int array[] = { 4, 10, 9, 7, 8 };
		int min = minimul(array);
		System.out.println(minimul(array));

	}

	private static int minimul(int[] array) {
		int valMinima = array[0];
		for (int i = 1; i < array.length; i++) {

			if (array[i] < valMinima) {
				valMinima = array[i];

			}
		}
		return valMinima;

	}
}
