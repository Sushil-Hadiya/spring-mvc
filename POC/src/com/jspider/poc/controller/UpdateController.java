package com.jspider.poc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jspider.poc.dto.RegisterDTO;
import com.jspider.poc.services.UpdateService;

@Controller
@RequestMapping("/")
public class UpdateController {

	@Autowired
	private UpdateService updateService;

	@RequestMapping(value = "/up.do", method = RequestMethod.POST)
	public ModelAndView update(RegisterDTO dto, HttpServletRequest req) {
		RegisterDTO fromSession = (RegisterDTO) req.getSession(false).getAttribute("regdto");
		dto.setId(fromSession.getId());
		System.out.println("Original data");
		System.out.println(fromSession);
		System.out.println("From Page update");
		System.out.println(dto);
		RegisterDTO update = updateService.update(dto);
		String msg;
		if (update != null) {
			req.getSession().setAttribute("regdto", dto);
			msg = "data Updated Successffuly";
		} else {
			msg = "Data failed to updated";
		}
		return new ModelAndView("Home.jsp", "msg", msg);
	}
}
