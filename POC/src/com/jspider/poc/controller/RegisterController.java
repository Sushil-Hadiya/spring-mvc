package com.jspider.poc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jspider.poc.dto.RegisterDTO;
import com.jspider.poc.services.RegisterService;

@Controller
@RequestMapping("/")
public class RegisterController {
	@Autowired
	private RegisterService registerService;

	@RequestMapping(value = "/fs.do", method = RequestMethod.POST)
	public ModelAndView register(RegisterDTO dto) {
		registerService.register(dto);
		return new ModelAndView("Login.jsp");
	}
}
