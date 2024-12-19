import Steps.ToolTipsSteps;
import Utils.SetUpClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HoverTest extends SetUpClass {
    @Test
    public void hoverWithStableScroll() {

        driver.get("https://demoqa.com/tool-tips");

        ToolTipsSteps toolTipsSteps = new ToolTipsSteps(driver);
        toolTipsSteps.hoverOverToolTipButton();
        Assert.assertTrue(toolTipsSteps.isToolTipTextDisplayed(), "Tooltip text is not displayed!");
    }
}







