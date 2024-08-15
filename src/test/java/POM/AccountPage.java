package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage {
    public AccountPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".alert-success")
    public WebElement alert;

    @FindBy(css = ".info-account")
    public WebElement accountInfo;

    public String accountPageAddress = "http://www.automationpractice.pl/index.php?controller=my-account";

    public @FindBy (css = ".header_user_info")
    WebElement userHeaderButton;
}
