package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ContactUsPage extends BasePage {

    @FindBy(css = "button#submitMessage")
    WebElement submitButton;

    @FindBy(css = "input#email")
    WebElement emailInput;

    @FindBy(css = "div.alert")
    public WebElement alert;

    public ContactUsPage(WebDriver driver) {
        super(driver);
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

    public void provideEmail(String email) {
        emailInput.sendKeys(email);
    }

    public boolean isAlertDisplayed() {
        wait.until(ExpectedConditions.visibilityOf(alert));
        return alert.isDisplayed();
    }
}
