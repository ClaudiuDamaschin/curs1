package project.cheltuieli.actions;

import project.core.menu.MenuItem;

public class DeleteAction extends MenuItem {
	public DeleteAction() {
		super("2", "Delete");
	}

	@Override
	public void doAction() {
		System.out.println("delete something");
	}
}
