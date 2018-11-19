package teme2;

public class Palindrome {
	public static void main(String[] args) {
		int nr = 444;
		verificaPalindrom(nr);

	}

	private static void verificaPalindrom(int nr) {
		int r;
		int sum = 0;
		int temp;

		temp = nr;
		while (nr > 0) {
			r = nr % 10;
			sum = (sum * 10) + r;
			nr = nr / 10;
		}
		if (temp == sum)
			System.out.println("Numar Palindrom ");
		else
			System.out.println("Nu este Palindrom");
	}

}
