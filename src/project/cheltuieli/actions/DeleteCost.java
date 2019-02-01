package project.cheltuieli.actions;

import project.cheltuieli.ApplicationSession;
import project.core.keyboard.Keyboard;
import project.core.menu.MenuItem;

public class DeleteCost extends MenuItem {
	private Keyboard keyboard = Keyboard.getInstance();

	public DeleteCost() {
		super("2", "Delete");
	}

	@Override
	public void doAction() {

		String cost = keyboard.getString("Cost ");
		ApplicationSession.getInstance().getDatabase().deleteCost(cost);
	}
}
