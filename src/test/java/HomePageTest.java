import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HomePageTest {

    private WebDriver driver;
    private WebElement element;

    @BeforeEach
    public void setupTest() {
        driver = new ChromeDriver();
    }

    @AfterEach
    public void tearDownTest() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void pageTitleIsCorrect()
    {
        driver.get("http://www.automationpractice.pl/index.php");
        Assertions.assertEquals("My Shop", driver.getTitle());
    }

    @Test
    public void bestsellerNamesAreDisplayed()
    {
        driver.get("http://www.automationpractice.pl/index.php");
        List<WebElement> bestsellers = driver.findElements(By.cssSelector("ul#blockbestsellers .product-name"));

        Assertions.assertTrue(bestsellers.stream()
                .allMatch(element -> !element.getAttribute("textContent").isEmpty()));
    }
}
