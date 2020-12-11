package com.pandeys.comp.calc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pandeys.comp.calc.api.WebsiteInfoDTO;

@Controller
public class WebsiteInfoController2 {

	@RequestMapping("/showPage04")
	public String getShowPage03(@ModelAttribute("websiteInfo") WebsiteInfoDTO websiteInfoDTO) {
		System.out.println(websiteInfoDTO.getWebsiteName());
		System.out.println(websiteInfoDTO.getWebsiteCategory());
		return "website-info";
	}
}
