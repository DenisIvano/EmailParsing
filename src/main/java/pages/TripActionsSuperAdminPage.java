package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.WebDriverFactory;

public class TripActionsSuperAdminPage extends CommonTest{
    WebDriver driver = null;
    CommonTest commonTest;


    public TripActionsSuperAdminPage() {
        this.driver = WebDriverFactory.getDriver();
        commonTest = new CommonTest(driver);
    }

    By taMore = By.xpath("//div[@class='ta-main-header-menu-handle flex-row-centerY dropdown-toggle']");
    By superAdmin = By.xpath("//li/a[@href='/app/superAdmin']");
    By bookingsTA = By.xpath("//a[@href='bookings']");
    By searchBooking = By.xpath("//input[@data-ng-model='filter.search']");
    By confSuperadmin = By.xpath("//span[text()='" + bookingConfTA + "']");


    public void goToSuperAdmin(){
        commonTest.click(taMore);
        commonTest.click(superAdmin);
    }

    public void findBooking() throws InterruptedException {
        commonTest.click(bookingsTA);
        commonTest.wait(searchBooking);
        for (int i = 0; i < 20; i++) {
            commonTest.sendKeys(searchBooking,bookingConfTA);
            if (commonTest.isElementDisplayed(confSuperadmin)) {
                this.driver.findElement(confSuperadmin).isDisplayed();
                break;
            } else {
                this.driver.findElement(searchBooking).clear();
                Thread.sleep(1000);
            }
        }

    }

    public void checkPresenceOfBooking() throws InterruptedException {
                Assert.assertTrue(this.driver.findElement(confSuperadmin).isDisplayed());
        Thread.sleep(3000);


    }


}
