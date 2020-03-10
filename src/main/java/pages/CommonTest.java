package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Date;


public class CommonTest {

    static Date date = new Date();
    static long time = date.getTime();
    static String timeStamp = Long.toString(time);
    static String bookingConfTA = "VFENWP" + timeStamp;

    WebDriver driver;

    public CommonTest(WebDriver driver){
        this.driver = driver;
    }

    public CommonTest() {
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

    public void open(String link){
        driver.get(link);
    }
    public void wait(By element){
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public void sendKeys(By element, String text){
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        this.driver.findElement(element).sendKeys(text);
    }
    public void click(By element){
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        this.driver.findElement(element).click();
    }

}
