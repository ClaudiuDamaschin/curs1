package project.cheltuieli.model;

import java.io.Serializable;
import java.util.Date;

public class Cost implements Serializable {

	private static final long serialVersionUID = 1L;

	Date date;
	Category category;
	double sum;
	String description;
	String details;
	// int month;

	public Cost(Date date, Category category, double sum, String description, String details) {

		this.date = date;
		this.category = category;
		this.sum = sum;
		this.description = description;
		this.details = details;
		// this.month = month;

	}

	// public boolean hasMonthAndCategory(int month2, String cateogry) {
	// return month == month2 && cateogry == category2;
	// }

	@Override
	public String toString() {
		return "Cost [date=" + date + ", category=" + category + ", sum=" + sum + ", description=" + description
				+ ", details=" + details + "]";
	}

	public Date getDate() {
		return date;
	}

	public Category getCategory() {
		return category;
	}

	public double getSum() {
		return sum;
	}

	public String getDescription() {
		return description;
	}

	public String getDetails() {
		return details;
	}

}
