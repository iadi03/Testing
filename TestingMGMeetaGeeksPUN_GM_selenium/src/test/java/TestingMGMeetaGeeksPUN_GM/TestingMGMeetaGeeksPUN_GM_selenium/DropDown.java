package TestingMGMeetaGeeksPUN_GM.TestingMGMeetaGeeksPUN_GM_selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/");
		
		
		WebElement drpEle = driver.findElement(By.id("searchDropdownBox"));
		Select drpelem = new Select(drpEle);
		
		
		
		 
		 driver.findElement(By.xpath("//option[@value='search-alias=appliances']")).click();
		 
		 //drpelem.selectByVisibleText("Appliances");
		 
		 driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Earbuds");
		 
		 driver.findElement(By.xpath("//div[@id='nav-fill-search']//div[3]//div[1]")).click();
		
		//drpelem.selectByValue("India");
		//driver.findElement(By.id("nav-search-submit-button")).click();
		
//		List<WebElement> options = drpelem.getOptions();
//		System.out.println("number of elements in:" + options.size());  // print number of options
//		
//		for(int i = 0; i < options.size(); i++) { //printing the list of options
//			System.out.println(options.get(i).getText());
//		}
//		
//		//OR
//		
//		for(WebElement op:options) {
//			System.out.println(op.getText());
	}
		
	}
