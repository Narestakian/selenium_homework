package StepsSelenide;

import ElementsSelenide.ActionClassTestElements;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;

public class ActionClassTestSteps extends ActionClassTestElements {
    public void openToolTipsPage(){
        open( "https://demoqa.com/tool-tips");

    }
    public void hoverOverToolTip() {

        tipBox.scrollIntoView("{block: 'center'}").hover();
    }


    public void verifyToolTipIsDisplayed() {
        tipText.shouldBe(visible);
    }
}

