package ElementsSelenide;
import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;



public class WebTableTestElements {
    public String rowsLocator = "//*[@id='table1']//tbody//tr";
    public void printNamesAndDue() {

        ElementsCollection rows = $$x(rowsLocator);

        rows.forEach(row -> {
            String name = row.$x(".//td[2]").getText();
            String Due = row.$x(".//td[4]").getText();
            System.out.println(name + " - " + Due);
            rows.findBy(text("Frank")).shouldBe(visible);

        });


    }
}





