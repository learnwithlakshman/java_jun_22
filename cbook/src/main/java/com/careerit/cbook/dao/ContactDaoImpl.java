package com.careerit.cbook.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.careerit.cbook.domain.Contact;
import com.careerit.cbook.util.DbUtil;

public class ContactDaoImpl implements ContactDao {

	private final String ALL_CONTACTS = "select id, name, email, mobile from contact";

	public Contact selectContact(Contact contact) {
		// TODO Auto-generated method stub
		return null;
	}

	public Contact selectContact(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Contact> search(String str) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Contact> selectContacts() {

		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		List<Contact> contacts = new ArrayList<Contact>();
		try {
			con = DbUtil.getConnection();
			st = con.createStatement();
			rs = st.executeQuery(ALL_CONTACTS);
			while (rs.next()) {
				Long id = rs.getLong("id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String mobile = rs.getString("mobile");
				Contact contact = Contact.builder().id(id).name(name).email(email).mobile(mobile).build();
				contacts.add(contact);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DbUtil.close(rs, st, con);
		}
		return contacts;
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
