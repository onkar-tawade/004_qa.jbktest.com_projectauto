package PageObjectModelPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _3NumOfQuestionNextBtn {

	WebDriver driver;
	
	public _3NumOfQuestionNextBtn(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver , this);
	}
	
	
	@FindBy (xpath = "//input[@value='20']" ) WebElement numOfQuestions;
	
	@FindBy (xpath = "//button[@id='countbtn']" ) WebElement Nextbtn;

	
	
	
	public void setQuestion_clickNext() throws InterruptedException {
		numOfQuestions.click();
		Nextbtn.click();
		 Thread.sleep(2000);

	}
}
