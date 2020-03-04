package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BaseTest;


public class CommonTest {

    WebDriver driver;

    public CommonTest(WebDriver driver){
        this.driver = driver;
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
