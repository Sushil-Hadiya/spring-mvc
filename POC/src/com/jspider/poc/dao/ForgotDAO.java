package com.jspider.poc.dao;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jspider.poc.dto.RegisterDTO;

@Repository
public class ForgotDAO {
	private static final Logger logger = Logger.getLogger(ForgotDAO.class);

	@Autowired
	private SessionFactory sessionFactory;

	public ForgotDAO() {
		logger.info("In " + this.getClass().getSimpleName());
	}

	public RegisterDTO forgotPassword(String userName) {
		Session s = sessionFactory.openSession();
		String qry = "from RegisterDTO where username=:name";
		Query query = s.createQuery(qry);
		query.setParameter("name", userName);
		RegisterDTO fromDb = (RegisterDTO) query.uniqueResult();
		return fromDb;
	}

	public int updatePassword(String userName, String password) {
		Session s = sessionFactory.openSession();
		Transaction tx = s.beginTransaction();
		String qry = "update RegisterDTO set password=:pwd where username=:name";
		Query query = s.createQuery(qry);
		query.setParameter("pwd", password);
		query.setParameter("name", userName);
		int fromDb = query.executeUpdate();
		tx.commit();
		return fromDb;
	}
}
