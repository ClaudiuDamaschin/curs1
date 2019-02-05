package project.cheltuieli.actions;

import project.cheltuieli.ApplicationSession;
import project.core.keyboard.Keyboard;
import project.core.menu.MenuItem;

public class DeleteCategory extends MenuItem {
	private Keyboard keyboard = Keyboard.getInstance();

	public DeleteCategory() {
		super("2", "Delete");
	}

	@Override
	public void doAction() {

		String category = keyboard.getString("Category ");
		ApplicationSession.getInstance().getDatabase().deleteCategory(category);
	}
}
