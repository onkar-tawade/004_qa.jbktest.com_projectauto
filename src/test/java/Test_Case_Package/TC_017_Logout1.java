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
import TestData_Excel._1ExtractTestDataForLogin;
import basePackage._2Baseclass_SignUp;

public class TC_017_Logout1 extends _2Baseclass_SignUp {

	_1selectTopic st;
	_2SelectQuiz qz;
	_3NumOfQuestionNextBtn numq;
	_6LogoutFunctionality logout;
	
	
	@Test  (dataProvider = "dataL")
	public void Verify_LogoutFunct(String mobNum ) throws InterruptedException{
		

		 
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
          
	      WebElement logoutBtn=	driver.findElement(By.xpath("//a[@href='https://thekiranacademy.com/test/logout']"));
	  	  logoutBtn.click();

	  	  if (driver.getTitle().equals("Top Software Training Institute in Pune for Leading IT Courses | TheKiranAcademy")) {
			Assert.assertTrue(true);
		}
	      Thread.sleep(5000);

	      
		
	}
	
	
	//// here we create DataProvider............
	@DataProvider(name="dataL" , indices = {0} ) /// here in indices we pass which rows data we want
	public Object[][] dataforLogin() throws IOException{
		Object tdData[][]= _1ExtractTestDataForLogin.loginTestData();
		return tdData;
	
	}
}
