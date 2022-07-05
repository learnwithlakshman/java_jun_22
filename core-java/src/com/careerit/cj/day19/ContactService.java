package com.careerit.cj.day19;

import java.util.List;
import java.util.UUID;

public interface ContactService {

		UUID addContact(Contact contact);
		Contact updateContact(Contact contact);
		List<Contact> getAllContacts();
		List<Contact> search(String str);
		boolean deleteContact(UUID id);
		Contact getContact(UUID id);
		
}
