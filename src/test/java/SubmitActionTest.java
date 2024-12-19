import Steps.TextBoxPageSteps;
import Utils.SetUpClass;
import org.testng.Assert;
import org.testng.annotations.Test;
public class SubmitActionTest extends SetUpClass {
    @Test
    public void Task5(){

        driver.get("https://demoqa.com/text-box");
        TextBoxPageSteps textBoxSteps = new TextBoxPageSteps(driver);
        textBoxSteps.scrollToSubmitButton();
        Assert.assertTrue(textBoxSteps.getSubmitButton().isDisplayed(), "Submit button is not displayed");

        textBoxSteps.clickSubmitButton();
    }
}



