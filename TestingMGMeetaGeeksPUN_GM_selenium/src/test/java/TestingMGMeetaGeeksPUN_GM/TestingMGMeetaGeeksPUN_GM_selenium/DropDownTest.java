
package TestingMGMeetaGeeksPUN_GM.TestingMGMeetaGeeksPUN_GM_selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDownTest {

    private WebDriver driver;
    private WebDriverWait wait;

    public void init(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }


    public List<String> getCustomDropdownOptions(By toggleLocator, By optionsLocator) {
        // Open the dropdown
        WebElement toggle = wait.until(ExpectedConditions.elementToBeClickable(toggleLocator));
        toggle.click();

        // Wait until all options are visible
        List<WebElement> options = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(optionsLocator));

        List<String> texts = new ArrayList<>();
        for (WebElement opt : options) {
            String txt = opt.getText();
            if (txt != null) {
                texts.add(txt.trim());
            }
        }
        return texts;
    }
}
