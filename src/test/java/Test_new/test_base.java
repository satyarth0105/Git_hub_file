package Test_new;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	//import page_object.pages;

	public class test_base {
		WebDriver driver_n;
		pages_new obj_1;
		
		public void login() {
			System.setProperty( "webdriver.chrome.driver", "/Users/satyarth/Downloads/automation/chromedriver");
	    	WebDriver driver_n = new ChromeDriver();//will open browser
	    	driver_n.get("https://www.amazon.in/");//will launch the site
	    	obj_1=new pages_new(driver_n);
			

	}
	    public void logout() {
			driver_n.close();
	}

}
