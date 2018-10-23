package com.jspider.poc.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jspider.poc.dto.RegisterDTO;
import com.jspider.poc.services.ForgotService;

@Controller
@RequestMapping("/")
public class ForgotController {

	private static final Logger logger = Logger.getLogger(ForgotController.class);

	@Autowired
	private ForgotService forgotService;

	@Autowired
	private JavaMailSenderImpl javaMailSenderImpl;

	public ForgotController() {
		logger.info("In " + this.getClass().getSimpleName());
	}

	@RequestMapping("/fp.do")
	public ModelAndView forgotPassword(HttpServletRequest req) {
		String userName = req.getParameter("userName");
		System.out.println(userName);
		RegisterDTO fromDb = forgotService.forgotPassword(userName);
		if (fromDb != null) {
			int idFromDb = forgotService.updatePassword(userName, "Change");
			SimpleMailMessage mail = new SimpleMailMessage();
			mail.setFrom("hadiyasushil@gmail.com");
			mail.setTo("hadiyasushil@gmail.com");
			mail.setSubject("New Password");
			mail.setText("new passowrd= Change");
			javaMailSenderImpl.send(mail);
			return new ModelAndView("forgotPassword.jsp", "msg", "password updated");
		} else {
			return new ModelAndView("forgotPassword.jsp", "msg", "invalidusername");
		}

	}
}
