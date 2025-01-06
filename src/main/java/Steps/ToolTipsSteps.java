package Steps;

import Elements.ToolTipsElements;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ToolTipsSteps {
    public WebDriver driver;
    public WebDriverWait wait;

    public ToolTipsSteps(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void hoverOverToolTipButton() {
        Actions actions = new Actions(driver);
        WebElement tipBox = wait.until(ExpectedConditions.visibilityOfElementLocated(ToolTipsElements.TOOLTIP_BUTTON));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", tipBox);

        actions.moveToElement(tipBox).perform();
    }

    public boolean isToolTipTextDisplayed() {
        WebElement tipText = wait.until(ExpectedConditions.visibilityOfElementLocated(ToolTipsElements.TOOLTIP_TEXT));
        return tipText.isDisplayed();

    }
}