package PageObjectModelPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _7OTPverification {

	
	WebDriver driver;
	public _7OTPverification(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver , this);
	}
	
	
	@FindBy(xpath = "//label//div[@class='pull-left pp'][normalize-space()='B']") WebElement otpTxt;
	
	@FindBy(xpath = "//a[normalize-space()='Next »']") WebElement verifyBtn;
	
	public void clickOTPverifyBtn() {
//		if(otpTxt.getText().length()==6) {
//			verifyBtn.click();
//		}
		
      otpTxt.click();		
	}

	

}
