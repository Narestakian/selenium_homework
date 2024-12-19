package Steps;

import Elements.ActiveManipulationElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ActiveManipulationSteps extends ActiveManipulationElements {
    public WebDriver driver;
    public WebDriverWait wait;

    public ActiveManipulationSteps(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void clickEnableButton() {

        driver.findElement(ActiveManipulationSteps.ENABLE_BUTTON).click();
    }

    public String waitForMessageAndGetText() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(ActiveManipulationSteps.MESSAGE));
        return driver.findElement(ActiveManipulationSteps.MESSAGE).getText();
    }

    public boolean isInputFieldEnabled() {
        return driver.findElement(ActiveManipulationSteps.INPUT_FIELD).isEnabled();
    }

    public void enterTextInInputField(String text) {
        WebElement inputField = driver.findElement(ActiveManipulationSteps.INPUT_FIELD);
        inputField.sendKeys(text);
    }

    public void clearInputField() {
        WebElement inputField = driver.findElement(ActiveManipulationSteps.INPUT_FIELD);
        inputField.clear();
    }
}