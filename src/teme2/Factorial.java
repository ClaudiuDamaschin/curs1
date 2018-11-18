//Sa se implementeze o metoda care returneaza factorialul unui numar n primit ca parametru.

package teme2;

public class Factorial {
	public static void main(String[] args) {

		int fact = 1;
		int number = 20;
		calcululFactorial(fact, number);
	}

	private static int calcululFactorial(int fact, int number) {
		int i;
		for (i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial din " + number + " este: " + fact);
		return fact;
	}

}
