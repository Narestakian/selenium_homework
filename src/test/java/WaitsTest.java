import org.junit.Test;
import org.openqa.selenium.By;
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

        // იპოვე Start ღილაკი და დააკლიკე
        driver.findElement(By.id("startStopButton")).click();


        // დაელოდე 15 წამი, სანამ  პროგრეს ბარი მიაღწევს 100%-ს
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"progressBar\"]/div"), "100%"));

        //მიწვდი და დაბეჭდე პროგრეს ბარიდან 100%
        WebElement progressBar = driver.findElement(By.xpath("//*[@id=\"progressBar\"]/div"));
        String progressText = progressBar.getText();
        Assert.assertTrue(progressText.equals("100%"));
        System.out.println(progressText);
        driver.close();
    }
}
