package ElementsSelenide;

import StepsSelenide.RobotClassTestSteps;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class RobotClassTestElements extends RobotClassTestSteps {
    public SelenideElement searchField = $("[name='q']");
    public SelenideElement firstResultLink = $$("h3").first();

}
