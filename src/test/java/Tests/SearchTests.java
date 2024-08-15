package Tests;

import POM.SearchPage;
import POM.TopBar;
import Utils.PageTitleUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchTests extends BaseTest{

    private TopBar topBar;
    private SearchPage searchPage;

    @BeforeEach
    public void setupTest() {
        driver = new ChromeDriver();
        driver.get(BASEPAGE);
        Assertions.assertEquals(PageTitleUtils.HOMEPAGE_TITLE, driver.getTitle());
        topBar = new TopBar(driver);
        searchPage = new SearchPage(driver);
    }

    @Test
    public void searchTest()
    {
        String searchString = "blouse";
        topBar.useSearch(searchString);
        Assertions.assertAll(
                () -> Assertions.assertEquals(searchString, searchPage.getProductName()),
                () -> Assertions.assertTrue(searchPage.verifyThatPricesAreNot0())
        )
        ;
    }

}
