package com.jspider.poc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspider.poc.dao.RegisterDAO;
import com.jspider.poc.dto.RegisterDTO;

@Service
public class RegisterService {
	@Autowired
	private RegisterDAO registerDAO;

	public void register(RegisterDTO dto) {
		registerDAO.register(dto);
	}
}
