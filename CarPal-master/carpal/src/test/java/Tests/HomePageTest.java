package Tests;

import org.testng.annotations.Test;

import Pages.HomePage;

public class HomePageTest extends BaseTest {
	
	@Test(priority=0)
	public void searchGoogleTest() throws InterruptedException {

		//String createURL = "https://www.google.com/";
		
		   //*************PAGE INSTANTIATIONS*************
        HomePage HomePage = new HomePage(driver);
 
        //*************PAGE METHODS********************
        HomePage.searchGoogle(baseURL);
	}
	
	
}