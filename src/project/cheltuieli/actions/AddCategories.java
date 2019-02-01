package project.cheltuieli.actions;

import project.cheltuieli.ApplicationSession;
import project.cheltuieli.model.Category;
import project.core.keyboard.Keyboard;
import project.core.menu.MenuItem;

public class AddCategories extends MenuItem {
	private Keyboard keyboard = Keyboard.getInstance();

	public AddCategories() {
		super("1", "Add");
	}

	@Override
	public void doAction() {
		// Date date = keyboard.getDate("Date: ");
		System.out.println("add option...");
		String food = keyboard.getString(" Food : ");
		String health = keyboard.getString(" Health : ");
		String relaxation = keyboard.getString(" Relaxation: ");

		Category category = new Category(name);
		ApplicationSession.getInstance().getDatabase().deleteCategory(name);
		// do something with values
	}

}
