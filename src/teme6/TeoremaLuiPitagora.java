package teme6;

public class TeoremaLuiPitagora {
	public static void main(String[] args) {
		int a = 5;
		int b = 1;
		int c = 3;

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
