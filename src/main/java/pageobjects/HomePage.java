package pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class HomePage {
    WebDriver driver;
    final static int TIMEOUT_SIDE_PANEL = 10;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    // Close Cookies
    public void closeCookiePopup() {
        WebElement closeCookiePopup= driver.findElement(By.cssSelector("#sp-cc-accept"));
        closeCookiePopup.click();
    }

    //open meilleurs vente
    public void openMeilleuresVentes(){
        WebElement openMeilleuresVentes= driver.findElement(By.cssSelector("[data-csa-c-content-id=nav_cs_bestsellers]"));
        openMeilleuresVentes.click();
    }

}
