package project.cheltuieli.actions;

import project.cheltuieli.ApplicationSession;
import project.cheltuieli.model.Cost;
import project.cheltuieli.model.Database;
import project.core.menu.MenuItem;

public class ViewCost extends MenuItem {
	public ViewCost() {
		super("3", "View");
	}

	@Override
	public void doAction() {

		Database database = ApplicationSession.getInstance().getDatabase();
		System.out.println("-------------------------------------");

		for (Cost cost : database.getCost()) {
			System.out.println(cost);
			System.out.println("------------------------------------");
		}
	}
}
