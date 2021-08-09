package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.pojo.WebSiteInfo;

@Controller
@ControllerAdvice
public class TestController {
	
//	@ModelAttribute("info")
//	public WebSiteInfo getWebSiteInfo()
//	{
//		System.out.println("@modelAttribute method called 1..............");
//		WebSiteInfo w=new WebSiteInfo();
//		w.setWebSiteName("vipin");
//		w.setWebSiteCategory("student");
//		return w;
//	}
//	
//	       @RequestMapping("/show")
//			public String m1(Model m)
//			{
//		    WebSiteInfo ww=(WebSiteInfo)m.getAttribute("info");
//		    System.out.println("website name show : "+ww.getWebSiteName());
//		    System.out.println("website category show : "+ww.getWebSiteCategory());
//				return "index";
//			}
//	       
//	       @ModelAttribute("WebTitle")
//	       public String title()
//	       {
//	    	   System.out.println("@ModelAttribute called 2............");
//	    	   return "Java Word";
//	       }
//            
//	       @RequestMapping("/show1")
//			public String m2(Model m)
//			{
//		    WebSiteInfo ww=(WebSiteInfo)m.getAttribute("info");
//		    System.out.println("website name : "+ww.getWebSiteName());
//		    System.out.println("website category : "+ww.getWebSiteCategory());
//				return "index";
//			}
}
