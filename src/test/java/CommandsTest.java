import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class CommandsTest {
    public static WebDriver driver;
    @Test
    public static void Task1(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //გახსენით Chrome ბრაუზერი.
        //გადადით http://the-internet.herokuapp.com/dynamic_controls მისამართზე
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        //დააწკაპუნეთ "Enable" ღილაკზე.
        WebElement enableButton = driver.findElement(By.xpath("//*[@id=\"input-example\"]/button"));
        enableButton.click();
        //ველოდები და ვამოწმებ სანამ ""It's enabled!"გამოჩნდება
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"message\"]")));
        String text = driver.findElement(By.xpath("//*[@id=\"message\"]")).getText();
        System.out.println(text);

        // ვამოწმებ შეყვანის ველი თუ გააქტიურდა
        boolean active = driver.findElement(By.xpath("//*[@id=\"message\"]")).isEnabled();

        //ვამოწმებ, რომ ღილაკის ტექსტი შეიცვალა "Enable"-დან "Disable"-ად.
        String buttonText = enableButton.getText();
        System.out.println(buttonText);

        // ვწერ "Bootcamp" -ს შეყვანის ველში და ვასუფთავებ შემდეგ
        driver.findElement(By.xpath("//*[@id=\"input-example\"]/input")).sendKeys("Bootcamp");
        driver.findElement(By.xpath("//*[@id=\"input-example\"]/input")).clear();

        // გადავდივარ სხვა მისამართზე
        driver.navigate().to("https://the-internet.herokuapp.com/drag_and_drop");

        //ვამოწმებ A და B Y კოორდინატებს და ვხურაბ ბრაუზერს
        System.out.println(driver.findElement(By.xpath("//*[@id=\"column-a\"]/header")).getLocation().y);
        System.out.println(driver.findElement(By.xpath("//*[@id=\"column-b\"]/header")).getLocation().y);
        driver.close();
    }
}
