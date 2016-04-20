package com.foster.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DataMapping {
	WebDriver driver;
	
	public DataMapping(WebDriver driver) {
		this.driver = driver;
	}
	
	// Elements on Welcome Page
	
	WebElement txtUsername;
	public WebElement getTxtUsername() {
		txtUsername = driver.findElement(By.name("userName"));
		return txtUsername;
	}
	
	WebElement pwdPassword;
	public WebElement getPwdPassword() {
		pwdPassword = driver.findElement(By.name("password"));
		return pwdPassword;
	}
	
	WebElement btnSignIn;
	public WebElement getBtnSignIn() {
		btnSignIn = driver.findElement(By.name("login"));
		return btnSignIn;
	}
}
