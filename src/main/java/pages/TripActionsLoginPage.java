package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WebDriverFactory;

public class TripActionsLoginPage {

    WebDriver driver = null;
    CommonTest commonTest;


    public TripActionsLoginPage() {
        this.driver = WebDriverFactory.getDriver();
        commonTest = new CommonTest(driver);
    }


    By emailTA = By.xpath("//input[@id ='userEmail']");
    By continueTA = By.xpath("//button[@ng-click='$ctrl.onContinue()']");
    By passwordTA = By.xpath("//input[@id ='userPassword']");
    By signInTA = By.xpath("//button[@ng-click='$ctrl.onLogin()']");

    ////LoginToTA
//        this.driver.get("http://ext-demo.k8s-dev.local/");
//        wait.until(ExpectedConditions.elementToBeClickable(emailTA)).sendKeys("testemailparsing22@gmail.com");
//        wait.until(ExpectedConditions.elementToBeClickable(continueTA)).click();
//        wait.until(ExpectedConditions.elementToBeClickable(passwordTA)).sendKeys("wHaguexv098");
//        wait.until(ExpectedConditions.elementToBeClickable(signInTA)).click();

    public void loginToTripActions(String login, String password) {
        commonTest.open("http://ext-demo.k8s-dev.local/");
        commonTest.sendKeys(emailTA, login);
        commonTest.click(continueTA);
        commonTest.sendKeys(passwordTA, password);
        commonTest.click(signInTA);


}}
