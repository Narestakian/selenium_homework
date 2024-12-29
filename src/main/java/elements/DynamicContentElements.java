package elements;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class DynamicContentElements {
    public SelenideElement dynamicContent = $("a[href='/dynamic_content']");
    public ElementsCollection rowsContent = $$("div#content .row");

}
