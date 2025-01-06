package Steps;

import Elements.TextBoxPageElements;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TextBoxPageSteps {
    public WebDriver driver;
    public WebDriverWait wait;
    private JavascriptExecutor js;

    public TextBoxPageSteps(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.js = (JavascriptExecutor) driver;
    }

    public WebElement getSubmitButton() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(TextBoxPageElements.SUBMIT_BUTTON));
    }

    public void scrollToSubmitButton() {
        WebElement submitButton = getSubmitButton();
        js.executeScript("arguments[0].scrollIntoView(true);", submitButton);
    }

    public void clickSubmitButton() {
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(TextBoxPageElements.SUBMIT_BUTTON));
        submitButton.click();
    }
}

