package utils;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.LoginGooglePage;


public class BaseTest {

    public LoginGooglePage loginToGooglePage;

    @BeforeTest
    public void setUp() {
        WebDriverFactory.createInstance("Chrome");
        loginToGooglePage = new LoginGooglePage();

    }
    @AfterTest
    public void tearDown() {
        WebDriverFactory.getDriver().quit();
    }

}






