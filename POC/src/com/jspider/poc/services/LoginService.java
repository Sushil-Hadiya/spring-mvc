package com.jspider.poc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspider.poc.dao.LoginDAO;
import com.jspider.poc.dto.LoginDTO;
import com.jspider.poc.dto.RegisterDTO;

@Service
public class LoginService {
	
	@Autowired
	private LoginDAO dao;

	public LoginService() {
		System.out.println(this.getClass().getSimpleName());
	}

	public RegisterDTO login(LoginDTO dto) {
		RegisterDTO fromDB = dao.login(dto);
		return fromDB;
	}

	/*
	 * public LoginDTO forgot(LoginDTO dto) { String psw = dto.getUsername() +
	 * "done"; dto.setPassword(psw); return dao.forgot(dto); }
	 */
}
