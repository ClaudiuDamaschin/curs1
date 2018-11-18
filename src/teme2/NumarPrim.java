//Sa se implementeze o metoda care verifica daca un numar primit ca parametru este prim. 
//Un numar prim se divide exact doar cu 1 si cu el insusi.

package teme2;

public class NumarPrim {
	public static void main(String[] args) {

		int num = 12;
		boolean flag = false;
		isPrime(num, flag);
	}

	private static void isPrime(int num, boolean flag) {
		for (int i = 2; i <= num / 2; ++i) {

			if (num % i == 0) {
				flag = true;
				break;
			}
		}

		if (!flag)
			System.out.println(num + " Este un numar prim.");
		else
			System.out.println(num + " Nu este un numar prim.");
	}
}