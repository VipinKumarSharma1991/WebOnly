package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.pojo.WebSiteInfo;
@Controller
public class DemoController {
	public DemoController() {
		System.out.println("######## DemoController object created ##########");
	}
	@RequestMapping("/")
	@ResponseBody
	public String homePage(@ModelAttribute("data") WebSiteInfo webSiteInfo)
	{
		return "index";
	}
	@RequestMapping("/getFormData")
	public ModelAndView name(@Valid @ModelAttribute("data") WebSiteInfo webSiteInfo,BindingResult binding) {
		System.out.println("enter");
		if(binding.hasErrors())
		{
			System.out.println("error");
			ModelAndView model=new ModelAndView();
			//model.addObject("model", webSiteInfo);
			model.setViewName("index");
			return model;
		}
		System.out.println("succes");
		ModelAndView model=new ModelAndView();
		model.addObject("model", webSiteInfo);
		model.setViewName("second");
		return model; 
	}
	

}
