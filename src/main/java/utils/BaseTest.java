package utils;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.ForwardEmailPage;
import pages.LoginGooglePage;
import pages.TripActionsLoginPage;
import pages.TripActionsSuperAdminPage;



public class BaseTest {

    public LoginGooglePage loginToGooglePage;
    public ForwardEmailPage gmail;
    public TripActionsLoginPage TripActionsLogin;
    public TripActionsSuperAdminPage SuperAdmin;


    @BeforeTest
    public void setUp() {
        WebDriverFactory.createInstance("Chrome");
        loginToGooglePage = new LoginGooglePage();
        gmail = new ForwardEmailPage();
        TripActionsLogin = new TripActionsLoginPage();
        SuperAdmin = new TripActionsSuperAdminPage();

    }
    @AfterTest
    public void tearDown() {
        WebDriverFactory.getDriver().quit();
    }

}






