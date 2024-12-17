import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class WebTablesTest {
    public static WebDriver driver;

    @Test
    public void Task1() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/tables");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement table = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("table1")));

        boolean isFrankFound = false;

        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));

        for (WebElement row : rows) {
            String firstName = row.findElement(By.xpath("./td[2]")).getText();
            String due = row.findElement(By.xpath("./td[4]")).getText();

            System.out.println("FirstName: " + firstName + " Due: " + due);

            if (firstName.equals("Frank")) {
                isFrankFound = true;
            }
        }

        Assert.assertTrue(isFrankFound, "Frank is not in the table.");

        driver.quit();
    }
}






