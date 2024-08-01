package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopBar extends BasePage{

    @FindBy(css = "div#contact-link")
    WebElement contactUsLink;

    public TopBar (WebDriver driver)
    {
        super(driver);
    }

    public void clickContactUsLink()
    {
    contactUsLink.click();
    }
}
