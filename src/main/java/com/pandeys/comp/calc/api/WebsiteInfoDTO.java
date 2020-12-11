package com.pandeys.comp.calc.api;

public class WebsiteInfoDTO {
	private String websiteName;
	private String websiteCategory;
	public String getWebsiteName() {
		return websiteName;
	}
	public void setWebsiteName(String websiteName) {
		this.websiteName = websiteName;
	}
	public String getWebsiteCategory() {
		return websiteCategory;
	}
	public void setWebsiteCategory(String websiteCategory) {
		this.websiteCategory = websiteCategory;
	}
	
	@Override
	public String toString() {
		return "WebsiteInfoDTO [websiteName=" + websiteName + ", websiteCategory=" + websiteCategory + "]";
	}
	
	
}
