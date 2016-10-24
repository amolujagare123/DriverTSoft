package regression.MasterTest;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import travel.pages.Login;
import travel.pages.Master.Customer;
import travel.pages.Master.Supplier;
import travel.pages.Menu;
import travel.utilities.Driver;

import java.util.concurrent.TimeUnit;

/**
 * Created by TCT on 10/18/2016.
 */
public class SupplierTest
{
    WebDriver driver = Driver.getDriver(Driver.DriverTypes.CHROME);

    @BeforeClass
    public void test()
    {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);

        Login login = new  Login (driver,"http://travel.tfleet.in");
        driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);

        login.setUsername("kirtibhangale01@gmail.com");

        login.setPassword("12345678");

        login.clickButtonSubmit();
    }

    @Test

    public void  Suppliersave()
    {
        Menu menu = new Menu(driver);
        menu.clickSupplier();

        Supplier supplier = new Supplier(driver);
        supplier.clickAddNew();
        supplier.clickbusservice();
        supplier.clickairlineservice();
        supplier.clickcarservice();
        supplier.clickhotelservice();
        supplier.clicktrainservice();
        supplier.clickvisaservice();
        supplier.clickpassportservice();
        supplier. clickMiscellaneouservice();
        supplier.clickinsuranceservice();
        supplier.suppliername("leena");
        supplier.settxtaddress("nigdi");
        supplier.settxtcity("pune");
        supplier.settxtstate("maharashtra");
        supplier.settxtfaxno("5467890324");
        supplier.settxtservicetax("78567567656");
        supplier.settxtcontactno1("5467890435");
        supplier.setcontactperson1("raju");
        supplier.settxtcontactno2("3452345678");
        supplier.settxtcontactperson2("jeet");
        supplier.settxtemail("manu@co.in");
        supplier.settxtwebsite("www.gmail.com");
        supplier.settxtBankname("icici bank");
        supplier.settxtbankaccountno("568893765929");
        supplier.settxtbranchname("kolhaopur");
        supplier.settxtbranchaddress("shahtri road");
        supplier.settxtmicrno("3475647563");
        supplier.settxtifsccode("635265465");
        supplier.setbtnSave();
        supplier.setClickYes();
    }

}
