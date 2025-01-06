import Steps.ActiveManipulationSteps;
import Steps.DragAndDropSteps;
import Utils.SetUpClass;
import org.testng.annotations.Test;

public class CommandsTest extends SetUpClass {
    ActiveManipulationSteps ActiveSteps = new ActiveManipulationSteps(driver);

    @Test
    public void Task1() {

        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        ActiveSteps.clickEnableButton();

        String message = ActiveSteps.waitForMessageAndGetText();
        System.out.println("Message: " + message);

        boolean isEnabled = ActiveSteps.isInputFieldEnabled();
        System.out.println("Is input field enabled: " + isEnabled);

        ActiveSteps.enterTextInInputField("Bootcamp");
        ActiveSteps.clearInputField();


        driver.navigate().to("https://the-internet.herokuapp.com/drag_and_drop");
        DragAndDropSteps dragSteps = new DragAndDropSteps(driver);

        int columnAY = dragSteps.getColumnAYCoordinate();
        int columnBY = dragSteps.getColumnBYCoordinate();
        System.out.println("Column A Y: " + columnAY);
        System.out.println("Column B Y: " + columnBY);
    }
}




