package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

public class BasePage
{
    protected WebDriverWait wait;

    @FindBy (css = ".right-block .content_price .price")
    List<WebElement> productPrices;

    public BasePage(WebDriver driver) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        PageFactory.initElements(driver, this);
    }

    private List<Integer> getTrimmedProductPrices(List<WebElement> productPrices)
    {
        return productPrices.stream()
                .map(price -> Integer.valueOf(price.getText().replace("$","")))
                .collect(Collectors.toList());
    }

    public boolean verifyThatPricesAreNot0()
    {
        return getTrimmedProductPrices(productPrices).stream()
                .noneMatch(price -> price <= 0);
    }
}
