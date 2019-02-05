//5. Sa se implementeze o metoda care primeste ca parametru un sir de numere cu un numar par de elemente si compara suma elementelor

//din prima jumatate cu suma elementelor din a doua jumatate si returneaza un enum cu valorile posibile (LEFT, RIGHT, MIDDLE)
//Daca suma elementelor din prima jumatate e mai mare decat suma elementelor din a doua jumatate returneaza LEFT
//Daca suma elementelor din prima jumatate e mai mica decat suma elementelor din a doua jumatate returneaza RIGHT
//Daca suma elementelor din prima jumatate e egala cu suma elementelor din a doua jumatate returneaza MIDDLE

package teme6;

public class Exercitiu5 {
	public enum Directie {
		LEFT, RIGHT, MIIDLE;
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6 };

		comparaSuma(array);
	}

	private static void comparaSuma(int[] array) {
		int i, sum = 0;
		for (i = 0; i < array.length; i++) {
			sum = sum + array.length;
			System.out.println();
		}
	}
}