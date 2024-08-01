package Tests;

import POM.ContactUsPage;
import POM.TopBar;
import Utils.PageTitleUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactUsTest extends BaseTest {

    private TopBar topBar;
    private ContactUsPage contactUsPage;

    @BeforeEach
    public void setupTest() {
        driver = new ChromeDriver();
        driver.get(BASEPAGE);
        Assertions.assertEquals(PageTitleUtils.HOMEPAGE_TITLE, driver.getTitle());
        topBar = new TopBar(driver);
        contactUsPage = new ContactUsPage(driver);
    }

    @Test
    public void contactUsFormCantBeEmpty() {
        topBar.clickContactUsLink();
        contactUsPage.clickSubmitButton();

        Assertions.assertTrue(contactUsPage.isAlertDisplayed());

        contactUsPage.provideEmail("test@test.test");
        contactUsPage.clickSubmitButton();

        Assertions.assertTrue(contactUsPage.isAlertDisplayed());
    }

}
