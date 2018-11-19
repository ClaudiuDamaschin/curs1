package teme2;

public class FirstAppearances {
	public static void main(String[] args) {
		int a[] = { 5, 9, 1, 3, 4, 10, 2, 7 };
		int n = 8;
		System.out.println(searchNumber(a, n));
	}

	private static int searchNumber(int[] a, int n) {
		int counter = 0;

		for (int i = 0; i < a.length; i++) {
			counter++;

			if (a[i] == n) {
				if (counter == a.length) {
					return -2;
				} else {
					return a[++i];
				}
			}

		}
		return -1;
	}
}
