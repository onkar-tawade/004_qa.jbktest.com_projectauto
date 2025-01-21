package PageObjectModelPackage;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _1selectTopic {

	WebDriver driver;
	
	
	public _1selectTopic(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver , this);
	} 
	
	
	
	@FindBy (xpath="//a[contains(@href,'#MANUAL-TESTING')]") WebElement btnManualTest;
	

		
	public void clickManual() throws InterruptedException {
		btnManualTest.click();

	}
	
	

	
}
