//8. Sa se implementeze o metoda care afiseaza tabla inmultirii pentru un numar primit ca parametru.6
//Ex: pentru 6:
//6 x 1 = 6
//6 x 2 = 12
//...
//6 x 10 = 60

package teme2;

public class TablaInmultirii {
	public static void main(String[] args) {

		multiplication(6);

	}

	private static void multiplication(int nr) {

		for (int i = 1; i <= 10; ++i) {
			System.out.println(nr + "x" + i + "=" + (nr * i));

		}

	}

}
