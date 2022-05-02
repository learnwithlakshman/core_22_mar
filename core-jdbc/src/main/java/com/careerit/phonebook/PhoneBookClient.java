package com.careerit.phonebook;

import java.util.Scanner;

public class PhoneBookClient {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			PhoneBook phoneBook = new PhoneBook();
			while (true) {
				System.out.println("1.Add Contact 2.Get Name 3.Exit");
				int ch = sc.nextInt();
				sc.nextLine();
				switch (ch) {
				case 1:
					System.out.println("Enter the name :");
					String name = sc.nextLine();
					System.out.println("Enter the phone :");
					String phone = sc.nextLine();
					phoneBook.addDetails(phone, name);
					break;
				case 2:
					System.out.println("Enter the phone :");
					String sphone = sc.nextLine();
					String res = phoneBook.getName(sphone);
					System.out.println(res);
					break;
				case 3:
					System.exit(0);
				default:
					break;
				}
			}
		}
	}
}
