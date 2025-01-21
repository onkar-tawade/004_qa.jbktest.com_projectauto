package Test_Case_Package;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjectModelPackage._1selectTopic;
import PageObjectModelPackage._2SelectQuiz;
import PageObjectModelPackage._3NumOfQuestionNextBtn;
import PageObjectModelPackage._5SignUpFunctionality;
import TestData_Excel._2ExtractTestDataForSignUP;
import basePackage._2Baseclass_SignUp;

public class TC_009_SignUP6 extends _2Baseclass_SignUp  {

	
	/// Test case to verify that sign up functionality with valid credentials....
	
	
	_1selectTopic st;
	_2SelectQuiz qz;
	_3NumOfQuestionNextBtn numq;
	_5SignUpFunctionality sgn;
	
	@Test(dataProvider = "dataS")
		public void Valid_Invalid_SignUP( String name , String email , String mNum) throws InterruptedException{
		 /// here we verify the Excel data
		/// here we select the Topics for Testing quiz...
		 st = new _1selectTopic(driver);
		 st.clickManual();

		 
		 qz = new _2SelectQuiz(driver);
		 qz.clickTakeQuizbtn();
		 System.out.println(qz.quizTopic());
		 
		 
		 numq = new _3NumOfQuestionNextBtn(driver);
		 numq.setQuestion_clickNext();

	     sgn = new _5SignUpFunctionality(driver);
	     sgn.clickSignUpbtn();
	     
	     sgn.setName(name);
	     sgn.setEmail(email);
	     sgn.setMobileNumber(mNum);
	     
	     
	     //// here we use JavascriptExecutor for scrolling the Page till element show on Screen.
	     JavascriptExecutor js = (JavascriptExecutor)driver;
	     WebElement proBtn = driver.findElement(By.xpath( "//input[@id='emailbtn']")); 
         js.executeScript("arguments[0].scrollIntoView();", proBtn );

         
	     sgn.clickAgreeCheckBox();
	     sgn.clickProceedBtn();
		 Thread.sleep(3000);

		 
		 WebElement errorEmail = driver.findElement(By.xpath("//div[@id='emailerr']"));
		 WebElement errorMobile = driver.findElement(By.xpath("//div[@id='mobileerr']"));
		 System.out.println(errorEmail.getText());
		 SignInConditions sgnc = new SignInConditions();
		 sgnc.condSignUp(email,mNum, errorEmail , errorMobile);
	     
	      
	}
	
	
	
	//// here we create DataProvider............
	@DataProvider(name="dataS" , indices = {4}) /// here in indices we pass which rows data we want
	public Object[][] dataforLogin() throws IOException{
		Object tdData[][]= _2ExtractTestDataForSignUP.SignUpTestData();
		return tdData;
	}
	
}
