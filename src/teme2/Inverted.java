//6. Sa se implementeze o metoda care primeste ca parametru un sir de numere si returneaza sirul respectiv inversat

package teme2;

public class Inverted {
	public static void main(String[] args) {

		int[] a = { 5, 8, 1, 2 };
		int[] b = { 2, 1, 8, 5 };

		inverted(a, b);

	}

	private static int[] inverted(int[] a, int[] b) {

		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i]);
		}
		return b;
	}
}
