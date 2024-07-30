package Tests;

import Utils.PageTitleUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    protected WebDriver driver;
    private static final String BASEPAGE = "http://www.automationpractice.pl/index.php";

    @BeforeEach
    public void setupTest() {
        driver = new ChromeDriver();
        driver.get(BASEPAGE);
        Assertions.assertEquals(PageTitleUtils.HOMEPAGE_TITLE, driver.getTitle());
    }

    @AfterEach
    public void tearDownTest() {
        if (driver != null) {
            driver.quit();
        }
    }
}
