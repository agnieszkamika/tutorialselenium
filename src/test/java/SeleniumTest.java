import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class SeleniumTest {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

    }
    @Test
    public void sampleTest(){
        System.out.println("Hello");
    }
}
