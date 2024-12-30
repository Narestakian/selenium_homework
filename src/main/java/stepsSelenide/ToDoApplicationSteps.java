package stepsSelenide;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import elementsSelenide.ToDoApplicationElements;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.switchTo;

public class ToDoApplicationSteps extends ToDoApplicationElements {
    public void openPage() {
        open("https://webdriveruniversity.com/");
    }

    public void scrollToList() {
        ToDoList.scrollTo();
    }

    public void clickToDoList() {
        ToDoList.click();
    }
    public ToDoApplicationSteps moveToToDo () {
        switchTo().window(1);
        return this;}

    public void clickAddedToDo() {
        addedNewToDo.shouldBe(Condition.visible);
        addedNewToDo.should(Condition.exist, Duration.ofSeconds(10));
        addedNewToDo.click();
    }

    public void setToDo(String text) {
        addedNewToDo.shouldBe(Condition.visible);
        addedNewToDo.setValue(text).pressEnter();

    }

    public int getTasksCount() {
        int taskCount = taskList.size();
        System.out.println("Current task count: " + taskCount);
        return taskCount;
    }

    public void moveOnButton(){
        deleteButton.hover().click();
    }

    public void deleteSecondTask() {
        deleteButton.click();
        taskList.shouldHave(CollectionCondition.size(5));


    }
    public boolean isTaskDeleted(String task) {
        return !taskList.texts().contains(task);
    }

    public void checkLeftTasks(){
        taskList.forEach(item -> System.out.println(item.getText()));
    }



}

