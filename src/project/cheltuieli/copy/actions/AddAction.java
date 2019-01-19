package project.cheltuieli.copy.actions;

import project.core.keyboard.Keyboard;
import project.core.menu.MenuItem;

public class AddAction extends MenuItem {
	private Keyboard keyboard = Keyboard.getInstance();

	public AddAction() {
		super("1", "Add");
	}

	@Override
	public void doAction() {
		System.out.println("add option...");
		int data = keyboard.getInt("Data: ");
		int category = keyboard.getInt("Category: ");
		int amound = keyboard.getInt("Amount: ");
		int description = keyboard.getInt("Description: ");
		int details = keyboard.getInt("Details: ");
		// do something with values
	}

}
