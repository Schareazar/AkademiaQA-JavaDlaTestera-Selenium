package Tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class ContactUsTest extends BaseTest {

    @Test
    public void contactUsFormCantBeEmpty() {
        driver.findElement(By.cssSelector("div#contact-link")).click();
        driver.findElement(By.cssSelector("button#submitMessage")).click();

        Assertions.assertTrue(driver.findElement(By.cssSelector("div.alert")).isDisplayed());

        driver.findElement(By.cssSelector("input#email")).sendKeys("test@test.test");
        driver.findElement(By.cssSelector("button#submitMessage")).click();

        Assertions.assertTrue(driver.findElement(By.cssSelector("div.alert")).isDisplayed());
    }

}
