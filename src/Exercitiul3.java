//Sa se implementeze o metoda care returneaza media aritmetica a numerelor dintr-un sir de numere primit ca parametru.

public class Exercitiul3 {

	public static void main(String[] args) {

		int[] array = { 10, 26, 38, 42, 51 };

		System.out.println(mediaAritmetica(array));

		int suma = mediaAritmetica(array);

		int media = suma / array.length;

	}

	private static int mediaAritmetica(int[] array) {
		int suma = 0;
		for (int i = 0; i < array.length; i++) {
			suma = suma + array[i];
		}
		return media;
	}
}
