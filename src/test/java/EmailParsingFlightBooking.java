import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.LoginGooglePage;
import utils.BaseTest;

import java.util.Date;


public class EmailParsingFlightBooking extends BaseTest {
//    Date date = new Date();
//    long time = date.getTime();
//    String timeStamp = Long.toString(time);
//    String bookingConfTA = "VFENWP" + timeStamp;
//
//    // Login to Google
//    By emailInput = By.xpath("//input[@id ='identifierId']");
//    By nextButton = By.xpath("//span[@class ='RveJvd snByac']");
//    By passwordInput = By.xpath("//input[@type='password']");
//
//    //Google inbox
//    By flightBookingLabel = By.xpath("//a[@title ='FlightBooking']");
//    By emailInLabel = By.xpath("//div[@class='ae4 UI']");
//    By moreButton = By.xpath("//div[@class='T-I J-J5-Ji T-I-Js-Gs aap T-I-awG T-I-ax7 L3']");
//    By forwardButton = By.xpath("//img[@class='mI f4 J-N-JX']");
//    By emailConfirmationNumber = By.xpath("//*[@class = 'I5']//strong[contains(text(),'VFENWP')]/parent::span");
//    By sendToField = By.xpath("//*[@name='to']");
//    By emptyField = By.xpath("//div[@class='gs']");
//    By emailBody = By.xpath("//div[@aria-label='Message Body']");
//    By typeToResponse = By.xpath("//div[@class='J-JN-M-I J-J5-Ji Un L3']");
//    By editSubject = By.xpath("//*[@class='J-N-Jz' and contains(text(),'Edit subject')]");
//    By subjectBox = By.xpath("//input[@name='subjectbox']");
//
//    //Login to TA
//    By emailTA = By.xpath("//input[@id ='userEmail']");
//    By continueTA = By.xpath("//button[@ng-click='$ctrl.onContinue()']");
//    By passwordTA = By.xpath("//input[@id ='userPassword']");
//    By signInTA = By.xpath("//button[@ng-click='$ctrl.onLogin()']");
//
//    //Superadmin
//    By taMore = By.xpath("//div[@class='ta-main-header-menu-handle flex-row-centerY dropdown-toggle']");
//    By superAdmin = By.xpath("//li/a[@href='/app/superAdmin']");
//    By bookingsTA = By.xpath("//a[@href='bookings']");
//    By searchBooking = By.xpath("//input[@data-ng-model='filter.search']");
//    By confSuperadmin = By.xpath("//span[text()='" + bookingConfTA + "']");


    @Test
    public void firstTest() throws InterruptedException {
        loginToGooglePage.loginToGoogle("testemailparsing22@gmail.com", "wHaguexv098");
        gmail.selectFlightLabel();
        gmail.selectEmail();
        gmail.clickOnForward();
        gmail.defineAddress("bookings-dev@tripactions.nom.co");
        gmail.changeConfirmationNumber();
        gmail.changeSubject();
        gmail.sendEmail();
        TripActionsLogin.loginToTripActions("testemailparsing22@gmail.com", "wHaguexv098");



////LoginToTA
//        this.driver.get("http://ext-demo.k8s-dev.local/");
//        wait.until(ExpectedConditions.elementToBeClickable(emailTA)).sendKeys("testemailparsing22@gmail.com");
//        wait.until(ExpectedConditions.elementToBeClickable(continueTA)).click();
//        wait.until(ExpectedConditions.elementToBeClickable(passwordTA)).sendKeys("wHaguexv098");
//        wait.until(ExpectedConditions.elementToBeClickable(signInTA)).click();
//
//
//        //OpenSuperAdmin
//        wait.until(ExpectedConditions.elementToBeClickable(taMore)).click();
//        wait.until(ExpectedConditions.elementToBeClickable(superAdmin)).click();
//        wait.until(ExpectedConditions.elementToBeClickable(bookingsTA)).click();
//        wait.until(ExpectedConditions.elementToBeClickable(searchBooking));
//        for (int i = 0; i < 20; i++) {
//            this.driver.findElement(searchBooking).sendKeys(bookingConfTA);
//            if (isElementDisplayed(confSuperadmin)) {
//                this.driver.findElement(confSuperadmin).isDisplayed();
//                break;
//            } else {
//                this.driver.findElement(searchBooking).clear();
//                Thread.sleep(1000);
//            }
//        }
//        Assert.assertTrue(this.driver.findElement(confSuperadmin).isDisplayed());
//
//        Thread.sleep(1000);


    }
}

  












