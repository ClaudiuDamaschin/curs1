//4.	Sa se implementeze o metoda care calculeaza cel mai mic multiplu comun (cmmmc) a doua numere 
//a si b primite ca parametru. cmmmc este cel mai mic numar care se imparte exact la a si b.

package teme2;

public class Cmmc {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		cmmmc(a, b);

	}

	private static void cmmmc(int a, int b) {
		int cmmmc;

		cmmmc = (a > b) ? a : b;

		while (true) {
			if (cmmmc % a == 0 && cmmmc % b == 0) {
				System.out.printf("CMMMC al numerelor %d si %d este %d.", a, b, cmmmc);
				break;
			}
			++cmmmc;
		}
	}
}
