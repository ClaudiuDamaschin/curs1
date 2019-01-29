package project.cheltuieli.model;

import java.io.Serializable;

public class Category implements Serializable {
	private static final long serialVersionUID = 1L;

	// private int year;
	// private int month;
	private int food;
	private int relaxation;
	private int health;

	public Category(int year, int month, int food, int relaxation, int health) {
		// this.year = year;
		// this.month = month;
		this.food = food;
		this.relaxation = relaxation;
		this.health = health;
	}

	public boolean hasFoodAndHealthAndRelaxation(int food2, int health2, int relaxation2) {
		return food == food2 && health == health2 && relaxation == relaxation2;
	}

	public void edit(int food2, int relaxation2, int health2) {
		food = food2;
		relaxation = relaxation2;

		health = health2;
	}

	@Override
	public String toString() {
		return food + " " + relaxation + " " + health;
	}

}
