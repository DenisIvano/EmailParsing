package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import utils.WebDriverFactory;

public class ForwardEmailPage extends CommonTest{

    WebDriver driver = null;
    CommonTest commonTest;


    public ForwardEmailPage() {
        this.driver = WebDriverFactory.getDriver();
        commonTest = new CommonTest(driver);
    }



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



    public void selectFlightLabel() {
        commonTest.click(flightBookingLabel);

    }

    public void selectEmail() {
        commonTest.click(emailInLabel);
    }

    public void clickOnForward() {
        commonTest.click(moreButton);
        commonTest.click(forwardButton);
    }

    public void defineAddress(String address) {
        commonTest.sendKeys(sendToField,address);
        commonTest.click(emptyField);
    }

    public void changeConfirmationNumber(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView({block: 'center'});", driver.findElement(emailConfirmationNumber));
        commonTest.sendKeys(emailConfirmationNumber,timeStamp);
    }

    public void changeSubject(){
        commonTest.click(typeToResponse);
        commonTest.click(editSubject);
        commonTest.sendKeys(subjectBox,timeStamp);
    }

    public void sendEmail() throws InterruptedException {
        this.driver.findElement(emailBody).sendKeys(Keys.COMMAND, Keys.ENTER);
        Thread.sleep(5000);
    }





}
