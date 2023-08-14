package pageObject;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {

	public WebDriver Idriver;

	public AdminPage(WebDriver rdriver)//right click--> source--> build constuctor
	{Idriver=rdriver;
	PageFactory.initElements(rdriver, this);//to initialise web element in pagefactory class of admin feature file

	}

	@FindBy(xpath="//input[@id='Email']")//@FindBy internally use locator to find element in MAVEN
	WebElement txtEmail;
	@FindBy(xpath="//input[@id='Password']")
	WebElement txtPassword;//txpassword is used to set our password
	@FindBy(xpath="//input[@id='Log in']")
	WebElement btnLogin;

	//user defined functionality for each web element and we can call the method
	//we are sending parameter from feature file
	
	public void setUsername(String uname) {
		txtEmail.sendKeys(uname);
	}

	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}

	public void clickOnLogin() {
		btnLogin.click();
	}

}
