package project.cheltuieli.utils;

import project.cheltuieli.model.Database;
import project.cheltuieli.model.FileDatabase;

public class ApplicationSession {
	private static ApplicationSession instance = new ApplicationSession();
	private Database database = new FileDatabase();
	private Serializer serializer = new Serializer();

	public static ApplicationSession getInstance() {
		return instance;
	}

	public Database getDatabase() {
		return database;
	}

	public Serializer getSerializer() {
		return serializer;
	}

	public void setDatabase(Database database) {
		this.database = database;
	}
}
