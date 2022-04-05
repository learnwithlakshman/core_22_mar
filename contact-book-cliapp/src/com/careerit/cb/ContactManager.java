package com.careerit.cb;

import java.util.List;
import java.util.Scanner;

import com.careerit.cb.domain.Contact;
import com.careerit.cb.service.ContactService;
import com.careerit.cb.service.ContactServiceImpl;

public class ContactManager {

	public static void main(String[] args) {

		ContactService contactService = new ContactServiceImpl();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("----------------------------------------------------------------------------------");
			System.out.println("1.Add Contact 2.Get all contacts 3. Get Contact(mobile)  4. Delete 5.Search 6.Exit");
			System.out.println("----------------------------------------------------------------------------------");
			System.out.println("Enter your choice :");
			int ch = sc.nextInt();
			sc.nextLine();
			switch (ch) {
			case 1: {
				getContactAndAdd(contactService, sc);
				break;
			}
			case 2: {
				getAndShowContact(contactService);
				break;
			}case 3:{
				getContactByMobile(contactService,sc);
				break;
			}case 4:{
				deleteContactByMobile(contactService,sc);
				break;
			}case 5:{
				searchContact(contactService,sc);
				break;
			}
			case 6:{
				System.exit(0);
			}
			default:
				System.out.println("Please enter 1- 6 only");
			}

			System.out.println("Do you want to continue (Y/N)");
			String choice = sc.nextLine();
			if (!choice.equalsIgnoreCase("y")) {
				System.out.println("Thank you....");
				sc.close();
				break;
			}
		}
	}

	private static void searchContact(ContactService contactService,Scanner sc) {
		System.out.println("Enter the search  string :");
		String str = sc.nextLine();
		List<Contact> list = contactService.search(str);
		showContacts(list);
	}

	private static void deleteContactByMobile(ContactService contactService,Scanner sc) {
		getAndShowContact(contactService);
		System.out.println("Enter the mobile number to delete contact :");
		String mobile = sc.nextLine();
		boolean flag = contactService.deleteContact(mobile);
		if(flag) {
			System.out.println("Contact is deleted with mobile :"+mobile);
		}else {
			System.out.println("Contact is not found or not able to delete");
		}
	}

	private static void getContactByMobile(ContactService contactService,Scanner sc) {
		System.out.println("Enter the mobile number to contact :");
		String mobile = sc.nextLine();
		Contact contact=contactService.getContact(mobile);
		if(contact!=null) {
			showContacts(List.of(contact));
		}else {
			System.out.println("Contact is not found with mobile :"+mobile);
		}
	}

	private static void getAndShowContact(ContactService contactService) {
		List<Contact> list = contactService.getContacts();
		showContacts(list);
		
	}
	
	private static void showContacts(List<Contact> contacts) {
		if (contacts.size() == 0) {
			System.out.println("No contacts found");
		} else {
			for (Contact contact : contacts) {
				System.out.println(contact.getName() + " " + contact.getEmail() + " " + contact.getMobile());
			}
		}
	}

	private static void getContactAndAdd(ContactService contactService, Scanner sc) {
		System.out.println("Enter name :");
		String name = sc.nextLine();
		System.out.println("Enter email :");
		String email = sc.nextLine();
		System.out.println("Enter mobile : ");
		String mobile = sc.nextLine();
		Contact contact = new Contact(name, email, mobile);
		boolean flag = contactService.addContact(contact);
		if (flag) {
			System.out.println("Contact is added");
		} else {
			System.out.println("Contact is not added, please provide name and mobile number");
		}
	}
}
