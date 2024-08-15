package Tests;

import POM.TopBar;
import POM.WomanProductsPage;
import Utils.PageTitleUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class WomanProductsTest extends BaseTest{

    private TopBar topBar;
    private WomanProductsPage womanProductsPage;

    @BeforeEach
    public void setupTest() {
        driver = new ChromeDriver();
        driver.get(BASEPAGE);
        Assertions.assertEquals(PageTitleUtils.HOMEPAGE_TITLE, driver.getTitle());
        topBar = new TopBar(driver);
        womanProductsPage = new WomanProductsPage(driver);
    }

    @Test
    public void productPricesAreNot0()
    {
        topBar.openWomanProducts();
        Assertions.assertTrue(womanProductsPage.verifyThatPricesAreNot0());
    }

}
