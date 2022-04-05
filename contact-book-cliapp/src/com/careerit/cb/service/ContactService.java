package com.careerit.cb.service;

import java.util.List;

import com.careerit.cb.domain.Contact;

public interface ContactService {

	boolean addContact(Contact contact);

	Contact getContact(String mobile);

	List<Contact> getContacts();

	boolean updateContact(Contact contact);

	boolean deleteContact(String mobile);

	List<Contact> search(String str);
}
