package com.pandeys.comp.calc.api;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class CommunicationDTO {
	
	private String email;
	private PhoneNumber phone;
	
	public CommunicationDTO() {
	}
	
	public CommunicationDTO(String email, PhoneNumber phone) {
		this.email = email;
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public PhoneNumber getPhone() {
		return phone;
	}
	public void setPhone(PhoneNumber phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "CommunicationDTO [email=" + email + ", phone=" + phone + "]";
	}
}
