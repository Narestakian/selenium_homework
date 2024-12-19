import Steps.SeleniumPageSteps;
import Utils.SetUpClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ScrollHeightTest extends SetUpClass {
    @Test
    public void Task6() throws InterruptedException {

        driver.get("https://www.selenium.dev/");
        SeleniumPageSteps seleniumSteps = new SeleniumPageSteps(driver);
        seleniumSteps.scrollToPageBottom();
        Thread.sleep(2000);

        Assert.assertTrue(seleniumSteps.waitForFooter().isDisplayed(), "Footer is not displayed");
    }
}
