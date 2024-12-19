package Elements;

import org.openqa.selenium.By;

public class WebFormsPageElements {
    public static final By DROPDOWN_MENU = By.id("dropdowm-menu-1");
    public static final By JAVA_OPTION = By.xpath("//select[@id='dropdowm-menu-1']/option[text()='JAVA']");
    public static final By CHECKBOXES = By.xpath("//input[@type='checkbox' and not(@disabled)]");
    public static final By YELLOW_RADIO_BUTTON = By.xpath("//*[@id='radio-buttons']/input[3]");
    public static final By ORANGE_OPTION = By.xpath("//select[@id='fruit-selects']/option[text()='Orange']");
}



