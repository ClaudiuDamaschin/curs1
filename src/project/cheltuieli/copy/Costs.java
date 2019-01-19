package project.cheltuieli.copy;

import project.cheltuieli.copy.actions.AddAction;
import project.cheltuieli.copy.actions.AmountAction;
import project.cheltuieli.copy.actions.CategoriesAction;
import project.cheltuieli.copy.actions.DataAction;
import project.cheltuieli.copy.actions.DescriptionAction;
import project.cheltuieli.copy.actions.DetailsAction;
import project.cheltuieli.copy.actions.EditAction;
import project.cheltuieli.copy.actions.FoodAction;
import project.cheltuieli.copy.actions.HealthAction;
import project.cheltuieli.copy.actions.RelaxationAction;
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
		MenuItem editReading = new EditAction();
		MenuItem dataReading = new DataAction();
		MenuItem categoriesReading = new CategoriesAction();
		MenuItem amountReading = new AmountAction();
		MenuItem descriptionReading = new DescriptionAction();
		MenuItem detailsReading = new DetailsAction();
		MenuItem foodReading = new FoodAction();
		MenuItem relaxationReading = new RelaxationAction();
		MenuItem healthReading = new HealthAction();

		BackAction back = new BackAction("0", "Back");

		Menu CategoriesMenu = new Menu("1", "Categories");
		CategoriesMenu.addItem(foodReading);
		CategoriesMenu.addItem(relaxationReading);
		CategoriesMenu.addItem(healthReading);
		CategoriesMenu.addItem(back);
		CategoriesMenu.setBackAction(back);

		Menu CostsMenu = new Menu("2", "Costs");
		CostsMenu.addItem(dataReading);
		CostsMenu.addItem(categoriesReading);
		CostsMenu.addItem(amountReading);
		CostsMenu.addItem(descriptionReading);
		CostsMenu.addItem(detailsReading);

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