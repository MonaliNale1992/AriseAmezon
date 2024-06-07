package pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	
	
	public static WebDriver launchBrowser(String url) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Desktop\\Monali Automation\\Automation Tool\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();
	
	driver.get(url);
	
	driver.manage().window().maximize();
	
	return driver;
	}

}
