package PageObjectModelPackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _2SelectQuiz {

    WebDriver driver;
	
	
	public _2SelectQuiz(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver , this);
	} 
	
	
    @FindBy (xpath="//p[normalize-space()='Black Box Testing']") WebElement selectQuizbtn;

	
	public void clickTakeQuizbtn() throws InterruptedException {
	/// here we scrolling the page....towords Up...
	JavascriptExecutor js = (JavascriptExecutor) driver;	
	
/// 3]Scroll again to initial position of the page.........
    js.executeScript("window.scrollBy(0,-document.body.scrollHeight)", "");
    System.out.println(js.executeScript("return window.pageYOffset;"));
//    Thread.sleep(3000);


    selectQuizbtn.click();
//    Thread.sleep(3000);

	}
	
	public String quizTopic() {
		return selectQuizbtn.getText();
	}
	
	
}
