package stepdefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.BaseUtil;
 
public class CrossBrowser {
 
    boolean chrome, edge, firefox;
 
    @When("I open google on chrome edge and firefox")
    public void i_open_google_on_all_browsers() {
 
        BaseUtil util = new BaseUtil();
 
        chrome = util.openBrowser("chrome");
        edge = util.openBrowser("edge");
        firefox = util.openBrowser("firefox");
    }
 
    @Then("I should get the browser status")
    public void i_should_get_the_browser_status() {
 
        System.out.println("Chrome working : " + chrome);
        System.out.println("Edge working   : " + edge);
        System.out.println("Firefox working: " + firefox);
 
        if (chrome && edge && firefox) {
            System.out.println("ALL BROWSERS ARE RUNNING FINE ");
        } else {
            System.out.println("SOME BROWSERS FAILED ");
        }
    }
}
