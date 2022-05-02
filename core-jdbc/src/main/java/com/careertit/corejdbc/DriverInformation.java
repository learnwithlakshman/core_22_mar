package com.careertit.corejdbc;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class DriverInformation {

	private static Properties properties;
	static {
		properties = new Properties();
		try {
			properties.load(DriverInformation.class.getResourceAsStream("/db.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		try {
			String name = (String) properties.get("driver.class");
			Class c = Class.forName(name);
			Driver obj = (Driver) c.getDeclaredConstructor().newInstance();
			obj.showVersion();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | NoSuchMethodException | SecurityException | IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
