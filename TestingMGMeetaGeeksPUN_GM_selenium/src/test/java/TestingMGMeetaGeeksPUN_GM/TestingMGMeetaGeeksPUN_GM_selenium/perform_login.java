package TestingMGMeetaGeeksPUN_GM.TestingMGMeetaGeeksPUN_GM_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; 


public class perform_login { 
	 WebDriver driver;

	    public void init(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void Invoke_Page() {
	        driver.get("https://clicktime.symantec.com/15xVcHh2qpEgPv5boCzmK?h=QCYVzyLUm8bH6wdi23Xb5_1Dx1ooNNtCUoF8u_AHzJM=&u=https://awesomqa.com/ui/index.php?route%3Daccount/login%22%29%3B");
	    }

	    public void Log_out() {
	        driver.findElement(By.xpath("//*[@id='top-links']/ul/li[2]/a")).click();
	        driver.findElement(By.xpath("//*[@id='top-links']/ul/li[2]/ul/li[5]/a")).click();
	    }

	    public String Perform_Login_Valid(String email, String password) throws InterruptedException {
	        driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
	        driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(password);
	        driver.findElement(By.xpath("//input[@type='submit']")).click();
	        Thread.sleep(3000);
	        String msg = driver.findElement(By.xpath("//*[@id='content']/h2[1]")).getText();
	        return msg;
	    }

	    public String Invalid_Null_Login(String email, String password) throws InterruptedException {
	        driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
	        driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(password);
	        driver.findElement(By.xpath("//input[@type='submit']")).click();
	        Thread.sleep(3000);
	        String Error_msg = driver.findElement(By.xpath("//*[@id='account-login']/div[1]")).getText();
	        return Error_msg;
	    }
	}