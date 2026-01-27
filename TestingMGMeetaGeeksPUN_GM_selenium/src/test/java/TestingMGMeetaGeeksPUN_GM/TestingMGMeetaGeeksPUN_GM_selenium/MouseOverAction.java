package TestingMGMeetaGeeksPUN_GM.TestingMGMeetaGeeksPUN_GM_selenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MouseOverAction {
	public static void main(String[] args){
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		
		driver.get("https://jqueryui.com/droppable/");
		
		
		
		
		
		
	}
	

}
