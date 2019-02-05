package project.cheltuieli.model;

import java.io.Serializable;
import java.util.Date;

public class Cost implements Serializable {

	private static final long serialVersionUID = 1L;

	Date date;
	Category category;
	String sum;
	String description;
	String details;

	public Cost(Date date, Category category, String sum, String description, String details) {

		this.date = date;
		this.category = category;
		this.sum = sum;
		this.description = description;
		this.details = details;
	}

	@Override
	public String toString() {
		return "Cost [date=" + String.format("%5d", date) + ", category=" + String.format("%5d", category) + ", sum="
				+ String.format("%5d", sum) + ", description=" + String.format("%5d", description) + ", details="
				+ String.format("%5d", details) + "]";
	}
	// @Override
	// public String toString() {
	// return "| " + String.format("%5d", date) + " | " + String.format("%5d",
	// category) + " | "
	// + String.format("%5d", sum) + " | " + String.format("%5d", description) + "|"
	// + " | "
	// + String.format("%5d", details);

	// }

	public Date getDate() {
		return date;
	}

	public Category getCategory() {
		return category;
	}

	public String getSum() {
		return sum;
	}

	public String getDescription() {
		return description;
	}

	public String getDetails() {
		return details;
	}

}
