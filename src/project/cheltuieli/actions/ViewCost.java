package project.cheltuieli.actions;

import java.time.YearMonth;
import java.util.Calendar;
import java.util.Date;

import project.cheltuieli.ApplicationSession;
import project.cheltuieli.model.Cost;
import project.cheltuieli.model.Database;
import project.core.menu.MenuItem;

public class ViewCost extends MenuItem {
	public ViewCost() {
		super("3", "View");
	}

	public void doActionMonth() {
		int month = 07;
		int year = 2018;
		Database database = ApplicationSession.getInstance().getDatabase();
		YearMonth.of(year, month); // 2017-07
		Calendar calendar = Calendar.getInstance();
		calendar.clear();

		calendar.set(Calendar.MONTH, month);

		calendar.set(Calendar.YEAR, year);
		Date date = calendar.getTime();

	}

	@Override
	public void doAction() {

		Database database = ApplicationSession.getInstance().getDatabase();
		System.out.println("-------------------------------------");
		System.out.println("-------------------------------------");
		for (Cost cost : database.getCost()) {
			System.out.println(cost);
			System.out.println("------------------------------------");
		}
	}
}
