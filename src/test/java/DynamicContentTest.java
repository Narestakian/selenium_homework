import org.testng.annotations.Test;
import steps.DynamicContentSteps;
import utils.SetUp;

public class DynamicContentTest extends SetUp {
    DynamicContentSteps dynamicContentSteps = new DynamicContentSteps();
    @Test
    public void dynamicContentTest(){
        dynamicContentSteps.openDynamicContentPage();
        dynamicContentSteps.clickOnDynamicContent();
        dynamicContentSteps.refreshAndValidateContentChange();

    }
}
