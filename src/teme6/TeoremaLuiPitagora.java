//4. Sa se implementeze o metoda care verifica daca 3 numere primite ca parametru verifica teorema lui Pitagora
//(a*a+b*b=c*c)

package teme6;

public class TeoremaLuiPitagora {
	public static void main(String[] args) {
		int a = 0;
		int b = 4;
		int c = 4;

		teoremaPitagora(a, b, c);
		System.out.println(teoremaPitagora(a, b, c));
	}

	private static boolean teoremaPitagora(int a, int b, int c) {
		if (a * a + b * b == c * c) {
			return true;

		} else {
			return false;

		}

	}

}
