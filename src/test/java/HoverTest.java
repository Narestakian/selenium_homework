import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class HoverTest {
    @Test
    public void hoverWithStableScroll() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/tool-tips");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        Actions actions = new Actions(driver);

        WebElement tipBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("toolTipButton")));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", tipBox);
        actions.moveToElement(tipBox).perform();

        WebElement tipText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("tooltip-inner")));

        Assert.assertTrue(tipText.isDisplayed());
        driver.quit();
    }

}
