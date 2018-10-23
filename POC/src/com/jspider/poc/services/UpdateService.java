package com.jspider.poc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspider.poc.dao.UpdateDAO;
import com.jspider.poc.dto.RegisterDTO;

@Service
public class UpdateService {
	@Autowired
	private UpdateDAO updateDAO;

	public RegisterDTO update(RegisterDTO dto) {
		return updateDAO.update(dto);
	}
}
