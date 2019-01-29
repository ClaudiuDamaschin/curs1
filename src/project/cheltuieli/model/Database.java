package project.cheltuieli.model;

import java.util.List;

public interface Database {
	void addCategory(Category category);

	Category getCategoryByFoodAndHealthAndRelaxation(int food, int health, int relaxation);

	void editCategory(int food, int health, int relaxation);

	List<Category> getCategories();

	Category getPreviousCategoryByFoodAndHealthAndRelaxation(int food, int health, int relaxation);

}
