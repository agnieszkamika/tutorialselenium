import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class SeleniumTest {

    @Test
    public void openGooglePage(){

       /* WebDriver driver = getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        // znalezienie przycisku
        WebElement agreeButton = driver.findElement(By.xpath("//div[text()='Accept all']"));
// klikniecie przycisku
        agreeButton.click();
        // znajdz pole wyszukiwania
        WebElement searchField = driver.findElement(By.name("q"));
        // wprowadz wartosc Selenium do pola
        searchField.sendKeys("Selenium");
        // zasymuluj nacisniecie przycisku Enter
        searchField.sendKeys(Keys.ENTER);
        // znalezc rezultat
        WebElement result = driver.findElement(By.xpath("//a[contains(@href,'selenium.dev')]//h3"));

        Assert.assertTrue(result.isDisplayed());*/

       WebDriver driver = getDriver("chrome");
       driver.manage().window().maximize();
       driver.get("https://www.google.com/");
       // driver.quit(); // zamyka wszystkie okna
        // driver. close(); // zamyka tylko pierwsze okno

       WebElement agreeButton = driver.findElement(By.xpath("//div[text()='Accept all']"));

        agreeButton.click();



        WebElement searchField = driver.findElement(By.name("q"));
        searchField.sendKeys("Selenium");
        searchField.sendKeys(Keys.ENTER);
        WebElement result = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a"));
        Assert.assertTrue(result.isDisplayed());
    }

    public WebDriver getDriver(String browser){
        if(browser.equals("chrome")){
            return new ChromeDriver();
        } else if (browser.equals("firefox")) {
            return new FirefoxDriver();

        } else throw new InvalidArgumentException("Invalid browser name");

    }
}
