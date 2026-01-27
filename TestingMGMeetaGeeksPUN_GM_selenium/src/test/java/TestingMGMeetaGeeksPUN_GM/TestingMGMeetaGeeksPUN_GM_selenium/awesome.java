package TestingMGMeetaGeeksPUN_GM.TestingMGMeetaGeeksPUN_GM_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class awesome {
	WebDriver driver = new EdgeDriver();
	
	app2 pg1 = new app2();
	
	String Exp_HomePgTitles = "Your Store";
	
	
	@Test(priority = 1)
	
	public void invokeApp_Awesome() {
		pg1.init (driver);
		pg1.invokeAwesomeQaApp();
	}
	
		
		
		@Test (priority = 2)
		public void Fetch_And_Validate_Title() {
			String HomepgTitles = pg1.AwesomeHomePageTitle();
			System.out.println("HomePgTitles " + " " + HomepgTitles );
			
			Assert.assertEquals(HomepgTitles, Exp_HomePgTitles);
		}
		
	}

