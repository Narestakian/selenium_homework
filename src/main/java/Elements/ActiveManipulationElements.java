package Elements;

import Utils.SetUpClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ActiveManipulationElements extends SetUpClass {
    public WebDriver driver;
    public static final By ENABLE_BUTTON = By.xpath("//*[@id='input-example']/button");
    public static final By MESSAGE = By.xpath("//*[@id='message']");
    public static final By INPUT_FIELD = By.xpath("//*[@id='input-example']/input");
}
