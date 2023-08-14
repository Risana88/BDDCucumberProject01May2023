package stepdefinition;

import java.io.File;
import java.io.IOException;

import org.junit.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.AdminPage;

public class Stepdefinition extends Base {
	
	@Before //executes before all scenarios
	public void setup() throws Exception {
		System.out.println("Step up method executed");
		//driver=new ChromeDriver();
	
		String browser=	realConfig.getBrowser();//19-32 is for config properties-->application test for different browser program
	Thread.sleep(2000);
		if(browser.equalsIgnoreCase("chrome")) {
		
		driver=new ChromeDriver();
	}
	
	else if(browser.equalsIgnoreCase("firefox")	) {
		driver=new FirefoxDriver();
	}
	else if(browser.equalsIgnoreCase("internetexplorer")	) {
		driver=new InternetExplorerDriver();
	}
	}
		
		
	 
	@Given("User Launch Chrome Browser")
	public void user_lanch_chrome_browser() {
		//System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver"); Maven will automatically get update from the driver
		
	 // driver=new ChromeDriver(); removed when before is given-->above step
	  
	  ad=new AdminPage(driver);//create object of AdminPage JAva class
	}

	@When("User open url {string}")
	public void user_open_url(String url) {
	   driver.get(url);
	}

	@When("User enter Email as {string} and password as {string}")
	public void user_enter_email_as_and_password_as(String email, String password) {
	   ad.setUsername(email);
	   ad.setPassword(password);
	}

	@When("User click on Login button")
	public void user_click_on_login_button() {
	   ad.clickOnLogin();
	}

	@Then("User verify page title should be {string}")
	public void user_verify_page_title_should_be(String string) {
	
	}

	@Then("close browser")
	public void close_browser() {
	   driver.close();
	}
	
	
//addd new customer
	//copy paste from add new customer feature file
	
	
	
	
	
	
	
	
	
	
	
	@After//tear down method is executed after every scenario
	public void tearDown(Scenario sc) {
		
		System.out.println("Tear down is executed");
		//for capturing screenshot of failed scenarios
		if(sc.isFailed()==true) {
			String fileWithPath="/Users/rizjaz/Desktop/Automation/eclipse/java-2023-03/01May2023CucumberMavenProject/screenshot.png";//create a folder under project-->right click pfolder-->properties-->copy path
			//convert web driver object to Takescreenshot
			
			TakesScreenshot scrshot= ((TakesScreenshot)driver);
			//call getscreenshot  method to create image file
			
			File scrFile=scrshot.getScreenshotAs(OutputType.FILE);
			
			File destFile=new File(fileWithPath);
		try {
			FileUtils.copyFile(scrFile,destFile);
		}
			catch(IOException e) {
				e.printStackTrace();
			}
			}}}
		
		



