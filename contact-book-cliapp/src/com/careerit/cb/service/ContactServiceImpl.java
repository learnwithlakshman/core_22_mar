package com.careerit.cb.service;

import java.util.ArrayList;
import java.util.List;

import com.careerit.cb.domain.Contact;

public class ContactServiceImpl implements ContactService {

	private List<Contact> clist = new ArrayList<Contact>();

	@Override
	public boolean addContact(Contact contact) {
		if (contact.getMobile() != null && contact.getName() != null) {
			clist.add(contact);
			return true;
		}
		return false;
	}

	@Override
	public Contact getContact(String mobile) {
		if (clist.size() != 0) {
			for (Contact contact : clist) {
				if (contact.getMobile().equals(mobile)) {
					return contact;
				}
			}
		}
		return null;
	}

	@Override
	public List<Contact> getContacts() {
		return clist;
	}

	@Override
	public boolean updateContact(Contact contact) {
		if (deleteContact(contact.getMobile())) {
			clist.add(contact);
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteContact(String mobile) {
		Contact contact = getContact(mobile);
		if (contact != null) {
			clist.remove(contact);
			return true;
		}
		return false;
	}

	@Override
	public List<Contact> search(String str) {
		List<Contact> searchResultList = new ArrayList<Contact>();
		for (Contact contact : clist) {
			if (contact.getName().contains(str) || contact.getEmail().contains(str)
					|| contact.getMobile().contains(str)) {
				searchResultList.add(contact);
			}
		}
		return searchResultList;
	}

}
