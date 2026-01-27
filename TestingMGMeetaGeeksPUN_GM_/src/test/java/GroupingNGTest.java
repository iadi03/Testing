import org.testng.annotations.Test;
import org.testng.Assert;
public class GroupingNGTest {

	 @Test(groups = {"smoke"})
	    public void smokeTest() {
	        Assert.assertTrue(true);
	    }

	    @Test(groups = {"regression"})
	    public void regressionTest() {
	        Assert.assertEquals("aditya".toUpperCase(), "ADITYA");
	    }

	    @Test(groups = {"smoke", "regression"})
	    public void shared() {
	        Assert.assertNotNull(new Object());
	    }
	}

