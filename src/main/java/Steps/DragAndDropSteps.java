package Steps;

import Elements.DragAndDropElements;
import org.openqa.selenium.WebDriver;

public class DragAndDropSteps {
    private WebDriver driver;

    public DragAndDropSteps(WebDriver driver) {
        this.driver = driver;
    }

    public int getColumnAYCoordinate() {
        return driver.findElement(DragAndDropElements.COLUMN_A).getLocation().getY();
    }

    public int getColumnBYCoordinate() {
        return driver.findElement(DragAndDropElements.COLUMN_B).getLocation().getY();
    }
}

