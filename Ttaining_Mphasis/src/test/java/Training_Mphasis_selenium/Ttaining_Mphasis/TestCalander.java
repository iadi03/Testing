package Training_Mphasis_selenium.Ttaining_Mphasis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestCalander {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();

		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");

		driver.findElement(By.xpath("//*[@id=\"datepickers\"]/tbody/tr[6]/td[2]/img")).click();

	}

}
