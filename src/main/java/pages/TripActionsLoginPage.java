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



    public void loginToTripActions(String login, String password) {
        commonTest.open("http://ext-demo.k8s-dev.local/");
        commonTest.sendKeys(emailTA, login);
        commonTest.click(continueTA);
        commonTest.sendKeys(passwordTA, password);
        commonTest.click(signInTA);


}}
