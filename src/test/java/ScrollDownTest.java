import Steps.InfiniteScrollSteps;
import Utils.SetUpClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ScrollDownTest extends SetUpClass {
    @Test
    public void Task4() throws InterruptedException {

        driver.get("https://the-internet.herokuapp.com/infinite_scroll");
        InfiniteScrollSteps infiniteScrollSteps = new InfiniteScrollSteps(driver);

        double initialScrollPosition = infiniteScrollSteps.getScrollPosition();
        System.out.println("Initial Scroll Position: " + initialScrollPosition);

        for (int i = 0; i < 3; i++) {
            infiniteScrollSteps.scrollDown(500);
            Thread.sleep(3000);

            double currentScrollPosition = infiniteScrollSteps.getScrollPosition();
            System.out.println("Current Scroll Position after scroll " + (i + 1) + ": " + currentScrollPosition);

            Assert.assertTrue(currentScrollPosition > initialScrollPosition,
                    "Scroll position did not change after scroll " + (i + 1));
            initialScrollPosition = currentScrollPosition;
        }
    }
}


