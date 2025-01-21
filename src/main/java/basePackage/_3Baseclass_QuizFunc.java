package basePackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class _3Baseclass_QuizFunc {

	
	public WebDriver driver;
	
	@BeforeMethod
	@Parameters({"br"})
	public void setup(String br) throws InterruptedException {
		switch (br.toLowerCase()) {
		case "chrome" : driver = new ChromeDriver();
		break;
		case "edge"   : driver = new EdgeDriver();
		break;
		case "firefox" : driver = new FirefoxDriver();
		break;
		default : System.out.println("Invalid browser...");
		return;
		}
		
		
		driver.get("https://thekiranacademy.com/test/online-exam");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
		
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(80000000);
		driver.quit();
	}
	
	
}
