package com.jspider.poc.services;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspider.poc.dao.ForgotDAO;
import com.jspider.poc.dto.RegisterDTO;

@Service
public class ForgotService {

	private static final Logger logger = Logger.getLogger(ForgotService.class);

	@Autowired
	private ForgotDAO forgotDao;

	public ForgotService() {
		logger.info("In " + this.getClass().getSimpleName());
	}

	public RegisterDTO forgotPassword(String userName) {
		return forgotDao.forgotPassword(userName);
	}

	public int updatePassword(String userName, String password) {
		return forgotDao.updatePassword(userName, password);
	}

}
