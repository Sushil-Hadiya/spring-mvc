package com.jspider.poc.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jspider.poc.dto.RegisterDTO;

@Repository
public class UpdateDAO {
	@Autowired
	private SessionFactory factory;

	public RegisterDTO update(RegisterDTO dto) {
		Session session = null;
		Transaction transaction = null;
		RegisterDTO update = null;
		try {
			System.out.println("Before Session");
			session = factory.openSession();
			System.out.println("Before transaction");
			transaction = session.beginTransaction();
			System.out.println("Before merge");
			update = (RegisterDTO)session.merge(dto);
			System.out.println("Before Commit");
			transaction.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			transaction.rollback();
			System.out.println("Transaction RolledBack");
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return update;
	}
}
