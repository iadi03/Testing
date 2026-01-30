package util;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.After;

import java.time.Duration;

public class BaseUtil {
    public WebDriver driver;
    private WebDriverWait wait;

   
    public boolean openBrowser(String browserName) {
        boolean status = false;

        try {
            switch (browserName.toLowerCase()) {
                case "chrome":
                    this.driver = new ChromeDriver();
                    break;
                case "edge":
                    this.driver = new EdgeDriver();
                    break;
                case "firefox":
                    this.driver = new FirefoxDriver();
                    break;
                default:
                    System.out.println("Invalid browser: " + browserName);
                    return false;
            }

            this.driver.manage().window().maximize();
            this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(15));

            this.driver.get("https://testerbud.com/practice-login-form");

//            Wait for the username field so we know page loaded
//            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));

            if (driver.getTitle().contains("Login Automation Practice Page | Selenium, Cypress, Playwright")) {
                status = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            status = false;
        } finally {
            System.out.println("DONE");
            // Leave the browser open for subsequent steps; quit in a @AfterMethod instead.
        }

        return status;
    }
    
    @After
    public void uname() {
        WebElement username = driver.findElement(By.id("formBasicEmail"));
        username.clear();
        username.sendKeys("user@premiumbank.com");
    }
 
    public void passw() {
        WebElement password = driver.findElement(By.id("formBasicPassword"));
        password.clear();
        password.sendKeys("Bank@123");

        WebElement button = driver.findElement(By.xpath("//*[@id=\"root\"]/div[3]/div[1]/div/div/div/form/button"));
        button.click();

        WebElement header = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//*[@id=\"root\"]/div[3]/div[1]/div/div/div/div[3]")));

        String actualText = header.getText().trim();
        Assert.assertEquals(actualText, "Login Successful! Welcome to Premium Banking.",
                "Expected success message not found! Actual text: " + actualText);

        System.out.println("Login Successful");
    }

    public void quit() {
        if (driver != null) {
            driver.quit();
        }
    }
}
