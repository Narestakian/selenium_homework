import org.junit.runner.RunWith;
import org.junit.runners.Suite;


    @RunWith(Suite.class)
    @Suite.SuiteClasses( {
            WebFormsTest.class,
            WaitsTest.class,
            SubmitActionTest.class,
            ScrollDownTest.class,
            ScrollHeightTest.class
    })
    public  class allTests{

    }

