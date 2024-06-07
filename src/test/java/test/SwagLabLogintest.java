package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basicAutomation.Browser1;
import basicAutomation.SwagLabLoginPage;

public class SwagLabLogintest {
	
WebDriver driver;
	
	@BeforeMethod
	
	public void beforeClassMethod() 
	{
		driver=Browser.launchBrowser("https/www.saucedemo.com/");
	}
		 
		
	
		@Test
		
		public void loginwithvaliduser() {
		SwagLabLoginPage swagLabLogintestpage =new SwagLabLoginPage(driver);
		swagLabLoginPage.enterUserName("standard_user");
		swagLabLoginPage.enterPassword("secret_sauce");
		swagLabLoginPage.clickonLoginButton();
		
		}
	


		
		
		
		
		
		
		
		
		@Test
		
		public void loginwithlockedoutuser() 
		{
			SwagLabLogintest swagLabLoginPage =new SwagLabLogintest(driver);
			swagLabLoginPage.enterUserName("locked_out_user");
			swagLabLoginPage.enterPassword("secret_sauce");
			swagLabLoginPage.clickonLoginButton();
			
		}
		
		@Test
		public void loginwithproblemuser()
		{
			SwagLabLogintest swagLabLoginPage =new SwagLabLogintest(driver);
			swagLabLoginPage.enterUserName("problem_user");
			swagLabLoginPage.enterPassword("secret_sauce");
			swagLabLoginPage.clickonLoginButton();
			
		}
		
		
		@Test
		public void loginwithperformanceglitchuseruser() {
			SwagLabLogintest swagLabLoginPage =new SwagLabLogintest(driver);
			swagLabLoginPage.enterUserName("locked_out_user");
			swagLabLoginPage.enterPassword("secret_sauce");
			swagLabLoginPage.clickonLoginButton();
			
		}
		
		
		
		
		
		
		
		
		
		
}
