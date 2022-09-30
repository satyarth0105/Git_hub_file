package Test_new;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class pages_new {
	WebDriver driver_n;
	
	@FindBy(id= "searchDropdownBox")// after typing findby and webelement , we will get option to import.
	WebElement getdropdown;// import webelement class
	public Select getdrpdown() {
		Select category = new Select(getdropdown);
		return category;
	}
	
	
	@FindBy(id ="twotabsearchtextbox")
	WebElement getsearchtextfield;
	public WebElement gettextfield() {
		return getsearchtextfield;
	}
	@FindBy(id ="nav-search-submit-button")
	WebElement getmagnifierbutton;
	public WebElement getmagnibtton() {
		return getmagnifierbutton;
	}
	@FindBy(id="nav-link-accountList")
	WebElement getSignin;
	public WebElement getsigned() {
		return getSignin;
		
	}
	/*@FindBy(id ="nav-flyout-ya-signin")
	WebElement clickSignin;
	public WebElement clicksigned() {
		return clickSignin;
		
	
	}*/
	
	@FindBy(linkText="Start here.")
	WebElement clickstart;
	public WebElement getclickstrt() {
		return clickstart;
	}
	
	@FindAll(@FindBy(className= "nav_a"))//@FindBy(className= "nav_a") will search only first element in the list.
	//If we want to search all elements , we will use @findall
	List <WebElement> verify_footer_link;//To import group of elements ,we have used list.
	public List<WebElement> getverifylink() {
		return verify_footer_link;
	}
	@FindAll(@FindBy(xpath="//span[@class='a-size-medium a-color-base a-text-normal']"))//here span is tagname which we can find 
	//by click on book name title where it will show class name.And class is attribute.
	List<WebElement> getrelatedbooks;
	public List<WebElement>  getrelatedbookss(){
		return getrelatedbooks;
	}
	
// for working with different browser we will create constructor.
	public pages_new(WebDriver driver){
		this.driver_n =driver;
		PageFactory.initElements(driver,this);
	}
	
}
