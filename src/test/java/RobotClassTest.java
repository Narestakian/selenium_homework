import ElementsSelenide.RobotClassTestElements;
import Utils.SetUpClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.visible;

public class RobotClassTest extends SetUpClass {
    RobotClassTestElements googleSearchPage = new RobotClassTestElements();
    @Test
    public void Task3(){
        googleSearchPage.openGooglePage();
        googleSearchPage.searchField.setValue("Selenide Robot Class example").pressEnter();
        googleSearchPage.firstResultLink.shouldBe(visible);
        googleSearchPage.searchField.pressTab().pressEnter();

    }
}
