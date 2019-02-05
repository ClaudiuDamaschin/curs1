package project.cheltuieli;

import project.cheltuieli.actions.AddCategories;
import project.cheltuieli.actions.AddCosts;
import project.cheltuieli.actions.DeleteCategory;
import project.cheltuieli.actions.DeleteCost;
import project.cheltuieli.actions.ViewCost;
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
		database.addCategory(new Category("Gaz"));
		database.addCategory(new Category("Sport"));

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
		MenuItem addCategories = new AddCategories();
		MenuItem deleteCategory = new DeleteCategory();
		MenuItem viewCost = new ViewCost();
		MenuItem addCosts = new AddCosts();
		MenuItem deleteCost = new DeleteCost();

		BackAction back = new BackAction("0", "Back");

		Menu categoriesMenu = new Menu("1", "Category");
		categoriesMenu.addItem(addCategories);
		categoriesMenu.addItem(deleteCategory);
		categoriesMenu.addItem(back);
		categoriesMenu.setBackAction(back);

		Menu costsMenu = new Menu("2", "Cost");
		costsMenu.addItem(addCosts);
		costsMenu.addItem(deleteCost);
		costsMenu.addItem(viewCost);
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
