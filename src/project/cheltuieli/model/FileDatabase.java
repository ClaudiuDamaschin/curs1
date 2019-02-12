package project.cheltuieli.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import project.cheltuieli.ApplicationSession;
import project.cheltuieli.utils.Serializer;

public class FileDatabase implements Database, Serializable {
	private static final long serialVersionUID = 1L;

	private List<Category> categories = new ArrayList<Category>();
	private List<Cost> cost = new ArrayList<Cost>();

	@Override
	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	@Override
	public List<Cost> getCost() {
		return cost;
	}

	public void setCost(List<Cost> cost) {
		this.cost = cost;
	}

	@Override
	public project.cheltuieli.model.Category getCategoryName(String name) {

		return null;
	}

	@Override
	public List<project.cheltuieli.model.Category> getCategoryName() {

		return null;
	}

	@Override
	public Cost getCostName(String cost) {

		return null;
	}

	@Override
	public void viewCost(String cost) {

	}

	@Override
	public void deleteCategory(String category) {

	}

	@Override
	public void addCost(Cost c) {
		cost.add(c);
		Serializer serializer = ApplicationSession.getInstance().getSerializer();
		serializer.save(this);

	}

	@Override
	public void addCategory(Category category) {
		categories.add(category);
		Serializer serializer = ApplicationSession.getInstance().getSerializer();
		serializer.save(this);

	}

	@Override
	public void deleteCost(String cost) {

	}

	@Override
	public Category getCategoryByName(String text) {
		for (Category c : categories) {
			if (c.hasName(text)) {
				return c;
			}
		}
		return null;
	}

	@Override
	public Cost getCostByMonthAndCategory(int month, String cateogry) {
		// for (Cost cost : cost) {
		// if (cost.hasMonthAndCategory(month, cateogry)) {
		// return cost;
		// }
		// }
		return null;
	}

	@Override
	public Cost getPreviousCostByMonthAndCategory(int month, String cateogry) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getSumByCategory(Category cat) {
		double sum = 0;
		for (Cost cost : this.cost) {
			if (cost.getCategory() == cat) {
				sum += cost.getSum();
			}
		}
		return sum;
	}

}
