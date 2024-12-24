import StepsSelenide.WebTableTestSteps;
import Utils.SetUpClass;
import org.testng.annotations.Test;

public class WebTablesTest extends SetUpClass {
    WebTableTestSteps webTableTestSteps =new WebTableTestSteps();
    @Test
   public void Task1(){
        webTableTestSteps.openTablesPage();
        webTableTestSteps.printTableData();
    }

}







