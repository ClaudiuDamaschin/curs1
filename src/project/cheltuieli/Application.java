package project.cheltuieli;

import project.cheltuieli.actions.AddAction;
import project.cheltuieli.actions.DeleteAction;
import project.cheltuieli.actions.ViewAction;
import project.cheltuieli.actions.ViewConsumptionAction;
import project.cheltuieli.model.Category;
import project.cheltuieli.model.Database;
import project.cheltuieli.utils.Serializer;
import project.core.menu.BackAction;
import project.core.menu.Menu;
import project.core.menu.MenuItem;

public class Application {
	public static void main(String[] args) {
		Application app = new Application();
		// app.init();
		app.run();
	}

	private void init() {
		Database database = ApplicationSession.getInstance().getDatabase();
		database.addCategory(new Category(2018, 11, 100, 100, 0));
		database.addCategory(new Category(2018, 12, 110, 109, 0));
	}

	private void run() {
		Serializer serializer = ApplicationSession.getInstance().getSerializer();
		Database database = serializer.load();
		if (database == null) {
			return;
		}

		ApplicationSession.getInstance().setDatabase(database);

		MenuItem mainMenu = createMenu();
		mainMenu.doAction();
	}

	private MenuItem createMenu() {
		MenuItem addReading = new AddAction();
		MenuItem deleteReading = new DeleteAction();

		MenuItem viewReadings = new ViewAction();
		MenuItem viewConsumption = new ViewConsumptionAction();

		BackAction back = new BackAction("0", "Back");

		Menu categoriesMenu = new Menu("1", "Categories");
		categoriesMenu.addItem(addReading);
		categoriesMenu.addItem(deleteReading);
		categoriesMenu.addItem(back);
		categoriesMenu.setBackAction(back);

		Menu costsMenu = new Menu("2", "Costs");
		costsMenu.addItem(viewReadings);
		costsMenu.addItem(viewConsumption);
		costsMenu.addItem(back);
		costsMenu.setBackAction(back);

		Menu mainMenu = new Menu("", "Main");
		mainMenu.addItem(categoriesMenu);
		mainMenu.addItem(costsMenu);
		mainMenu.addItem(back);
		mainMenu.setBackAction(back);
		return mainMenu;
	}
}
