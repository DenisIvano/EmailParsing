package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BaseTest;
import utils.WebDriverFactory;

public class LoginGooglePage {
    WebDriver driver = null;
    CommonTest commonTest;

    public LoginGooglePage() {
        this.driver = WebDriverFactory.getDriver();
        commonTest = new CommonTest(driver);
    }

    By emailInput = By.xpath("//input[@id ='identifierId']");
    By nextButton = By.xpath("//span[@class ='RveJvd snByac']");
    By passwordInput = By.xpath("//input[@type='password']");

    public void loginToGoogle(String login, String password) {
        commonTest.open("https://mail.google.com/mail/u/0/?tab=rm&ogbl#inbox");
        commonTest.sendKeys(emailInput, login);
        commonTest.click(nextButton);
        commonTest.sendKeys(passwordInput, password);
        commonTest.click(nextButton);

    }

}
