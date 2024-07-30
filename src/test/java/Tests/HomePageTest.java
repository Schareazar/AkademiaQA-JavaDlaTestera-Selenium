package Tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePageTest extends BaseTest {

    @Test
    public void bestsellerNamesAreDisplayed() {
        List<WebElement> bestsellers = driver.findElements(By.cssSelector("ul#blockbestsellers .product-name"));

        Assertions.assertTrue(bestsellers.stream()
                .allMatch(element -> !element.getAttribute("textContent").isEmpty()));
    }
}
