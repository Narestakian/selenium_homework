package StepsSelenide;

import ElementsSelenide.WebTableTestElements;
import static com.codeborne.selenide.Selenide.open;

public class WebTableTestSteps extends WebTableTestElements {


    public void openTablesPage () {

        open("https://the-internet.herokuapp.com/tables");

    }

    public void printTableData() {
        printNamesAndDue();
    }

}


