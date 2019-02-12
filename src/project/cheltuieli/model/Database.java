package project.cheltuieli.model;

import java.util.List;

public interface Database {

	void addCategory(Category category);

	Category getCategoryName(String name);

	List<Category> getCategoryName();

	void deleteCategory(String deletecategory);

	void addCost(Cost cost);

	Cost getCostName(String cost);

	List<Cost> getCost();

	void deleteCost(String deletecost);

	void viewCost(String cost);

	Category getCategoryByName(String text);

	Cost getCostByMonthAndCategory(int month, String cateogry);

	Cost getPreviousCostByMonthAndCategory(int month, String cateogry);

}
