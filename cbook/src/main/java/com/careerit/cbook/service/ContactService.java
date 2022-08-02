package com.careerit.cbook.service;

import java.util.List;

import com.careerit.cbook.domain.Contact;

public interface ContactService {

		Contact addContact(Contact contact);
		Contact getContact(Long id);
		List<Contact> search(String str);
		List<Contact> getContacts();
		boolean deleteContact(Long id);
		Contact updateContact(Contact contact);
}
