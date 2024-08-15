package POM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopBar extends BasePage {

    @FindBy(css = "div#contact-link")
    WebElement contactUsLink;

    @FindBy(xpath = ".//a[@title='Women']")
    WebElement womanProducts;

    @FindBy(css = "#search_query_top")
    WebElement searchBox;

    @FindBy(css = ".login")
    WebElement signInButton;

    public TopBar(WebDriver driver) {
        super(driver);
    }

    public void clickContactUsLink() {
        contactUsLink.click();
    }

    public void clickSignInButton() {
        signInButton.click();
    }

    public void openWomanProducts() {
        womanProducts.click();
    }

    public void useSearch(String searchString) {
        searchBox.sendKeys(searchString, Keys.ENTER);
    }
}
