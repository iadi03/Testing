package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
public class BaseUtil {
 
    public boolean openBrowser(String browserName) {
        WebDriver driver = null;
        boolean status = false;
 
        try {
            switch (browserName.toLowerCase()) {
 
                case "chrome":
                    driver = new ChromeDriver();
                    break;
 
                case "edge":
                    driver = new EdgeDriver();
                    break;
 
                case "firefox":
                    driver = new FirefoxDriver();
                    break;
 
                default:
                    System.out.println("Invalid browser: " + browserName);
            }
 
            driver.manage().window().maximize();
            driver.get("https://www.google.com");
 
            if (driver.getTitle().contains("Google")) {
                status = true;
            }
 
        } catch (Exception e) {
            status = false;
        } finally {
            if (driver != null) driver.quit();
        }
 
        return status;
    }
}