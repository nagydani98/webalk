package com.example.webdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class JSPController {
	
	public static ModelAndView mav = new ModelAndView();
	
	@RequestMapping
	public ModelAndView index() {
		mav.setViewName("index");
		return mav;
	}
	
	@RequestMapping("createfurniture")
	public ModelAndView showFurnitureCreationPage() {
		mav.setViewName("createfurniture");
		return mav;
	}

}
