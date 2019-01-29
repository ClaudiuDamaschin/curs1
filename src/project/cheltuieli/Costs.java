package project.cheltuieli;

import project.cheltuieli.actions.AddAction;
import project.cheltuieli.actions.DeleteAction;
import project.cheltuieli.actions.ViewAction;
import project.core.menu.BackAction;
import project.core.menu.Menu;
import project.core.menu.MenuItem;

public class Costs {
	public static void main(String[] args) {
		Costs app = new Costs();
		app.run();
	}

	private void run() {
		MenuItem mainMenu = createMenu();
		mainMenu.doAction();
	}

	private MenuItem createMenu() {
		MenuItem addReading = new AddAction();
		MenuItem deleteReading = new DeleteAction();
		MenuItem viewReading = new ViewAction();

		BackAction back = new BackAction("0", "Back");

		Menu CategoriesMenu = new Menu("1", "Categories");
		CategoriesMenu.addItem(addReading);
		CategoriesMenu.addItem(deleteReading);
		CategoriesMenu.addItem(back);
		CategoriesMenu.setBackAction(back);

		Menu CostsMenu = new Menu("2", "Costs");
		CostsMenu.addItem(addReading);
		CostsMenu.addItem(deleteReading);
		CostsMenu.addItem(viewReading);
		CostsMenu.addItem(back);
		CostsMenu.setBackAction(back);

		Menu mainMenu = new Menu("", "Main");
		mainMenu.addItem(CategoriesMenu);
		mainMenu.addItem(CostsMenu);
		mainMenu.addItem(back);
		mainMenu.setBackAction(back);
		return mainMenu;
	}
}