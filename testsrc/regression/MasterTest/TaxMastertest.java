package regression.MasterTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import travel.pages.Admin.UserMaster;
import travel.pages.Login;
import travel.pages.Master.TaxMaster;
import travel.pages.Menu;
import travel.utilities.Driver;

import java.util.concurrent.TimeUnit;

/**
 * Created by TCT on 10/19/2016.
 */
public class TaxMastertest {

    WebDriver driver = Driver.getDriver(Driver.DriverTypes.CHROME);

    @BeforeClass
    public void test() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);

        Login login = new Login(driver, "http://travel.tfleet.in");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        login.setUsername("kirtibhangale01@gmail.com");

        login.setPassword("12345");

        login.clickButtonSubmit();

    }

    @Test
    public void TaxMastersave() {
        Menu menu = new Menu(driver);
        menu.clickTaxMaster();

        TaxMaster taxmaster = new TaxMaster(driver);
        taxmaster.clickAddtax();
        taxmaster.settxttaxname("service tax on railway");
        taxmaster.settxttaxratetype("percentage%");
        taxmaster.settaxttaxrate("14");
        taxmaster.setbtnSave();
        taxmaster.setClickYes();

    }
}