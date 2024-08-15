package POM;

import Model.PersonalInformation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CreateAccountPage extends BasePage {
    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#customer_firstname")
    WebElement firstNameField;

    @FindBy(css = "#customer_lastname")
    WebElement lastNameField;

    @FindBy(css = "#passwd")
    WebElement passwordField;

    @FindBy(css = "#submitAccount")
    WebElement registerButton;

    public void fillAccountCreationForm(PersonalInformation personalInformation) {
        wait.until(ExpectedConditions.visibilityOf(registerButton));
        firstNameField.sendKeys(personalInformation.getFirstName());
        lastNameField.sendKeys(personalInformation.getLastName());
        passwordField.sendKeys(personalInformation.getPassword());
        registerButton.click();
    }
}
