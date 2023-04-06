import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.HomePage;


public class AmazonTest {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://www.amazon.fr");
        driver.manage().window().maximize();
    }

    /*@AfterMethod
    public void teardown() {
        driver.quit();
    }*/

    @Test
    public void testAmazon1() {
        // test search
        HomePage homePage = new HomePage(driver);
        //test cookies
        homePage.closeCookiePopup();

    }
}
