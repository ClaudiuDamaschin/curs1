package project.cheltuieli.actions;

import project.core.keyboard.Keyboard;
import project.core.menu.MenuItem;

public class AddAction extends MenuItem {
	private Keyboard keyboard = Keyboard.getInstance();

	public AddAction() {
		super("1", "Add");
	}

	@Override
	public void doAction() {
		// Date date = keyboard.getDate("Date: ");
		System.out.println("add option...");
		int data = keyboard.getDate("Date: ");
		int category = keyboard.getInt("Category: ");
		int sum = keyboard.getInt("Sum: ");
		int description = keyboard.getInt("Description: ");
		int details = keyboard.getInt("Details: ");
		// Category category = new Category(data, month, coldWater, hotWater);
		// ApplicationSession.getInstance().getDatabase().addReading(reading);
		// do something with values
	}

}
