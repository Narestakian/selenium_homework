package Steps;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.Objects;

public class InfiniteScrollSteps {
    public WebDriver driver;
    public JavascriptExecutor js;


public InfiniteScrollSteps(WebDriver driver) {
    this.driver = driver;
    this.js = (JavascriptExecutor) driver;
}

public double getScrollPosition() {
    return ((Number) Objects.requireNonNull(js.executeScript("return window.scrollY;"))).doubleValue();
}

public void scrollDown(int pixels) {
    js.executeScript("window.scrollBy(0, " + pixels + ");");
}
}

