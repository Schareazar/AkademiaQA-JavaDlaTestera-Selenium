package Tests;

import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.WebDriver;

public class BaseTest {

    protected WebDriver driver;
    protected static final String BASEPAGE = "http://www.automationpractice.pl/index.php";

    @AfterEach
    public void tearDownTest() {
        if (driver != null) {
            driver.quit();
        }

    }
}
