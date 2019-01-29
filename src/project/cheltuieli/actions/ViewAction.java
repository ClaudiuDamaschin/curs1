package project.cheltuieli.actions;

import project.cheltuieli.model.Category;
import project.cheltuieli.model.Database;
import project.cheltuieli.utils.ApplicationSession;
import project.core.menu.MenuItem;

public class ViewAction extends MenuItem {
	public ViewAction() {
		super("3", "View");
	}

	@Override
	public void doAction() {
		Database database = ApplicationSession.getInstance().getDatabase();
		for (Category category : database.getCategories()) {
			System.out.println(category);
		}
	}

}
