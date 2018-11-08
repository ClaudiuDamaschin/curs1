import java.util.Scanner;

// Sa se implementeze o metoda care verifica daca un numar primit ca parametru este par.

public class Exercitiu1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Adauga un numar: ");
		int nr = in.nextInt();

// pana aici e ok, dar in continuare as vrea sa faci un apel de metoda, ex:
// parSauImpar(nr)
// iar in metoda ar trebui sa bagi cele 5 linii de cod de dedesubt.
// vezi ca in enunt ti se cere o metoda care verifica daca un numar primit ca
// parametru este par

		parSauImpar(nr);

		in.close();
	}

	private static void parSauImpar(int nr) {
		if (nr % 2 == 0)

		{
			System.out.println("Este par");
		} else {
			System.out.println("Impar");

		}
	}
}
