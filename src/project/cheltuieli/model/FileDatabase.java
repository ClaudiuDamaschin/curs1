package project.cheltuieli.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import project.cheltuieli.utils.ApplicationSession;
import project.cheltuieli.utils.Serializer;

public class FileDatabase implements Database, Serializable {
	private static final long serialVersionUID = 1L;

	private List<Category> categories = new ArrayList<Category>();

	@Override
	public void addCategory(Category category) {
		categories.add(category);
		Serializer serializer = ApplicationSession.getInstance().getSerializer();
		serializer.save(this);
	}

	@Override
	public Category getCategoryByFoodAndHealthAndRelaxation(int food, int health, int relaxation) {
		for (Category category : categories) {
			if (category.hasFoodAndHealthAndRelaxation(food, health, relaxation)) {
				return category;
			}
		}
		return null;
	}

	@Override
	public void editCategory(int food, int health, int relaxation) {
		Category category = getCategoryByFoodAndHealthAndRelaxation(food, health, relaxation);
		category.edit(food, health, relaxation);
		Serializer serializer = ApplicationSession.getInstance().getSerializer();
		serializer.save(this);
	}

	@Override
	public List<Category> getCategories() {
		return categories;
	}

	@Override
	public Category getPreviousCategoryByFoodAndHealthAndRelaxation(int food, int health, int relaxation) {
		// TODO Auto-generated method stub
		return null;
	}

	// @Override
	// public Category getPreviousCategoryByFoodAndHealthAndRelaxation(int food, int
	// health, int relaxation) {
	// int previousFood = food;
	// int previousMonth = month - 1;

	// if (month == 1) {
	// previousYear -= 1;
	// previousMonth = 12;
	// }

	// return getCategoryByFoodAndHealthAndRelaxation(previousFood, previousHealth,
	// previousRelaxation);
	// }

}
