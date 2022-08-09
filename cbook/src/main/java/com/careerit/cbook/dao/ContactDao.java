package com.careerit.cbook.dao;

import java.util.List;

import com.careerit.cbook.domain.Contact;

public interface ContactDao {

		Contact insertContact(Contact contact);
		Contact selectContact(Long id);
		List<Contact> search(String str);
		List<Contact> selectContacts();
		boolean deleteContact(Long id);
		Contact updateContact(Contact contact);
}
