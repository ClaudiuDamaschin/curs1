package project.cheltuieli.model;

import java.util.List;

public interface Database {

	void addCategory(Category category);

	Category getCategoryName(String name);

	List<Category> getCategoryName();

	void deleteCategory(String category);

	void addCost(Cost cost);

	Cost getCostName(String cost);

	List<Cost> getCost();

	Cost getPreviousCostByYearAndMonth(int year, int month);

	void deleteCost(String cost);

	void viewCost(String cost);

}
