package PageObjectModelPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _5SignUpFunctionality {

	
	WebDriver driver;
	/// Constructor
	public _5SignUpFunctionality(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//a[@id='signup-tab']") WebElement signUpbtn;
	
	@FindBy(xpath = "//input[@id='name']") WebElement nameTextBox;
	
	@FindBy(xpath = "//input[@id='emailid']") WebElement emailTextBox;
	
	@FindBy(xpath = "//input[@id='mobile']") WebElement mobileNumTextBox;
	
	@FindBy(xpath = "//input[@id='agree']") WebElement agreeCheckBox;
	
	@FindBy(xpath = "//input[@id='emailbtn']") WebElement proceedBtn;
	
	
    public void clickSignUpbtn() {
		signUpbtn.click();
	}
	
	public void setName(String name) {
		nameTextBox.sendKeys(name);
	}
	
	public void setEmail(String email) {
		emailTextBox.sendKeys(email);
	}
	
    public void setMobileNumber(String mobileNum) {
		mobileNumTextBox.sendKeys(mobileNum);
	}
    
    public void clickAgreeCheckBox() {
		agreeCheckBox.click();
	}
    
    public void clickProceedBtn() {
		proceedBtn.click();
   	}

    
    

	
	
}
