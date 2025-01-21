package Test_Case_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import basePackage._1Baseclass_Login;

public class SignInConditions extends _1Baseclass_Login {

	public void condSignUp(String email ,String mob , WebElement erEm ,WebElement erMobORerTC) {
		
		if(email.equals("0")) {
			Assert.assertTrue(true);
			System.out.println("Proceed not click");
		}
		else if (email.equals("onkartawade26@gmail.com")) {
			Assert.assertEquals(erEm.getText(), "Email Address already exists, please login with mobile number associated with this email. [check your inbox for welcome email]");
			
			System.out.println("Same Email Testcase.");
		}
		else if(mob.equals("7588573215") || mob.equals("9022737332")) {
			Assert.assertEquals(erMobORerTC.getText(), "Mobile number already exists, please login with this mobile number");
			System.out.println("Same mobile number Testcase.");
		}
		else if(!(email.contains("@"))) {
			Assert.assertEquals(erEm.getText(), "Please enter valid email");
			System.out.println("Valid email testcase");
		}
		else if (mob.length()!=10 || Character.isLetter(mob.charAt(0))) {
			
			Assert.assertEquals(erMobORerTC.getText(),"Please enter a valid number!");
			System.out.println("Valid mobile number testcase.");
		}
		else if(!(erMobORerTC.isSelected())) {
			Assert.assertEquals(erMobORerTC.getText(),"Please select terms and condition checkbox.");
            System.out.println("Terms & Conditions not selected");
		}
		
	}
	
	
}
