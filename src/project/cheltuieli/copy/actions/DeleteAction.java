package project.cheltuieli.copy.actions;

import project.core.keyboard.Keyboard;
import project.core.menu.MenuItem;

public class DeleteAction extends MenuItem {
	private Keyboard keyboard = Keyboard.getInstance();

	public DeleteAction() {
		super("3", "Delete");

	}

	@Override
	public void doAction() {
		System.out.println("Aici stergem ceva");
	}

}
