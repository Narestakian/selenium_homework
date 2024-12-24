package Utils;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;


public class SetUpClass {
    @BeforeMethod

    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");

        Configuration.browserCapabilities = options;
        Configuration.browser = "chrome";
        Configuration.browserSize = null;
        Configuration.timeout = 15000;
    }

}