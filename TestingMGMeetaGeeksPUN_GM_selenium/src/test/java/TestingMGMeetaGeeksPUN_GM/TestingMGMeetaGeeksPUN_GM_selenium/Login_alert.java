package TestingMGMeetaGeeksPUN_GM.TestingMGMeetaGeeksPUN_GM_selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login_alert {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		
		WebElement unm = driver.findElement(By.name("login"));
		
		WebElement pwd = driver.findElement(By.id("password"));
		
		WebElement submessage = driver.findElement(By.xpath("//button[@type='submit'] "));
		
		Thread.sleep(1000);
		
		driver.findElement(By.name("login")).sendKeys("testdata1");
		submessage.click();
		
		
		Alert act = driver.switchTo().alert();
		
		
	

	}
}
