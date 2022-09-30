package Test_new;


	//import org.openqa.selenium.WebDriver;
	//import org.openqa.selenium.chrome.ChromeDriver;
	 

	//import page_object.pages;

	public class test_amazon_1 extends test_base {
		
		public void webdriver_launch() {



			obj_1.getdrpdown().selectByVisibleText("Books");
			obj_1.gettextfield().sendKeys("da vinci code");
			obj_1.getmagnibtton().click();
			obj_1.getsigned().click();// click on "sign-in account and list"
			//obj.clicksigned().click();// click on sign-in button
			obj_1.getclickstrt().click();
			

		}

}
