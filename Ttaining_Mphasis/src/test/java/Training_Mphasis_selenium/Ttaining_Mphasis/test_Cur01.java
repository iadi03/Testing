package Training_Mphasis_selenium.Ttaining_Mphasis;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class test_Cur01{
	
	WebDriver driver = new EdgeDriver();
	
	cura_page1 cpage1 = new cura_page1();
	
	Cura_page11 cpga11 = new Cura_page11();
	
	
	@Test
	
	public void InvokeApp() {
		cpage1.cura_page1_init(driver);
		
		cpage1.LaunchApp("");
	}
	
	
	@Test
	
	public void Click_Make_appoinment() {
		
		cpage1.Click_On_Make_An_Appoinment();
	}
	
	public void PerformLogin_User() {
		cpga11.Enter_Name_Login();
	}
}
