package utils;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.ForwardEmailPage;
import pages.LoginGooglePage;

import java.util.Date;


public class BaseTest {

    public LoginGooglePage loginToGooglePage;
    public ForwardEmailPage gmail;


    @BeforeTest
    public void setUp() {
        WebDriverFactory.createInstance("Chrome");
        loginToGooglePage = new LoginGooglePage();
        gmail = new ForwardEmailPage();

    }
    @AfterTest
    public void tearDown() {
        WebDriverFactory.getDriver().quit();
    }

}






