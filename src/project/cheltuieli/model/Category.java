package project.cheltuieli.model;

import java.io.Serializable;

public class Category implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;

	public Category(String name) {
		this.name = name;
	}

	public boolean hasName(String name2) {
		return name.equals(name2);
	}

	public void edit(String name2) {
		name = name2;
	}

	@Override
	public String toString() {
		return this.name;
	}
}