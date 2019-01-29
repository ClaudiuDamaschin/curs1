package project.cheltuieli.actions;

import project.cheltuieli.model.Category;
import project.cheltuieli.model.Database;
import project.cheltuieli.utils.ApplicationSession;
import project.core.keyboard.Keyboard;
import project.core.menu.MenuItem;

public class ViewConsumptionAction extends MenuItem {
	private Keyboard keyboard = Keyboard.getInstance();

	public ViewConsumptionAction() {
		super("2", "View consumption");
	}

	@Override
	public void doAction() {
		Database db = ApplicationSession.getInstance().getDatabase();
		int food = keyboard.getInt("Food: ");
		int health = keyboard.getInt("Health: ");
		int relaxation = keyboard.getInt("Relaxation");

		Category currentReading = db.getCategoryByFoodAndHealthAndRelaxation(food, health, relaxation);
		Category previousReading = db.getPreviousCategoryByFoodAndHealthAndRelaxation(food, health, relaxation);

	}

}
