package com.jspider.poc.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jspider.poc.dto.RegisterDTO;

@Repository
public class RegisterDAO {
	@Autowired
	private SessionFactory factory;

	public void register(RegisterDTO dto) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		try {
			session.save(dto);
			transaction.commit();
		} catch (HibernateException e) {

		} finally {
			session.close();
		}
	}
}
