package Training_Mphasis_selenium.Ttaining_Mphasis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cura_page11 {

	WebDriver driver;
	
	By num = By.name("username");
	
	public void init_cur_page(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public void Enter_Name_Login() {
		driver.findElement(num).sendKeys("testUser1");
	}
}
