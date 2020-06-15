package com.Project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Project.utils.CommonMethods;

public class LoginPage extends CommonMethods{

	
	@FindBy(id = "txtUsername")
	public WebElement username;

	@FindBy(name = "txtPassword")
	public WebElement password;            
                                          
	@FindBy(css = "input#btnLogin")
	public WebElement loginBtn;

	@FindBy(xpath = "//div[@id='divLogo']/img")
	public WebElement logo;

	@FindBy(id ="spanMessage")
	public WebElement errorMsg;

	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void login(String userName , String Password) {
		sendText(username ,userName);
		sendText (password, Password);
		click(loginBtn);
	}

	
}
