package com.careerit.cj.day19;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ContactServiceImpl implements ContactService {

	private List<Contact> contactList = new ArrayList<>();

	@Override
	public UUID addContact(Contact contact) {
		UUID cid = UUID.randomUUID();
		contact.setCid(cid);
		contactList.add(contact);
		return cid;
	}

	@Override
	public Contact updateContact(Contact contact) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Contact> getAllContacts() {
		return contactList;
	}

	@Override
	public List<Contact> search(String str) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteContact(UUID id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Contact getContact(UUID id) {
		// TODO Auto-generated method stub
		return null;
	}

}
