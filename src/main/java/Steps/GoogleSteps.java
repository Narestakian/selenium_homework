package Steps;

import Elements.GoogleElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class GoogleSteps {
    public WebDriver driver;
    public WebDriverWait wait;
    public Robot robot;

    public GoogleSteps(WebDriver driver) throws AWTException {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.robot = new Robot();
    }

    public void performSearch(String query) {
        WebElement searchBox = wait.until(ExpectedConditions.elementToBeClickable(GoogleElements.SEARCH_BOX));
        searchBox.sendKeys(query);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        wait.until(ExpectedConditions.visibilityOfElementLocated(GoogleElements.FIRST_RESULT_LINK));
    }

    public boolean navigateToFirstResult() {
        for (int i = 0; i < 5; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);

            WebElement firstResult = driver.findElement(GoogleElements.FIRST_RESULT_LINK);
            if (firstResult.isDisplayed() && firstResult.isEnabled()) {
                return true;
            }
        }
        return false;
    }
}

