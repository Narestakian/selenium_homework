package elementsSelenide;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class ToDoApplicationElements {
    public SelenideElement ToDoList = $("#to-do-list");

    public SelenideElement addedNewToDo = $("input[placeholder='Add new todo']");

    public ElementsCollection taskList = $$("ul li");

    //public ElementsCollection deleteButtons = $$("ul li span i.fa-trash");
    public SelenideElement deleteButton = $x("(//i[@class='fa fa-trash'])[2]");
}
