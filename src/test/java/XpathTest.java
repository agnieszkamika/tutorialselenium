import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class XpathTest {

    @Test
    public void findElements() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.findElement(By.xpath("//button[@id='clickOnMe']"));

        /*By buttonId = By.id("clickOnMe");
        WebElement clickOnMeButton = driver.findElement(buttonId);
        clickOnMeButton.click();

        By firstName = By.name("fname");
        WebElement firstNameInput = driver.findElement(firstName);*/
        driver.findElement(By.xpath("//input[@name='fname']"));

        driver.findElement(By.xpath("//p[@class='topSecret']"));


        By inputLocator = By.xpath("//input");
        WebElement input = driver.findElement(inputLocator);
        input.sendKeys("Pierwszy");
        List<WebElement> inputs = driver.findElements(inputLocator);
        System.out.println(inputs.size());

        By linkText = By.xpath("//a[text()='Visit W3Schools.com!']");
        WebElement schoolLink = driver.findElement(linkText);

        By partialLink = By.xpath("//a[contains(text(),'Visit')]");
        WebElement schoolPartial = driver.findElement(partialLink);

        By fullPath = By.xpath("/html/body/div/ul");
        driver.findElement(fullPath);

        By shortPath = By.xpath("//ul");
        driver.findElement(shortPath);



    }
}
