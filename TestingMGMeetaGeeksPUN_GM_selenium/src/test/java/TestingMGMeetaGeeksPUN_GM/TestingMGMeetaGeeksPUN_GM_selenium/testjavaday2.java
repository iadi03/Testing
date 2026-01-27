package TestingMGMeetaGeeksPUN_GM.TestingMGMeetaGeeksPUN_GM_selenium;
import org.testng.annotations.Test;
import org.testng.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Run All
public class testjavaday2 {

	perform_login sd211 = new perform_login();
    WebDriver driver = new ChromeDriver();
    String Expected = "My Orders";

    String ErrStr = "Warning: Your account has exceeded allowed number of login attempts. Please try again in 1 hour.";

    @Test(priority = 1)
    // Run / Debug
    public void Test1() throws InterruptedException {
        sd211.init(driver);
        Thread.sleep(3000);
        sd211.Invoke_Page();
        Thread.sleep(3000);
        String ActStr = sd211.Perform_Login_Valid("gayatrimis2@gmail.com", "gayatrimis2@gmail.com");
        Thread.sleep(3000);
        Assert.assertEquals(Expected, ActStr);
        Thread.sleep(5000);
        sd211.Log_out();
    }

    @Test(priority = 2)
    // Run / Debug
    public void Test2() throws InterruptedException {
        sd211.init(driver);
        sd211.Invoke_Page();

        String Null_Val = sd211.Invalid_Null_Login("", "");

        Assert.assertEquals(Null_Val.trim(), ErrStr.trim());
    }
}

