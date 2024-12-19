import Steps.WebTablesPageSteps;
import Utils.SetUpClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTablesTest extends SetUpClass {

    @Test
    public void Task1() {
        driver.get("https://the-internet.herokuapp.com/tables");

        WebTablesPageSteps steps = new WebTablesPageSteps(driver);
        steps.waitForTableToBeVisible();

        boolean isFrankFound = steps.isNamePresentInTable("Frank");
        Assert.assertTrue(isFrankFound, "Frank is not in the table.");
    }
}






