
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class ScrollDownTest {
    @Test
    public void Task4() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://the-internet.herokuapp.com/infinite_scroll");
        Thread.sleep(5000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        double initialScrollPosition = ((Number) js.executeScript("return window.scrollY;")).doubleValue();
        for (int i = 0; i < 3; i++) {
            js.executeScript("window.scrollBy(0, 500);");
            Thread.sleep(3000);
            double currentScrollPosition = ((Number) js.executeScript("return window.scrollY;")).doubleValue();
            System.out.println("Current Scroll Position after scroll " + (i + 1) + ": " + currentScrollPosition);
            Assert.assertTrue(currentScrollPosition > initialScrollPosition,
                    "Scroll position did not change after scroll.");
            initialScrollPosition = currentScrollPosition;


        }

        driver.quit();
    }
}

