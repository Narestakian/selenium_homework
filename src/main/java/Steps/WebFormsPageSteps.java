package Steps;

import Elements.WebFormsPageElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class WebFormsPageSteps {
    public  WebDriver driver;
    public WebDriverWait wait;
    public WebFormsPageSteps (org.openqa.selenium.WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void selectProgrammingLanguage() {
        WebElement dropdown = driver.findElement(WebFormsPageElements.DROPDOWN_MENU);
        wait.until(ExpectedConditions.elementToBeClickable(dropdown));
        dropdown.click();
        WebElement javaOption = driver.findElement(WebFormsPageElements.JAVA_OPTION);
        javaOption.click();
    }

    public String getSelectedLanguage() {
        WebElement selectedOption = driver.findElement(WebFormsPageElements.DROPDOWN_MENU);
        return selectedOption.getAttribute("value");
    }

    public void clickAllActiveCheckboxes() {
        List<WebElement> checkboxes = driver.findElements(WebFormsPageElements.CHECKBOXES);
        for (WebElement checkbox : checkboxes) {
            if (!checkbox.isSelected()) {
                checkbox.click();
            }
        }
    }

    public void selectYellowRadioButton() {
        WebElement yellowRadioButton = driver.findElement(WebFormsPageElements.YELLOW_RADIO_BUTTON);
        yellowRadioButton.click();
    }

    public boolean isOrangeOptionDisabled() {
        WebElement orangeOption = driver.findElement(WebFormsPageElements.ORANGE_OPTION);
        return !orangeOption.isEnabled();
    }
}



