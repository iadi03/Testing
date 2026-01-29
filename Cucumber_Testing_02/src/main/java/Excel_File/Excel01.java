package Excel_File;

import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
 
import java.io.FileInputStream;
import java.time.Duration;
import org.apache.poi.ss.usermodel.*;
 
public class Excel01 {
 
    WebDriver driver;
    WebDriverWait wait;
    String expectedResult;
 
    private String readExcel(int row, int col) {
        try (FileInputStream fis = new FileInputStream("C:/Users/aditya.sah/eclipse-workspace/Cucumber_Testing_02/src/test/java/ExcelFeature/Data.xlsx")) {
            Workbook wb = WorkbookFactory.create(fis);
            Sheet sheet = wb.getSheetAt(0);
            Row r = sheet.getRow(row);
            Cell c = r.getCell(col);
            return c == null ? "" : c.toString().trim();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
 
    @Given("I am on the BooksWagon signup page")
    public void openSignupPage() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.bookswagon.com/login?q=signup");
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }
 
    @When("I sign up using excel row {int} expecting {string}")
    public void signup_from_excel_row(Integer excelRow, String result) {
 
        expectedResult = result.toLowerCase();
 
        int rowIndex = excelRow;
        String name = readExcel(rowIndex, 0);
        String mobile = readExcel(rowIndex, 1);
 
        driver.findElement(By.id("ctl00_phBody_SignUp_txtName")).sendKeys(name);
        driver.findElement(By.id("ctl00_phBody_SignUp_txtEmail")).sendKeys(mobile);
    }
 
    @When("I click captcha and wait")
    public void click_captcha_and_wait() {
 
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
                By.cssSelector("iframe[title*='reCAPTCHA']")));
 
        wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector("#recaptcha-anchor"))).click();
 
        driver.switchTo().defaultContent();
 
        try { Thread.sleep(8000); }
        catch (InterruptedException ignored) {}
    }
 
    @When("I click continue")
    public void click_continue() {
 
        driver.findElement(By.id("ctl00_phBody_SignUp_btnContinue")).click();
        try { Thread.sleep(2000); }
        catch (InterruptedException ignored) {}
    }
 
    @Then("Signup should match expected result")
    public void validateResult() {
 
        boolean captchaVisible = false;
 
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.cssSelector("iframe[title*='reCAPTCHA'], #recaptcha-anchor")));
            captchaVisible = true;
        }
        catch (Exception e) {
            captchaVisible = false;
        }
 
        String actualResult = captchaVisible ? "pass" : "fail";
 
        Assert.assertEquals(actualResult, expectedResult, "Signup result mismatch!");
 
        driver.quit();
    }
}