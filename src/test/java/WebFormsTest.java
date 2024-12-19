import Steps.WebFormsPageSteps;
import Utils.SetUpClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebFormsTest extends SetUpClass {
    @Test
    public void Task3() {

        driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

        WebFormsPageSteps steps = new WebFormsPageSteps(driver);
        steps.selectProgrammingLanguage();
        String selectedLanguage = steps.getSelectedLanguage();
        System.out.println("Selected programming language: " + selectedLanguage);
        Assert.assertEquals(selectedLanguage, "java");

        steps.clickAllActiveCheckboxes();
        steps.selectYellowRadioButton();

        boolean isOrangeOptionDisabled = steps.isOrangeOptionDisabled();
        Assert.assertTrue(isOrangeOptionDisabled, "'Orange' option is not disabled");
        System.out.println("'Orange' option is disabled: " + isOrangeOptionDisabled);
    }
}

