package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;

public class BestsellerPage extends BasePage{

    public BestsellerPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(css = "ul#blockbestsellers .product-name")
    List<WebElement> bestsellerProducts;

    public List<String> bestsellerNames() {
        return bestsellerProducts.stream()
                .map(element -> element.getAttribute("textContent"))
                .collect(Collectors.toList());
    }
}
