package POM;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SignInPage extends BasePage
{

    @FindBy (css = "#email_create")
    WebElement emailInput;

    @FindBy (css = "#SubmitCreate")
    WebElement createAccountButton;

    private Faker faker = new Faker();

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public void createAccountStart()
    {
        String email = faker.internet().emailAddress();
        wait.until(ExpectedConditions.visibilityOf(emailInput));
        emailInput.sendKeys(email);
        createAccountButton.click();
    }
}
