package com.careerit.phonebook;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
	private Map<String, String> map = new HashMap<>();

	public void addDetails(String phno, String name) {
		if (map.get(phno) != null) {
			String contactName = map.get(phno);
			System.out.println(String.format("Contact name %s is updating with %s", contactName, name));
		} else {
			map.put(phno, name);
		}
	}

	public String getName(String phno) {
		if (map.get(phno) != null) {
			return map.get(phno);
		} else {
			return "Sorry! contact with "+phno+" is not found";
		}
	}
}
