package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

public class BaseTest {

	WebDriver driver;
	String baseURL = "https://www.google.com/";
	
	@BeforeClass
	public void driver() {
	
	System.setProperty("webdriver.gecko.driver","C:\\Users\\mujtaba.mehdi\\Desktop\\POM\\CarPal-master\\carpal\\src\\test\\resources\\Drivers\\geckodriver.exe");
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\Mujtaba.m\\Desktop\\Drivers\\chromedriver.exe");
	
/*	ProfilesIni profile = new ProfilesIni();
	FirefoxProfile testprofile = profile.getProfile("selenium");
	FirefoxOptions options = new FirefoxOptions();
	options.setProfile(testprofile);
	DesiredCapabilities dc = new DesiredCapabilities();
	dc.setCapability("marionatte", false);
	options.merge(dc);
	
*/
	
	
	driver = new FirefoxDriver();
	FirefoxOptions firefoxoptions = new FirefoxOptions();
	firefoxoptions.addArguments("start-maximized");
	firefoxoptions.addArguments("");
	driver.get(baseURL);
	
	}

	
	@AfterClass
	public void CloseBrowser() {
		driver.quit();
	}
}