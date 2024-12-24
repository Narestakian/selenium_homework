import StepsSelenide.ActionClassTestSteps;
import Utils.SetUpClass;
import org.testng.annotations.Test;

public class ActionClassTest extends SetUpClass {
    ActionClassTestSteps openToolTipsPage = new ActionClassTestSteps();
    @Test
    public void Task2(){
        openToolTipsPage.openToolTipsPage();
        openToolTipsPage.hoverOverToolTip();
        openToolTipsPage.verifyToolTipIsDisplayed();
    }
}



