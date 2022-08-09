package com.careerit.cbook.service;

import java.util.List;

import com.careerit.cbook.dao.ContactDao;
import com.careerit.cbook.dao.ContactDaoImpl;
import com.careerit.cbook.domain.Contact;

public class ContactServiceImpl implements ContactService{

	private ContactDao contactDao = new ContactDaoImpl();
	public Contact addContact(Contact contact) {
		// TODO Auto-generated method stub
		return null;
	}

	public Contact getContact(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Contact> search(String str) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Contact> getContacts() {
		return contactDao.selectContacts();
	}

	public boolean deleteContact(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	public Contact updateContact(Contact contact) {
		// TODO Auto-generated method stub
		return null;
	}

}
