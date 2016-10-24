package regression.MasterTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import travel.pages.Admin.UserMaster;
import travel.pages.Login;
import travel.pages.Master.Bank;
import travel.pages.Menu;
import travel.utilities.Driver;

import java.util.concurrent.TimeUnit;

/**
 * Created by TCT on 10/20/2016.
 */
public class BankTest
{
    WebDriver driver = Driver.getDriver(Driver.DriverTypes.CHROME);
    @BeforeClass
    public void test ()
    {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);

        Login login =new Login (driver,"http://travel.tfleet.in");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        login.setUsername("kirtibhangale01@gmail.com");

        login.setPassword("iq3882IQ");

        login.clickButtonSubmit();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @Test
    public void bankSave()
    {
        Menu menu = new Menu(driver);
        menu.clickBank();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Bank bank= new Bank(driver);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        bank.clickAddNew();
        bank.setBankname("bank of america");
        bank.setaccountno("436578346578346");
        bank.setbankaddr("lonavla");
        bank.setcontactno("4738675846");
        bank.setbtnSave();
        bank.setClickYes();
        bank.setcancel();
        bank.setdelete();
        bank.setYes();

    }

}
