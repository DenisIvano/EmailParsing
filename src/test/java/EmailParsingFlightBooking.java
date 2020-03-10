import org.testng.annotations.Test;
import utils.BaseTest;



public class EmailParsingFlightBooking extends BaseTest {

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
        SuperAdmin.goToSuperAdmin();
        SuperAdmin.findBooking();
        SuperAdmin.checkPresenceOfBooking();


    }
}

  












