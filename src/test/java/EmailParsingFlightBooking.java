import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;

public class EmailParsingFlightBooking extends BaseTest {

    By emailInput = By.xpath("//input[@id ='identifierId']");
    By nextButton = By.xpath("//span[@class ='RveJvd snByac']");
    By passwordInput = By.xpath("//input[@type='password']");
    By flightsLabel = By.xpath("//a[@title ='FlightBooking']");


    @Test
    public void firstTest() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 120);
        this.driver.get("https://mail.google.com/mail/u/0/?tab=rm&ogbl#inbox");
        this.driver.findElement(emailInput).sendKeys("testemailparsing22@gmail.com");
        this.driver.findElement(nextButton).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordInput));
        this.driver.findElement(passwordInput).sendKeys("wHaguexv098");
        wait.until(ExpectedConditions.visibilityOfElementLocated(nextButton));
        this.driver.findElement(nextButton).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(flightsLabel));
        this.driver.findElement(flightsLabel).click();





    }

}
