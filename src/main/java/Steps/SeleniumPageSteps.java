package Steps;

import Elements.SeleniumPageElements;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumPageSteps {
    public WebDriver driver;
    public WebDriverWait wait;
    public JavascriptExecutor js;

    public SeleniumPageSteps(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.js = (JavascriptExecutor) driver;
    }

    public WebElement waitForFooter() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(SeleniumPageElements.FOOTER_BODY));
    }

    public void scrollToPageBottom() {
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }
}

