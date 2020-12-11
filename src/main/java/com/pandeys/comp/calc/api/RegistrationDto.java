package com.pandeys.comp.calc.api;

import java.util.Arrays;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.pandeys.comp.calc.validator.Age;

public class RegistrationDto {
	@NotEmpty(message = "{registration.name.blank}")
	private String name;
	
//	@NotEmpty(message = "* User Name cannot be blank")
	private String userName;
	private char[] password;
	private String countryName;
	private String[] hobbies;
	private String gender;
	
	@Age(lower = 30, upper = 50)
	private Integer age;
	
//	@Valid
	private CommunicationDTO communicationDto;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public char[] getPassword() {
		return password;
	}
	public void setPassword(char[] password) {
		this.password = password;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String[] getHobbies() {
		return hobbies;
	}
	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public CommunicationDTO getCommunicationDto() {
		return communicationDto;
	}
	public void setCommunicationDto(CommunicationDTO communicationDto) {
		this.communicationDto = communicationDto;
	}
	
	@Override
	public String toString() {
		return "RegistrationDto [name=" + name + ", userName=" + userName + ", password=" + Arrays.toString(password)
				+ ", countryName=" + countryName + ", hobbies=" + Arrays.toString(hobbies) + ", gender=" + gender
				+ ", communicationDto=" + communicationDto + "]";
	}
}
