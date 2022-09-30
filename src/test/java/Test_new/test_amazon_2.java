package Test_new;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

//import Test_scripts.Test_base;

public class test_amazon_2 {
	public class TC_amazon_002 extends test_base {
		

		public void registration()
		{
		WebElement ele =obj_1.getclickstrt();
		Actions act = new Actions(driver_n);// we are writing it because we want to mouse hover
		act.moveToElement(ele).build().perform();// will move the cursor to required element.
		obj_1.getclickstrt().click();// will click on link.
		
		boolean contains = driver_n.getTitle().contains("registration");
		if (contains){
			System.out.println("user is navigated to registration page");
			
		}
		else {
			System.out.println("not navigtated");
		}

}
}
}