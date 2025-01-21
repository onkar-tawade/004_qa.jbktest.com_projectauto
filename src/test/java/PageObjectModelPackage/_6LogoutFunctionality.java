package PageObjectModelPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _6LogoutFunctionality {

	
	WebDriver driver;
	/// Constructor
	public _6LogoutFunctionality(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//a[@href='https://thekiranacademy.com/test/logout']") WebElement logoutBtn;
	                 //a[@href='https://thekiranacademy.com/test/logout']
	@FindBy(xpath = "//a[normalize-space()='Logout']") WebElement logoutBtn2;

	public void clickLogoutBtn() {
	    WebElement logoutBtn4=	driver.findElement(By.xpath("//a[@href='https://thekiranacademy.com/test/logout']"));

	    logoutBtn4.click();
		System.out.println("Logout button executed successfully...");
		
	}
	
	
	
}
