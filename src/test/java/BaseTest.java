import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


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

}