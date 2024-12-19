import Steps.ProgressBarPageSteps;
import Utils.SetUpClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WaitsTest extends SetUpClass {
    @Test
    public void Task2() {

        driver.get("https://demoqa.com/progress-bar");
        ProgressBarPageSteps progressBarSteps = new ProgressBarPageSteps(driver);

        progressBarSteps.clickStartButton();
        Assert.assertTrue(driver.findElement(Elements.ProgressBarPageElements.START_BUTTON).isDisplayed(),
                "Start button is not displayed!");

        progressBarSteps.waitForProgressBarToReach100();

        String progressText = progressBarSteps.getProgressBarText();
        Assert.assertEquals(progressText, "100%", "Progress bar did not reach 100%!");
        System.out.println(progressText);
    }
}
