package elements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class FloatingMenuElements {
    public SelenideElement scrollElement = $(By.id("page-footer"));
    public SelenideElement floatingMenu = $x("//*[@id='content']");
}

