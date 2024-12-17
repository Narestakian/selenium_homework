import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class RobotTest {
    @Test
    public void Task() throws AWTException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Robot robot = new Robot();
        WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("APjFqb")));
        searchButton.sendKeys("Selenium Robot Class example");
        robot.keyPress(KeyEvent.VK_ENTER);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3")));
        for (int i = 0; i < 5; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            WebElement firstResult = driver.findElement(By.xpath("(//h3)[1]/.."));
            if (firstResult.isDisplayed() && firstResult.isEnabled()){
                break;

            }
        }
            driver.quit();
    }
}
