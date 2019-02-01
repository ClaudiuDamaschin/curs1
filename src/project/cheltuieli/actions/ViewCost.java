package project.cheltuieli.actions;

import project.cheltuieli.model.Cost;
import project.cheltuieli.model.Database;
import project.core.menu.MenuItem;

public class ViewCost extends MenuItem {
	public ViewCost() {
		super("3", "View");
	}

	@Override
	public void doAction() {
		// int month = 07;
		// int year = 2018;
		// Database database = ApplicationSession.getInstance().getDatabase();
		// YearMonth.of(year, month); // 2017-07
		// Calendar calendar = Calendar.getInstance();
		// calendar.clear();

		// calendar.set(Calendar.MONTH, month);

		// calendar.set(Calendar.YEAR, year);
		// Date date = calendar.getTime();

		System.out.println("-------------------------------------");
		for (Cost cost : Database.getCost()) {
			System.out.println(cost);
			System.out.println("------------------------------------");
		}
	}
}
