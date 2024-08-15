package Tests;

import Model.PersonalInformation;
import POM.AccountPage;
import POM.CreateAccountPage;
import POM.SignInPage;
import POM.TopBar;
import Utils.PageTitleUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignInTest extends BaseTest {

    private TopBar topBar;
    private SignInPage signInPage;
    private CreateAccountPage createAccountPage;
    private AccountPage accountPage;

    @BeforeEach
    public void setupTest() {
        driver = new ChromeDriver();
        driver.get(BASEPAGE);
        Assertions.assertEquals(PageTitleUtils.HOMEPAGE_TITLE, driver.getTitle());
        topBar = new TopBar(driver);
        signInPage = new SignInPage(driver);
        createAccountPage = new CreateAccountPage(driver);
        accountPage = new AccountPage(driver);
    }

    @Test
    public void accountCreationWorks() {
        topBar.clickSignInButton();
        signInPage.createAccountStart();
        String firstName = "User";
        String lastName = "Testowy";
        createAccountPage.fillAccountCreationForm(new PersonalInformation(firstName, lastName));

                Assertions.assertAll(
                () -> Assertions.assertTrue(accountPage.alert.isDisplayed()),
                () -> Assertions.assertTrue(accountPage.accountInfo.isDisplayed()),
                () -> Assertions.assertEquals(accountPage.accountPageAddress, driver.getCurrentUrl()),
                () -> Assertions.assertTrue(accountPage.userHeaderButton.getText().contains(firstName)
                        && accountPage.userHeaderButton.getText().contains(lastName))
        );

    }
}
