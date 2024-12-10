import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class WaitsTest {


    @Test
    public void Task2() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //გახსენით Chrome ბრაუზერი.
        //გადადით https://demoqa.com/progress-bar მისამართზე
        driver.get("https://demoqa.com/progress-bar");
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;


        // იპოვე Start ღილაკი და დააკლიკე
        WebElement startButton = driver.findElement(By.id("startStopButton"));
        js.executeScript("arguments[0].scrollIntoView(true);", startButton);
        startButton.click();
        Assert.assertTrue(startButton.isDisplayed(), "Start button is not displayed!");




        // დაელოდე 15 წამი, სანამ  პროგრეს ბარი მიაღწევს 100%-ს
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"progressBar\"]/div"), "100%"));

        //მიწვდი და დაბეჭდე პროგრეს ბარიდან 100%
        WebElement progressBar = driver.findElement(By.xpath("//*[@id=\"progressBar\"]/div"));
        String progressText = progressBar.getText();
        Assert.assertEquals("100%", progressText);
        System.out.println(progressText);
        driver.quit();
    }
}
