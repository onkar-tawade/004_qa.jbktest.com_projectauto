package PageObjectModelPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _0mainmethod {

	public static void main(String[] args) throws InterruptedException {

//		WebDriver driver;
//		driver= new ChromeDriver();
//		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		driver.manage().window().maximize();
//		
//		driver.get("https://thekiranacademy.com/test/online-exam");
//		driver.findElement(By.xpath("//a[contains(@href,'#MANUAL-TESTING')]")).click();
//		Thread.sleep(5000);
//		
//		
//		/// here we scrolling the page....towords Up...
//		JavascriptExecutor js = (JavascriptExecutor) driver;	
//		
//    /// 3]Scroll again to initial position of the page.........
//        js.executeScript("window.scrollBy(0,-document.body.scrollHeight)", "");
////        System.out.println(js.executeScript("return window.pageYOffset;"));
//	
//		
//			
//		WebElement quizz =  driver.findElement(By.xpath("//p[normalize-space()='Test Scenarios & Test case']"));
//		System.out.println(quizz.getText());
//		quizz.click();
//		
//		driver.findElement(By.xpath("//input[@value='20']")).click(); //input[@id='normalcount']
//		
//		driver.findElement(By.xpath("//button[@id='countbtn']")).click();
//        Thread.sleep(5000);
//		
//        driver.findElement(By.xpath("//input[@id='loginmobile']")).click();
// 
//		driver.findElement(By.xpath("//input[@id='loginmobile']")).sendKeys("9022737332");
//		driver.findElement(By.xpath("//input[@id='loginbtn']")).click();
//		Thread.sleep(3000);
//		driver.quit();
		
		int i =12;
		String s = "I am still";
		System.out.println(s.length());
		String h= s.substring(2, s.length());
		System.out.println(h);
	}

}
