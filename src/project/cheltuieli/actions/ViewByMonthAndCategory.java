package project.cheltuieli.actions;

import java.util.List;

import project.cheltuieli.ApplicationSession;
import project.cheltuieli.model.Category;
import project.cheltuieli.model.Cost;
import project.cheltuieli.model.Database;
import project.core.menu.MenuItem;

public class ViewByMonthAndCategory extends MenuItem {

	public ViewByMonthAndCategory() {
		super("4", "ViewByMonthAndCategory");
	}

	@Override
	public void doAction() {

		Database database = ApplicationSession.getInstance().getDatabase();
		System.out.println("-----------------------------------------------------------");

		for (Cost cost : database.getCost()) {

			System.out.println("Date:  " + cost.getDate() + "  |  " + "  Category:  " + cost.getCategory());
			System.out.println("-----------------------------------------------------------");

		}

		List<Category> categories = database.getCategories();

		for (Category cat : categories) {
			System.out.print(cat);
			System.out.println(" " + database.getSumByCategory(cat));
		}

	}
}
