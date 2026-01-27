package TestingMGMeetaGeeksPUN_GM.TestingMGMeetaGeeksPUN_GM_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
 
public class page1 {
	public WebDriver driver;
	public void page1_init(WebDriver driver) {
		this.driver = driver;
		
	}
	
	By btn = By.xpath("//*[@id=\"target\"]");
	By out = By.xpath("//*[@id=\"result\"]");
	
		public String launch() {
			driver.get("https://the-internet.herokuapp.com/key_presses");
			driver.findElement(btn).sendKeys(Keys.BACK_SPACE);
			String res = driver.findElement(out).getText();
			return res;
		}
 
}
 
