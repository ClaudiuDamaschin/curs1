package project.cheltuieli.actions;

import java.util.Date;

import project.cheltuieli.ApplicationSession;
import project.cheltuieli.model.Category;
import project.cheltuieli.model.Cost;
import project.core.keyboard.Keyboard;
import project.core.menu.MenuItem;

public class AddCosts extends MenuItem {
	private Keyboard keyboard = Keyboard.getInstance();

	public AddCosts() {
		super("1", "Add");
	}

	@Override
	public void doAction() {
		// Date date = keyboard.getDate("Date: ");
		Date date = keyboard.getDate(" Date : ");
		Category category = keyboard.getCategory("Category:");
		int sum = keyboard.getInt("Sum:");
		String description = keyboard.getString("Description:");
		String details = keyboard.getString("Details:");

		Cost cost = new Cost(date, category, sum, description, details);
		ApplicationSession.getInstance().getDatabase().addCost(cost);
		// do something with values
	}

}
