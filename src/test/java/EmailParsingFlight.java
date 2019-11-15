import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class EmailParsingFlight  extends BaseTest {


    @Test
    public void firstTest() throws InterruptedException {
//        WebDriverWait wait = new WebDriverWait(driver, 120);
        this.driver.get("http://ext-demo.k8s-dev.local/");


    }

}
