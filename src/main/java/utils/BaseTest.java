package utils;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.ForwardEmailPage;
import pages.LoginGooglePage;
import pages.TripActionsLoginPage;

import java.util.Date;


public class BaseTest {

    public LoginGooglePage loginToGooglePage;
    public ForwardEmailPage gmail;
    public TripActionsLoginPage TripActionsLogin;


    @BeforeTest
    public void setUp() {
        WebDriverFactory.createInstance("Chrome");
        loginToGooglePage = new LoginGooglePage();
        gmail = new ForwardEmailPage();
        TripActionsLogin = new TripActionsLoginPage();

    }
    @AfterTest
    public void tearDown() {
        WebDriverFactory.getDriver().quit();
    }

}






