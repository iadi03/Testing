package screenshot;
import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
 
import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
 
public class ScreenshotSteps {
 
    private WebDriver driver;
 
    @Given("I open the browser")
    public void i_open_the_browser() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
    }
 
    @When("I go to {string}")
    public void i_go_to(String url) {
        driver.get(url);
    }
 
    @Then("I take screenshot as {string}")
    public void i_take_screenshot_as(String name) throws Exception {
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String ts = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
        File target = new File("screenshot_" + name + "_" + ts + ".png");
        Files.copy(src.toPath(), target.toPath(), StandardCopyOption.REPLACE_EXISTING);
        System.out.println("Saved: " + target.getAbsolutePath());
        driver.quit();
    }
}