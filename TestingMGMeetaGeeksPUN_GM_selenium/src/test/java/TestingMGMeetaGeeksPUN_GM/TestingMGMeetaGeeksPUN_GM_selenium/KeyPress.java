package TestingMGMeetaGeeksPUN_GM.TestingMGMeetaGeeksPUN_GM_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
 
import junit.framework.Assert;
 
public class KeyPress {
 
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		
		page1 s1 = new page1();
		String out = "You entered: BACK_SPACE";
		
		@Test
		public void f() {
			s1.page1_init(driver);
			String expec = s1.launch();
			Assert.assertEquals(expec,  out);
		
				
	}
}
