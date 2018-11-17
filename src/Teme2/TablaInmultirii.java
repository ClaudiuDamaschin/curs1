//8. Sa se implementeze o metoda care afiseaza tabla inmultirii pentru un numar primit ca parametru.
//Ex: pentru 6:
//6 x 1 = 6
//6 x 2 = 12
//...
//6 x 10 = 60

package Teme2;

public class TablaInmultirii {
	public static void main(String[] args) {
		int nr = 6;

		System.out.println(multiplication(nr));

	}

	private static int multiplication(int nr) {
		for (int i = 1; i <= 10; ++i) {

			System.out.prinln("%d * %d = %d \n", nr, i, nr * i);

		}

	}

}
