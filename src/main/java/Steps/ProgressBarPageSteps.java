package Steps;

import Elements.ProgressBarPageElements;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProgressBarPageSteps {
    public WebDriver driver;
    public WebDriverWait wait;
    public JavascriptExecutor js;

    public ProgressBarPageSteps(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        this.js = (JavascriptExecutor) driver;
    }

    public void scrollToElement(By locator) {
        WebElement element = driver.findElement(locator);
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void clickStartButton() {
        WebElement startButton = driver.findElement(ProgressBarPageElements.START_BUTTON);
        scrollToElement(ProgressBarPageElements.START_BUTTON);
        startButton.click();
    }

    public void waitForProgressBarToReach100() {
        wait.until(ExpectedConditions.textToBe(ProgressBarPageElements.PROGRESS_BAR, "100%"));
    }

    public String getProgressBarText() {
        return driver.findElement(ProgressBarPageElements.PROGRESS_BAR).getText();
    }
}


