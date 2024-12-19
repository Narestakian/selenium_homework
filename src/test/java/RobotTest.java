import Steps.GoogleSteps;
import Utils.SetUpClass;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class RobotTest extends SetUpClass {
    @Test
    public void Task() throws AWTException {

        driver.get("https://www.google.com/");
        GoogleSteps googleSteps = new GoogleSteps(driver);
        googleSteps.performSearch("Selenium Robot Class example");
        boolean isFirstResultNavigable = googleSteps.navigateToFirstResult();
        Assert.assertTrue(isFirstResultNavigable, "Failed to navigate to the first result!");
    }
}