package TestingMGMeetaGeeksPUN_GM.TestingMGMeetaGeeksPUN_GM_selenium;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class data_Scrapper {
	WebDriver driver;
	
	public void init(WebDriver driver) {
        this.driver = driver;
    }

    public void Invoke_Page() {
        driver.get("https://www.w3schools.com/html/html_tables.asp");
    }
		
	
		

		@Test 
		public void testWebTable()  { 
		WebElement simpleTable = driver.findElement(By.xpath("//table[@id=\"customers\"]//tr/td")); 

		    // Get all rows 
		    List<WebElement> rows = simpleTable.findElements(By.tagName("tr")); 
		    Assert.assertEquals(rows.size(),4); 

		    // Print data from each row 
		    for (WebElement row : rows) { 
		        List<WebElement> cols = row.findElements(By.tagName("td")); 
		        for (WebElement col : cols) {
		             System.out.print(col.getText() + "\t"); 
		           } System.out.println(); 
		       }
		    }

		
	}


//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//
//import java.util.List;
//
//public class data_Scrapper {
//
//    WebDriver driver;
//
//    @BeforeClass
//    public void setUp() {
//        driver = new ChromeDriver();
//        driver.get("https://www.w3schools.com/html/html_tables.asp");
//    }
//
//    @Test
//    public void test() {       
//    System.out.print(col.getText() + "\t");
//            }
//    
//            System.out.println();
//        }

