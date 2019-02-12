package project.cheltuieli.actions;

import project.cheltuieli.ApplicationSession;
import project.cheltuieli.model.Database;
import project.core.keyboard.Keyboard;
import project.core.menu.MenuItem;

public class DeleteCategory extends MenuItem {
	private Keyboard keyboard = Keyboard.getInstance();

	public DeleteCategory() {
		super("2", "Delete");
	}

	@Override
	public void doAction() {
		Database db = ApplicationSession.getInstance().getDatabase();
		String category = keyboard.getString("Category ");
		db.deleteCategory(category);
		ApplicationSession.getInstance().getDatabase().deleteCategory(category);
	}
}
