package project.cheltuieli.actions;

import project.cheltuieli.ApplicationSession;
import project.cheltuieli.model.Cost;
import project.cheltuieli.model.Database;
import project.core.menu.MenuItem;

public class ViewByMonthAndCategory extends MenuItem {

	public ViewByMonthAndCategory() {
		super("4", "ViewByMonthAndCategory");
	}

	@Override
	public void doAction() {

		Database db = ApplicationSession.getInstance().getDatabase();
		System.out.println("-------------------------------------");

		for (Cost cost : db.getCost()) {
			System.out.println(cost);
			System.out.println("------------------------------------");

		}
	}
}
