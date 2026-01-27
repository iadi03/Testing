import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyNGTest {

    private boolean setupDone = false;

    @Test
    public void setup() {
        setupDone = true;
        Assert.assertTrue(setupDone);
    }

@Test(dependsOnMethods = "setup")
    public void runAfterSetup() {
        Assert.assertTrue(setupDone, "Should run only after setup");
    }
}
