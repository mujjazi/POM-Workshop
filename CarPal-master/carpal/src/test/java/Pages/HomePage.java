package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public String baseURL = "https://www.google.com/";
	
	//********************Web Elements***************************
	
	By searchBy = By.name("q");
	String search_string = "Selenium with using POM";
	By viewbuBy = By.partialLinkText("View list of Business Units");
		
		//***********************Page Methods*****************************
		
		public HomePage searchGoogle(String url) throws InterruptedException {
			click(searchBy);
			writeText(searchBy,search_string);
			
			//String currURL = driver.getCurrentUrl();
			//Assert.assertEquals(currURL, url);
			//driver.navigate().back();
			return this;
		}
		
		public HomePage viewBUlink(String url) throws InterruptedException {
			click(viewbuBy);
			Thread.sleep(4000);
			String currURL = driver.getCurrentUrl();
			Assert.assertEquals(currURL, url);
			
			return this;
		}
	
}
