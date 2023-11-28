import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GooglePageTest {

    @Test
    public void openGooglePage(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        By acceptCookies = By.cssSelector("#L2AGLb");
        driver.findElement(acceptCookies).click();

        By linkImages = By.cssSelector("a[href='https://www.google.com/imghp?hl=en&ogbl']");
        driver.findElement(linkImages).click();
        driver.navigate().back();

        By textArea = By.cssSelector(".gLFyf");
        WebElement searchText =driver.findElement(textArea);
                searchText.sendKeys("Selenium");
                searchText.sendKeys(Keys.ENTER);

        By linkToSelenium = By.cssSelector("a[href='https://www.selenium.dev/']");
        driver.findElement(linkToSelenium).click();
        driver.quit();
    }
}
