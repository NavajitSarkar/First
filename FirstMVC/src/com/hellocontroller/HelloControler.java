package com.hellocontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HelloControler extends AbstractController{
	//Changes in the feature branch
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView modelview = new ModelAndView("HelloPage");
		modelview.addObject("message", "hey welcome to the first mvc project");
		return modelview;
	}

}
