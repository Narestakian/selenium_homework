package steps;

import com.codeborne.selenide.Condition;
import elements.DynamicContentElements;

import java.time.Duration;
import java.util.List;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.refresh;

public class DynamicContentSteps extends DynamicContentElements {
    public void openDynamicContentPage(){
        open("https://the-internet.herokuapp.com/");
    }


    public void clickOnDynamicContent(){
        dynamicContent.click();
    }

    public List<String> getContentText(){
        rowsContent.first().shouldBe(Condition.visible);
        rowsContent.forEach(element -> element.shouldBe(Condition.visible, Duration.ofSeconds(10)));
     return rowsContent.texts();
    }

    public void refreshPage() {
        refresh();
    }
    public void refreshAndValidateContentChange() {
        List<String> initialContent = getContentText();
        System.out.println("Initial Content: " + initialContent);

        for (int i = 1; i <= 3; i++) {
            refreshPage();

            List<String> updatedContent = getContentText();
            System.out.println("Updated Content after refresh" + i + ": " + updatedContent);
            if (initialContent.equals(updatedContent)) {
                throw new AssertionError("Content did not change after refresh" + i);
            }

            initialContent = updatedContent;
        }

    }

}
