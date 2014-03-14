package com.vit;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class LoginController extends AbstractController{

	private String message;
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		return new ModelAndView("loginPage","loginMessage",message);
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
