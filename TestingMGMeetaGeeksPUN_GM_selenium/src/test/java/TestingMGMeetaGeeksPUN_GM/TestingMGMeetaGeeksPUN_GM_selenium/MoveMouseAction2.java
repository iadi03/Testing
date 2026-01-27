package TestingMGMeetaGeeksPUN_GM.TestingMGMeetaGeeksPUN_GM_selenium;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoveMouseAction2 {


    @Test
    public void informationWithElements() {
    	
    	 WebDriver driver = new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        
         // Navigate to Url
         driver.get("https://www.selenium.dev/selenium/web/iframes.html");
        
         
         //switch To IFrame using Web Element
         WebElement iframe = driver.findElement(By.id("iframe1"));
         //Switch to the frame
         driver.switchTo().frame(iframe);
         assertEquals(true, driver.getPageSource().contains("We Leave From Here"));
         //Now we can type text into email field
         WebElement emailE = driver.findElement(By.id("email"));
         emailE.sendKeys("admin@selenium.dev");
         emailE.clear();
         driver.switchTo().defaultContent();
       
         
         //switch To IFrame using name or id
         WebElement iframe1=driver.findElement(By.name("iframe1-name"));
         //Switch to the frame
         driver.switchTo().frame(iframe1);
         assertEquals(true, driver.getPageSource().contains("We Leave From Here"));
         WebElement email = driver.findElement(By.id("email"));
         //Now we can type text into email field
         email.sendKeys("admin@selenium.dev");
         email.clear();
         driver.switchTo().defaultContent();
     
         
         //switch To IFrame using index
         driver.switchTo().frame(0);
         assertEquals(true, driver.getPageSource().contains("We Leave From Here"));
         
         //leave frame
         driver.switchTo().defaultContent();
         assertEquals(true, driver.getPageSource().contains("This page has iframes"));
         
         //quit the browser
         //driver.quit();
    }

}

