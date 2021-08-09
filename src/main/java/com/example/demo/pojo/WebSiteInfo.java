package com.example.demo.pojo;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;


public class WebSiteInfo {
	@Size(min = 3,max = 15,message = "more than three")
	
	private String webSiteName;
	@Min(value = 3,message = "enter min more than 3 charater")
	private Integer webSiteCategory;
	
	public Integer getWebSiteCategory() {
		return webSiteCategory;
	}
	public void setWebSiteCategory(Integer webSiteCategory) {
		this.webSiteCategory = webSiteCategory;
	}
	public WebSiteInfo() {
		System.out.println("Websiteinfo object created...........");
	}
	public String getWebSiteName() {
		return webSiteName;
	}
	public void setWebSiteName(String webSiteName) {
		this.webSiteName = webSiteName;
	}
	

}
