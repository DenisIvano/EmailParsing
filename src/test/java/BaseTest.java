import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;


public class BaseTest {

    WebDriver driver;
    //
    @BeforeTest
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }

//@BeforeTest
//public void setUp() {
//    // Fix for - The path to the driver executable must be set by the webdriver.chrome.driver system property
//    System.setProperty("webdriver.chrome.driver", "chromedriver");
//    // Create a new instance of the Firefox driver
//    this.driver = new ChromeDriver();
//}

    @AfterTest
    public void tearDown(){
        driver.quit();
    }



    protected boolean isElementDisplayed(By by) {
        boolean isDisplayed = true;
        try {
            WebDriverWait wait = new WebDriverWait(driver, 3);
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            System.out.println("isDisplayed is true for element");
        } catch (TimeoutException e) {
            isDisplayed = false;
        }
        return isDisplayed;
    }
}






