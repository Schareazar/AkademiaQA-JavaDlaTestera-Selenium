import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactUsTest {

    private WebDriver driver;

    @BeforeEach
    public void setupTest() {
        driver = new ChromeDriver();
    }

    @AfterEach
    public void tearDownTest() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void contactUsFormCantBeEmpty()
    {
        driver.get("http://www.automationpractice.pl/index.php");
        driver.findElement(By.cssSelector("div#contact-link")).click();
        driver.findElement(By.cssSelector("button#submitMessage")).click();

        Assertions.assertTrue(driver.findElement(By.cssSelector("div.alert")).isDisplayed());

        driver.findElement(By.cssSelector("input#email")).sendKeys("test@test.test");

        driver.findElement(By.cssSelector("button#submitMessage")).click();

        Assertions.assertTrue(driver.findElement(By.cssSelector("div.alert")).isDisplayed());

    }

}
