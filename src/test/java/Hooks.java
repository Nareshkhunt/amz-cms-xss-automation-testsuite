import com.mavnit.selenium.mytraining.driver.DriverManager;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
    private DriverManager driverManager = new DriverManager();

    @Before
    public void setUp() {
        driverManager.openBrowser();
        driverManager.navigateTo("https://www.argos.co.uk");
        driverManager.maxBroser();
        driverManager.applyImplicit();
        driverManager.handleApplicationCookies();
    }

    //@After
    public void tearDown() {
        driverManager.closeBrowser();
    }
}
