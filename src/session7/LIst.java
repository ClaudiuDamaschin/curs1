//1. Sa se implementeze o clasa numita Student cu:

// - 3 variabile membru: nume, nota1, nota2
// - 1 constructor cu parametrii nume, nota1, nota2
//- o metoda getMedia care returneaza media pentru un student ca fiind suma notelor / 2
//Sa se implementeze o clasa cu un program care construieste o lista de minim 3 studenti, si afiseaza clasamentul acestora in ordinea mediilor.

package session7;

public class LIst {
	public static void main(String[] args) {
		Student student1 = new Student("Andrei", 6, 7);
		Student student2 = new Student("Petre", 5, 6);
		Student student3 = new Student("Alin", 4, 3);
		Student student4 = new Student("Ionut", 8, 9);
		Student student5 = new Student("Vasile", 10, 10);
		Student student6 = new Student("Claudiu", 8, 9);
		Student[] studenti = { student1, student2, student3, student4, student5, student6 };

		Student x;

		for (int i = 0; i < studenti.length; i++) {
			for (int j = 1; j < studenti.length - i; j++) {

				if (studenti[j - 1].getMedia() > studenti[j].getMedia()) {

					x = studenti[j - 1];
					studenti[j - 1] = studenti[j];
					studenti[j] = x;

				}
			}
		}

		for (int i = 0; i < studenti.length; i++) {

			System.out.println("Nume: " + studenti[i].getNume() + "\n" + "Media: " + studenti[i].getMedia());

		}
	}

}
