package steps;

import com.codeborne.selenide.Condition;
import elements.FloatingMenuElements;

import static com.codeborne.selenide.Selenide.open;

public class FloatingMenuSteps extends FloatingMenuElements {
    public void openScrollPage(){
        open("https://the-internet.herokuapp.com/");
    }

    public void scrollToFooter(){
        scrollElement.scrollTo();
    }

    public void checkFloatingMenuIsVisibility(){
        floatingMenu.shouldBe(Condition.visible);
    }
}
