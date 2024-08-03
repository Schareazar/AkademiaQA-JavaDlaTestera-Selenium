package POM;

import Model.Message;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class ContactUsPage extends BasePage {

    @FindBy(css = "button#submitMessage")
    WebElement submitButton;

    @FindBy(css = ".alert-danger")
    public WebElement redAlert;

    @FindBy(css = ".alert-success")
    public WebElement greenAlert;

    @FindBy(css = "#id_contact")
    public WebElement subjectSelect;

    @FindBy(css = "#id_order")
    public WebElement orderReferenceInput;

    @FindBy(css = "#message")
    public WebElement messageTextInput;

    @FindBy(css = "input#email")
    WebElement emailInput;

    public ContactUsPage(WebDriver driver) {
        super(driver);
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

    public void provideEmail(String email) {
        emailInput.sendKeys(email);
    }

    public boolean isRedAlertDisplayed() {
        return isAlertDisplayed(redAlert);
    }

    public boolean isGreenAlertDisplayed() {
        return isAlertDisplayed(greenAlert);
    }

    private boolean isAlertDisplayed(WebElement alert)
    {
        wait.until(ExpectedConditions.visibilityOf(alert));
        return alert.isDisplayed();
    }



    public void fillForm(Message message) {
        Select subject = new Select(subjectSelect);
        subject.selectByVisibleText(message.getSubject().getValue());
        emailInput.sendKeys(message.getEmail());
        messageTextInput.sendKeys(message.getMessageText());
        orderReferenceInput.sendKeys(message.getOrderReference());
    }


}
