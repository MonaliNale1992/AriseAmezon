package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabLoginPage {
	
	
	@FindBy (xpath = "//input[@id='user-name']")  private WebElement userName;
	@FindBy (xpath = "//input[@type='password']") private WebElement Pass;
	@FindBy (xpath = "//input[@type='submit']")   private WebElement login;
	
	public SwagLabLoginPage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
		public void enterUserName(String name) {
			userName.sendKeys(name);
			}
		
		public void enterPassword(String pass) {
			Pass.sendKeys(pass);
			
		}
		public void clickonLoginButton() {
			login.click();

}
}
