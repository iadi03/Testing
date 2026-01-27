package TestingMGMeetaGeeksPUN_GM.TestingMGMeetaGeeksPUN_GM_selenium;

import org.openqa.selenium.WebDriver;

public class app2 {

    WebDriver driver;
    	public void init(WebDriver driver) {
    		this.driver = driver;
    	}



    public void invokeAwesomeQaApp() {
        driver.get("https://awesomeqa.com/ui");
    }

    public String AwesomeHomePageTitle() {
        String pageTitleHome = driver.getTitle();
        return pageTitleHome;
        
}}