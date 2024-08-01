package Tests;

import POM.BestsellerPage;
import Utils.PageTitleUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageTest extends BaseTest {

    private BestsellerPage bestsellerPage;

    @BeforeEach
    public void setupTest() {
        driver = new ChromeDriver();
        driver.get(BASEPAGE);
        Assertions.assertEquals(PageTitleUtils.HOMEPAGE_TITLE, driver.getTitle());
        bestsellerPage = new BestsellerPage(driver);
    }

    @Test
    public void bestsellerNamesAreDisplayed() {

        Assertions.assertTrue(bestsellerPage.bestsellerNames().stream()
                .noneMatch(String::isEmpty));
    }
}
