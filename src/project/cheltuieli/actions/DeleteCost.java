package project.cheltuieli.actions;

import project.cheltuieli.ApplicationSession;
import project.cheltuieli.model.Database;
import project.core.keyboard.Keyboard;
import project.core.menu.MenuItem;

public class DeleteCost extends MenuItem {
	private Keyboard keyboard = Keyboard.getInstance();

	public DeleteCost() {
		super("2", "Delete");
	}

	@Override
	public void doAction() {
		Database db = ApplicationSession.getInstance().getDatabase();
		String cost = keyboard.getString("Cost ");
		db.deleteCost(cost);
		ApplicationSession.getInstance().getDatabase().deleteCost(cost);
	}
}
