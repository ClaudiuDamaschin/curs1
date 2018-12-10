//1. Sa se implementeze o clasa numita Student cu:

// - 3 variabile membru: nume, nota1, nota2
// - 1 constructor cu parametrii nume, nota1, nota2
//- o metoda getMedia care returneaza media pentru un student ca fiind suma notelor / 2
//Sa se implementeze o clasa cu un program care construieste o lista de minim 3 studenti, si afiseaza clasamentul acestora in ordinea mediilor.

package session7;

public class Student {
	private String nume;
	int nota1;
	int nota2;

	public Student(String nume, int nota1, int nota2) {

		this.nume = nume;
		this.nota1 = nota1;
		this.nota2 = nota2;

	}

	public double getMedia() {
		return (nota1 + nota2) / 2.0;

	}

	public String getNume() {

		return nume;
	}

}
