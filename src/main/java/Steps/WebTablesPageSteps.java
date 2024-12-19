package Steps;

import Elements.WebTablesPageElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class WebTablesPageSteps {
    public WebDriver driver;
    public WebDriverWait wait;

    public WebTablesPageSteps(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void waitForTableToBeVisible() {
        wait.until(ExpectedConditions.presenceOfElementLocated(WebTablesPageElements.TABLE));
    }

    public boolean isNamePresentInTable(String name) {
        List<WebElement> rows = driver.findElements(WebTablesPageElements.ROWS);
        boolean isNameFound = false;

        for (WebElement row : rows) {
            String firstName = row.findElement(By.xpath(WebTablesPageElements.ROW_FIRST_NAME_CELL)).getText();
            String due = row.findElement(By.xpath(WebTablesPageElements.ROW_DUE_CELL)).getText();
            System.out.println("FirstName: " + firstName + " Due: " + due);

            if (firstName.equals(name)) {
                isNameFound = true;
                break;
            }
        }
        return isNameFound;
    }
}


