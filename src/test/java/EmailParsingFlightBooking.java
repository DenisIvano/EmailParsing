import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;

public class EmailParsingFlightBooking extends BaseTest {
    Robot robot;

    {
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    Date date = new Date();
    long time = date.getTime();
    String timeStamp = Long.toString(time);



    By emailInput = By.xpath("//input[@id ='identifierId']");
    By nextButton = By.xpath("//span[@class ='RveJvd snByac']");
    By passwordInput = By.xpath("//input[@type='password']");
    By flightBookingLabel = By.xpath("//a[@title ='FlightBooking']");
    By emailInLabel = By.xpath("//div[@class='ae4 UI']");
    By moreButton = By.xpath("//div[@class='T-I J-J5-Ji T-I-Js-Gs aap T-I-awG T-I-ax7 L3']");
    By forwardButton = By.xpath("//img[@class='mI f4 J-N-JX']");
    By emailConfirmationNumber = By.xpath("//*[@class = 'I5']//strong[contains(text(),'VFENWP')]/parent::span");
    By sendToField = By.xpath("//*[@name='to']");
    By emptyField = By.xpath("//div[@class='aC3']");
    By sendButton = By.xpath("//div[@class='dC']/div[1]");



    @Test
    public void firstTest() throws InterruptedException {
        Actions actions = new Actions(driver);
        SystemClipboard system = new SystemClipboard();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, 120);
        this.driver.get("https://mail.google.com/mail/u/0/?tab=rm&ogbl#inbox");
        this.driver.findElement(emailInput).sendKeys("testemailparsing22@gmail.com");
        this.driver.findElement(nextButton).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordInput));
        this.driver.findElement(passwordInput).sendKeys("wHaguexv098");
        wait.until(ExpectedConditions.visibilityOfElementLocated(nextButton));
        this.driver.findElement(nextButton).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(flightBookingLabel));
        this.driver.findElement(flightBookingLabel).click();
        wait.until(ExpectedConditions.elementToBeClickable(emailInLabel));
        this.driver.findElement(emailInLabel).click();
        wait.until(ExpectedConditions.elementToBeClickable(moreButton));
        this.driver.findElement(moreButton).click();
        wait.until(ExpectedConditions.elementToBeClickable(forwardButton));
        this.driver.findElement(forwardButton).click();
        wait.until(ExpectedConditions.elementToBeClickable(sendToField));
        this.driver.findElement(sendToField).sendKeys("bookings-dev@tripactions.nom.co");
        wait.until(ExpectedConditions.elementToBeClickable(emptyField));
        this.driver.findElement(emptyField).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(emailConfirmationNumber));
        js.executeScript("arguments[0].scrollIntoView({block: 'center'});", driver.findElement(emailConfirmationNumber));
        wait.until(ExpectedConditions.presenceOfElementLocated(emailConfirmationNumber));
        this.driver.findElement(emailConfirmationNumber).sendKeys(timeStamp);
        wait.until(ExpectedConditions.elementToBeClickable(sendButton));
//        this.driver.findElement(sendButton).click();
//        this.driver.findElement(emailConfirmationNumber).sendKeys(Keys.chord(Keys.COMMAND,Keys.ENTER));



        Thread.sleep(2000);
        System.out.println(timeStamp);



    }

}
