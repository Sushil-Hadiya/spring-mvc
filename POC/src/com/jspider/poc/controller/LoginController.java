package com.jspider.poc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jspider.poc.dto.LoginDTO;
import com.jspider.poc.dto.RegisterDTO;
import com.jspider.poc.services.LoginService;

@Controller
@RequestMapping("/")
public class LoginController {

	public LoginController() {
		System.out.println(this.getClass().getSimpleName());
	}

	@Autowired
	private LoginService loginService;

	@RequestMapping(value = "/ls.do", method = RequestMethod.POST)
	public ModelAndView login(LoginDTO dto, HttpServletRequest req) {
		RegisterDTO fromdb = loginService.login(dto);
		if (fromdb != null) {
			req.getSession().setAttribute("regdto", fromdb);
			return new ModelAndView("Home.jsp", "msg", fromdb.getUsername());
		} else {
			return new ModelAndView("Login.jsp", "msg", "InvalidCredential");
		}
	}

	/*
	 * @RequestMapping(value = "/fp.do", method = RequestMethod.POST) public
	 * ModelAndView forgot(LoginDTO dto) { LoginDTO found =
	 * loginService.forgot(dto); String msg; if
	 * (!found.getPassword().equals("Empty")) { msg =
	 * "Password Changed Successfully for " + found.getUsername(); } else { msg =
	 * "Enter Correct username"; }
	 * 
	 * return new ModelAndView("forgotPassword.jsp", "msg", msg); }
	 */
}
