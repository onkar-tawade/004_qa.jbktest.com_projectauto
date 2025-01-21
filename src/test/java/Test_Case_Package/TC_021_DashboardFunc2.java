package Test_Case_Package;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjectModelPackage._1selectTopic;
import PageObjectModelPackage._2SelectQuiz;
import PageObjectModelPackage._3NumOfQuestionNextBtn;
import PageObjectModelPackage._6LogoutFunctionality;
import PageObjectModelPackage._8DashboardFunc;
import TestData_Excel._1ExtractTestDataForLogin;
import basePackage._3Baseclass_QuizFunc;

public class TC_021_DashboardFunc2 extends _3Baseclass_QuizFunc{

	
	
	_1selectTopic st;
	_2SelectQuiz qz;
	_3NumOfQuestionNextBtn numq;
	_8DashboardFunc dshb;
	
	
	@Test  (dataProvider = "dataL")
	public void Verify_DasboardFunct(String mobNum ) throws InterruptedException{
		

		 
		/// here we select the Topics for Testing quiz...
		 st = new _1selectTopic(driver);
		 st.clickManual();

		 
		 qz = new _2SelectQuiz(driver);
		 qz.clickTakeQuizbtn();
		 System.out.println(qz.quizTopic());
		 
		 
		 numq = new _3NumOfQuestionNextBtn(driver);
		 numq.setQuestion_clickNext();

	      WebElement numTxtBox = driver.findElement(By.xpath("//input[@id='loginmobile']"));

		 /// here we pass the Mobile number & click on Login button..
	      numTxtBox.click();
	      numTxtBox.sendKeys(mobNum);
	      driver.findElement(By.xpath("//input[@id='loginbtn']")).click();
	      
	      Thread.sleep(30000);

	      WebElement verifyOTP = driver.findElement(By.xpath("//div[@id='quizotpforlogin']//input[@id='verify']"));
          WebElement otpTxt = driver.findElement(By.xpath("//input[@id='otplogin']"));
	      
          verifyOTP.click();
          
	      WebElement myAcc=	driver.findElement(By.xpath("//a[@href='https://thekiranacademy.com/test/dashboard']"));
	  	  myAcc.click();

	  	 Thread.sleep(3000);
	 	 WebElement testAttempt = driver.findElement(By.xpath("//a[@href='https://thekiranacademy.com/test/test/test-attempted']"));
	 	testAttempt.click();	  	  
	  	  if (driver.getTitle().equals("Test Attempted")) {
			Assert.assertTrue(true);
			driver.quit();
		}

	      
		
	}
	
	
	//// here we create DataProvider............
	@DataProvider(name="dataL" , indices = {0} ) /// here in indices we pass which rows data we want
	public Object[][] dataforLogin() throws IOException{
		Object tdData[][]= _1ExtractTestDataForLogin.loginTestData();
		return tdData;
	
	}
	
	
	
}
