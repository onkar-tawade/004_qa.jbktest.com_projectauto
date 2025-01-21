package Test_Case_Package;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjectModelPackage._1selectTopic;
import PageObjectModelPackage._2SelectQuiz;
import PageObjectModelPackage._3NumOfQuestionNextBtn;
import TestData_Excel._1ExtractTestDataForLogin;
import basePackage._1Baseclass_Login;

public class TC_002_Login extends _1Baseclass_Login {

	//// Test case to verify that Login Functionality with Invalid Credentials.
	
	_1selectTopic st;
	_2SelectQuiz qz;
	_3NumOfQuestionNextBtn numq;
	
	
	
	@Test  (dataProvider = "dataL")
	public void Valid_Invalid_LoginTC(String mobNum ) throws InterruptedException{
		

		 
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
	      Thread.sleep(3000);

	      /*
	        this not working so we take the Locators using driver.
	        
	      lgn.setMobileNumber(mobNum);
	      Thread.sleep(3000);

	      lgn.clickLoginbtn();
	      Thread.sleep(3000);
	        
	       */  

			 char ch ='b';

		 if (mobNum.equals("9022737332")) {
			WebElement otpVerify = driver.findElement(By.xpath("//div[@id='quizotpforlogin']//h3[@id='quizheading']"));
			Assert.assertTrue(otpVerify.isDisplayed());
			System.out.println("Test case for Valid registered number is Passed.");
		}
		 else if (numTxtBox.getText().length() == 10 || mobNum.length()==10) {
             WebElement loginError = driver.findElement(By.xpath("//div[@id='loginerr']"));
			 
			 Assert.assertEquals(loginError.getText(), "You have not registered with us. Please click signup tab to get registered");
				System.out.println("Test case for 10 digit Mobile number but it is not registered is Passed.");

		}
		 else  {
			 WebElement loginError = driver.findElement(By.xpath("//div[@id='loginerr']"));
			 
			 Assert.assertEquals(loginError.getText(), "Please enter valid mobile number, If you have not registered, please click signup tab to get registered.");
				System.out.println("Test case for Invalid number is Passed.");

		 }
		
	}
	
	
	//// here we create DataProvider............
	@DataProvider(name="dataL" , indices = {1} ) /// here in indices we pass which rows data we want
	public Object[][] dataforLogin() throws IOException{
		Object tdData[][]= _1ExtractTestDataForLogin.loginTestData();
		return tdData;
	}
}
