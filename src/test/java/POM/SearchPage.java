package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchPage extends BasePage{

    @FindBy (css = ".product_list .product-name")
    List<WebElement> productNames;

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public String getProductName(){
   //   wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".product_list .product-name")));
        return productNames.stream()
                .map(name -> name.getText().toLowerCase())
                .findFirst().orElse("");
    }
}
