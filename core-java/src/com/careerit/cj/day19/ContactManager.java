package com.careerit.cj.day19;

import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class ContactManager {

	public static void main(String[] args) {

		ContactService contactService = new ContactServiceImpl();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1.Add 2.Search 3.View 4.Update 5.View all 6.exit");
			System.out.println("Enter your choiice :");
			int ch = sc.nextInt();
			sc.nextLine();
			switch (ch) {
			case 1: {
					System.out.println("Name :");
					String name = sc.nextLine();
					System.out.println("Email :");
					String email = sc.nextLine();
					System.out.println("mobile :");
					String mobile = sc.nextLine();
					System.out.println("City :");
					String city = sc.nextLine();
					Contact contact = new Contact(name, email, mobile, city);
					UUID cid = contactService.addContact(contact);
					System.out.println("Contact is added with id :"+cid);
					break;
			}
			case 5:{
					List<Contact> contacts = contactService.getAllContacts();
					System.out.println("-----------------------------");
					for(Contact contact:contacts) {
						System.out.println("CID    "+contact.getCid());
						System.out.println("Name   "+contact.getName());
						System.out.println("Email  "+contact.getEmail());
						System.out.println("Mobile "+contact.getMobile());
						System.out.println("City   "+contact.getCity());
						System.out.println("-----------------------------");
					}
					break;
			}
			case 6:{
				System.out.println("Thank you see you once again");
				sc.close();
				System.exit(0);
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + ch);
			}
		}
	}
}
