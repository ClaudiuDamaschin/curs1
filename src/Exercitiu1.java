import java.util.Scanner;

// Sa se implementeze o metoda care verifica daca un numar primit ca parametru este par.

public class Exercitiu1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Adauga un numar ");
		int nr = in.nextInt();

		if (nr % 2 == 0) {
			System.out.println("Este par");
		} else {
			System.out.println("Nu este numar par!!!");
		}

		in.close();
	}
}
