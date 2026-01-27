import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;


public class LifecycleNGTest {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("BeforeSuite: run once before entire suite (testng.xml scope)");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("AfterSuite: run once after entire suite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("BeforeTest: run before <test> in testng.xml");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("AfterTest: run after <test> in testng.xml");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("BeforeClass: run once before first @Test in this class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("AfterClass: run once after all @Test in this class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("BeforeMethod: run before each @Test method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("AfterMethod: run after each @Test method");
    }

    @Test
    public void sample() {
        System.out.println("TestNG test method");
        Assert.assertTrue(1 < 2);
    }
}
