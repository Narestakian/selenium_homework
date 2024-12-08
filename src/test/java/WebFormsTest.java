
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;
import java.util.List;

public class WebFormsTest {
    @Test
    public void Task3() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //გახსენი ბრაუზე და გადადი URL-ზე
        driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        //აირჩიეთ პროგრამირების ენა გამოსახული ჩამოსაშლელი სიიდან და შეამოწმეთ რომ სწორად შეირჩა
        WebElement dropdown = driver.findElement(By.id("dropdowm-menu-1"));
        wait.until(ExpectedConditions.elementToBeClickable(dropdown));
        dropdown.click();
        WebElement option = driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']/option[text()='JAVA']"));
        option.click();
        WebElement selectedOption = driver.findElement(By.id("dropdowm-menu-1"));
        String selectedLanguage = selectedOption.getAttribute("value");
        System.out.println("Selected programming language: " + selectedLanguage);
        Assert.assertEquals("java",selectedLanguage);

        //დააწკაპუნეთ ყველა არააქტიურ ჩეკბოქსზე.
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox' and not(@checked)]"));
        Assert.assertFalse(checkboxes.isEmpty());
        for (WebElement checkbox : checkboxes) {
            System.out.println("Unchecked checkbox:" + checkbox.getAttribute("value"));
            }


        //დააწკაპუნეთ "Yellow" რადიო ღილაკზე.
        driver.findElement(By.xpath("//*[@id=\"radio-buttons\"]/input[3]")).click();

        //"Selected & Disabled" განყოფილებაში შეამოწმეთ, რომ "Orange" ვარიანტი ჩამოსაშლელ სიაში არის გამორთული
        WebElement orangeOption = driver.findElement(By.xpath("//select[@id='fruit-selects']/option[text()='Orange']"));
        boolean isOrangeOptionDisabled = !orangeOption.isEnabled();
        Assert.assertTrue(isOrangeOptionDisabled);
        System.out.println("'Orange' option is disabled " + isOrangeOptionDisabled);
        driver.close();

    }

}
