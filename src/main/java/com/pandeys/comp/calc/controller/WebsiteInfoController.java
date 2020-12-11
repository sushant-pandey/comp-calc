package com.pandeys.comp.calc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.pandeys.comp.calc.api.WebsiteInfoDTO;

@Controller
@ControllerAdvice(basePackages = {"com.pandeys.comp.calc.controller"})
@SessionAttributes("websiteInfo")
public class WebsiteInfoController {
	
	@ModelAttribute("websiteInfo")
	public WebsiteInfoDTO getWebsiteInfoDTO() {
		WebsiteInfoDTO websiteInfo = new WebsiteInfoDTO();
//		websiteInfo.setWebsiteName("My Website");
//		websiteInfo.setWebsiteCategory("My website category");
		return websiteInfo;
	}
	
	@RequestMapping("/showPage01")
	public String getShowPage01(@ModelAttribute("websiteInfo") WebsiteInfoDTO websiteInfoDTO) {
		websiteInfoDTO.setWebsiteName("My Website");
		websiteInfoDTO.setWebsiteCategory("My website category");
		return "website-info";
	}
	
	@RequestMapping("/showPage02")
	public String getShowPage02(@ModelAttribute("websiteInfo") WebsiteInfoDTO websiteInfoDTO) {
		System.out.println("Inside show page 02");
		System.out.println(websiteInfoDTO.getWebsiteName());
		System.out.println(websiteInfoDTO.getWebsiteCategory());
		return "website-info";
	}
}
