//6. Sa se implementeze o metoda care primeste ca parametru un sir de numere si returneaza sirul respectiv inversat

package teme2;

public class Inverted {
	public static void main(String[] args) {

		int[] a = { 5, 8, 1, 2 };
		inverted(a);
	}

	private static void inverted(int[] a) {
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i]);
		}

	}

}
