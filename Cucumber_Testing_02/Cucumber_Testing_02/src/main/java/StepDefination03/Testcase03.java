package StepDefination03;

import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
 
import java.time.Duration;
 
public class Testcase03 {
 
    WebDriver driver;
    WebDriverWait wait;
    String expectedResult; // pass/fail
 
    @Given("I am on the BooksWagon signup page")
    public void openSignupPage() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.bookswagon.com/login?q=signup");
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
 
    @When("I sign up using name {string} and mobile {string} expecting {string}")
    public void signup(String name, String mobile, String result) {
 
        expectedResult = result.toLowerCase();
 
        driver.findElement(By.id("ctl00_phBody_SignUp_txtName"))
              .sendKeys(name);
 
        driver.findElement(By.id("ctl00_phBody_SignUp_txtEmail"))
              .sendKeys(mobile);
 
        driver.findElement(By.id("ctl00_phBody_SignUp_btnContinue"))
              .click();
    }
 
    @Then("Signup should match expected result")
    public void validateResult() {
 
        boolean captchaVisible = false;
 
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.cssSelector("iframe[title*='reCAPTCHA'], #recaptcha-anchor")
            ));
            captchaVisible = true;   // captcha appeared = pass
        }
        catch (Exception e) {
            captchaVisible = false;  // captcha not seen = fail
        }
 
        // convert captcha detection to a string result
        String actualResult = captchaVisible ? "pass" : "fail";
 
        // Assertion
        Assert.assertEquals(actualResult, expectedResult,
                "Signup result mismatch!");
 
        driver.quit();
    }
}