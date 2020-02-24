import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Date;


public class EmailParsingFlightBooking extends BaseTest {

    Date date = new Date();
    long time = date.getTime();
    String timeStamp = Long.toString(time);
    String bookingConfTA = "VFENWP" + timeStamp;


    By emailInput = By.xpath("//input[@id ='identifierId']");
    By nextButton = By.xpath("//span[@class ='RveJvd snByac']");
    By passwordInput = By.xpath("//input[@type='password']");
    By flightBookingLabel = By.xpath("//a[@title ='FlightBooking']");
    By emailInLabel = By.xpath("//div[@class='ae4 UI']");
    By moreButton = By.xpath("//div[@class='T-I J-J5-Ji T-I-Js-Gs aap T-I-awG T-I-ax7 L3']");
    By forwardButton = By.xpath("//img[@class='mI f4 J-N-JX']");
    By emailConfirmationNumber = By.xpath("//*[@class = 'I5']//strong[contains(text(),'VFENWP')]/parent::span");
    By sendToField = By.xpath("//*[@name='to']");
    By emptyField = By.xpath("//div[@class='gs']");
    By emailBody = By.xpath("//div[@aria-label='Message Body']");
    By typeToResponse = By.xpath("//div[@class='J-JN-M-I J-J5-Ji Un L3']");
    By editSubject = By.xpath("//*[@class='J-N-Jz' and contains(text(),'Edit subject')]");
    By subjectBox = By.xpath("//input[@name='subjectbox']");


    By emailTA = By.xpath("//input[@id ='userEmail']");
    By continueTA = By.xpath("//button[@ng-click='$ctrl.onContinue()']");
    By passwordTA = By.xpath("//input[@id ='userPassword']");
    By signInTA = By.xpath("//button[@ng-click='$ctrl.onLogin()']");
    By taMore = By.xpath("//div[@class='ta-main-header-menu-handle flex-row-centerY dropdown-toggle']");
    By superAdmin = By.xpath("//li/a[@href='/app/superAdmin']");
    By bookingsTA = By.xpath("//a[@href='bookings']");
    By searchBooking = By.xpath("//input[@data-ng-model='filter.search']");
    By confSuperadmin = By.xpath("//span[text()='" + bookingConfTA + "']");


    @Test
    public void firstTest() throws InterruptedException {
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
        wait.until(ExpectedConditions.elementToBeClickable(typeToResponse));
        this.driver.findElement(typeToResponse).click();
        wait.until(ExpectedConditions.elementToBeClickable(editSubject));
        this.driver.findElement(editSubject).click();
        wait.until(ExpectedConditions.elementToBeClickable(subjectBox));
        this.driver.findElement(subjectBox).click();
        this.driver.findElement(subjectBox).sendKeys(timeStamp);
        driver.findElement(emailBody).sendKeys(Keys.COMMAND, Keys.ENTER);

        Thread.sleep(3000);

        this.driver.get("http://ext-demo.k8s-dev.local/");
        wait.until(ExpectedConditions.elementToBeClickable(emailTA));
        this.driver.findElement(emailTA).sendKeys("testemailparsing22@gmail.com");
        wait.until(ExpectedConditions.elementToBeClickable(continueTA));
        this.driver.findElement(continueTA).click();
        wait.until(ExpectedConditions.elementToBeClickable(passwordTA));
        this.driver.findElement(passwordTA).sendKeys("wHaguexv098");
        wait.until(ExpectedConditions.elementToBeClickable(signInTA));
        this.driver.findElement(signInTA).click();
        wait.until(ExpectedConditions.elementToBeClickable(taMore));
        this.driver.findElement(taMore).click();
        wait.until(ExpectedConditions.elementToBeClickable(superAdmin));
        this.driver.findElement(superAdmin).click();
        wait.until(ExpectedConditions.elementToBeClickable(bookingsTA));
        this.driver.findElement(bookingsTA).click();
        wait.until(ExpectedConditions.elementToBeClickable(searchBooking));
//        this.driver.findElement(searchBooking).sendKeys(bookingConfTA);
        for (int i = 0; i < 20; i++) {
            this.driver.findElement(searchBooking).sendKeys(bookingConfTA);
            if (isElementDisplayed(confSuperadmin)) {
                this.driver.findElement(confSuperadmin).isDisplayed();
                break;
            } else {
                this.driver.findElement(searchBooking).clear();
                Thread.sleep(1000);
            }
        }
        Assert.assertTrue(this.driver.findElement(confSuperadmin).isDisplayed());

        Thread.sleep(5000);


    }
}

  












