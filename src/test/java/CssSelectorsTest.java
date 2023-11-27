import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CssSelectorsTest {

    @Test
    public void findElements(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        By cssId = By.cssSelector("#clickOnMe");  // # - selector oznaczający Id
        driver.findElement(cssId);

        By cssClass = By.cssSelector(".topSecret");
        driver.findElement(cssClass);

        By cssTag = By.cssSelector("input");
        driver.findElement(cssTag).sendKeys("Pierwszy");

        By cssName = By.cssSelector("[name='fname']");
        driver.findElement(cssName);

        By cssClass2 = By.cssSelector("[class='topSecret']");
        driver.findElement(cssClass2);

        By all = By.cssSelector("*");
        driver.findElement(all);

        By ulInDiv  = By.cssSelector("div ul"); //zwraca listę w elemencie blokowym div
        By trInTable = By.cssSelector("table tr");  //zwraca wiersze w tabeli
        By trInBody = By.cssSelector("tbody tr");  //zwraca wiersze w body tabeli
        driver.findElement(ulInDiv); //findElement zwraca tylko pieerwszy znaleziony element,
        driver.findElement(trInTable); // wszystkie za pomocą metody findElements
        driver.findElement(trInBody);

        By firstChildInUL = By.cssSelector("div>ul");    //zwraca pierwsze dziecko wo tagu Ul w DIV
        By firstChildInTbody = By.cssSelector("tbody>tr");  //zwraca pierwsze dziecko o tagu tr w tbody
        driver.findElement(firstChildInUL);
        driver.findElement(firstChildInTbody);

        By firstFormAfterLabel = By.cssSelector("label + form");  //zwraca pierwszy formularz za elementem label
        By allFormsAfterLabel = By.cssSelector("label ~ form");  //zwraca wszystkie formularze po label
        driver.findElement(firstFormAfterLabel);
        driver.findElement(allFormsAfterLabel);

        By attrTag = By.cssSelector("input[name='fname']");  //zwraca tag input z atrybutem name=fname
        By attrContains = By.cssSelector("[name*='name']");  //zwraca element zawierajacy w atrybucie 'name'
        By attrStarts = By.cssSelector("[name^='f']");  //zwraca element zawietający atrybut zaczynający się na 'f'
        By attrEnds = By.cssSelector("[name$='name']");  //zwraca element zawierający atrybut kończący się na 'name'
        driver.findElement(attrTag);
        driver.findElement(attrContains);
        driver.findElement(attrStarts);
        driver.findElement(attrEnds);

        By firstChild = By.cssSelector("li:first-child");
        By lastChild = By.cssSelector("li:last-child");
        By thirdChild = By.cssSelector("li:nth-child(3)");
        driver.findElement(firstChild);
        driver.findElement(lastChild);
        driver.findElement(thirdChild);



    }
}
