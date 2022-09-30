package Test_new;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

//import page_object.pages;

public class diff_browser {
	public class test_base_with_diff_browser {
		WebDriver driver;
		pages_new obj;

		@Parameters({"Browser"})
		@BeforeClass
		public void login(String Browser) {//If we want to use multiple browsers
			if (Browser.equalsIgnoreCase("Chrome")) {
				System.setProperty( "webdriver.chrome.driver", "/Users/satyarth/Downloads/automation/chromedriver");
				WebDriver driver = new ChromeDriver();//will open browser
				driver.get("https://www.amazon.in/");//will launch the site
				obj=new pages_new(driver);
			}
			else if(Browser.equalsIgnoreCase("edge")){
				System.setProperty( "webdriver.edge.driver", "/Users/satyarth/Downloads/automation/chromedriver");
				WebDriver driver = new ChromeDriver();//will open browser
				driver.get("https://www.amazon.in/");//will launch the site
				obj=new pages_new(driver);
			}


		}
		@AfterClass
		public void logout() {
			driver.close();
		}

}
}
