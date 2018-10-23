package com.jspider.poc.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jspider.poc.dto.LoginDTO;
import com.jspider.poc.dto.RegisterDTO;

@Repository
public class LoginDAO {

	@Autowired
	private SessionFactory factory;

	public LoginDAO() {
		System.out.println(this.getClass().getSimpleName());
	}

	public RegisterDTO login(LoginDTO dto) {
		Session session = factory.openSession();
		String str = "select reg from RegisterDTO reg where username=:user and password=:pwd";
		Query que = session.createQuery(str);
		que.setParameter("user", dto.getUsername());
		que.setParameter("pwd", dto.getPassword());
		RegisterDTO fromDB = (RegisterDTO) que.uniqueResult();
		return fromDB;

	}

	/*
	 * public LoginDTO forgot(LoginDTO dto) { Session session =
	 * factory.openSession(); Transaction transaction = session.beginTransaction();
	 * String change = "select reg from RegisterDTO reg where username=:user"; Query
	 * query = session.createQuery(change); query.setParameter("user",
	 * dto.getUsername()); RegisterDTO user = (RegisterDTO) query.uniqueResult(); if
	 * (user != null) { user.setPassword(dto.getPassword()); session.update(user);
	 * System.out.println("Data Saved for" + user); transaction.commit(); } else {
	 * dto.setPassword("Empty"); System.out.println("In else Condition");
	 * transaction.rollback(); } return dto; }
	 */

}
