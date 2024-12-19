package Elements;

import org.openqa.selenium.By;

public class WebTablesPageElements {
    public static final By TABLE = By.id("table1");
    public static final By ROWS = By.xpath("//table[@id='table1']/tbody/tr");
    public static final String ROW_FIRST_NAME_CELL = "./td[2]";
    public static final String ROW_DUE_CELL = "./td[4]";
}
