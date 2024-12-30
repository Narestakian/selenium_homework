import org.testng.annotations.Test;
import stepsSelenide.ToDoApplicationSteps;
import utils.SetUp;

import static org.testng.Assert.*;

public class ToDoApplicationTest extends SetUp {
    ToDoApplicationSteps toDoApplicationSteps = new ToDoApplicationSteps();
    @Test
    public void toDoApplicationTest() throws InterruptedException {
        toDoApplicationSteps.openPage();
        toDoApplicationSteps.scrollToList();
        toDoApplicationSteps.clickToDoList();
        toDoApplicationSteps.moveToToDo();
        toDoApplicationSteps.clickAddedToDo();
        toDoApplicationSteps.setToDo("Task 1");
        toDoApplicationSteps.setToDo("Task 2");
        toDoApplicationSteps.setToDo("Task 3");
        assertEquals(6, toDoApplicationSteps.getTasksCount());
        toDoApplicationSteps.moveOnButton();
        toDoApplicationSteps.deleteSecondTask();
        toDoApplicationSteps.checkLeftTasks();
        Thread.sleep(30000);
        assertFalse(toDoApplicationSteps.isTaskDeleted("Go to potion class"), "Deleted task is still present!");


    }
}
