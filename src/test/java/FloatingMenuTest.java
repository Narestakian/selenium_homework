import org.testng.annotations.Test;
import steps.FloatingMenuSteps;

public class FloatingMenuTest {
    FloatingMenuSteps floatingMenuSteps = new FloatingMenuSteps();
    @Test
    public void floatingMenuTest(){
        floatingMenuSteps.openScrollPage();
        floatingMenuSteps.scrollToFooter();
        floatingMenuSteps.checkFloatingMenuIsVisibility();

    }
}
