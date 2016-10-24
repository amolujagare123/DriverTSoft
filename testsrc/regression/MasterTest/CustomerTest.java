package regression.MasterTest;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import travel.pages.Login;
import travel.pages.Master.Customer;
import travel.pages.Menu;
import travel.utilities.Driver;

import java.util.concurrent.TimeUnit;

/**
 * Created by TCT on 10/17/2016.
 */
public class CustomerTest {

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

    public void  Customersave()
    {
        Menu menu = new Menu(driver);
        menu.clickCustomer();

        Customer customer = new Customer(driver);
        customer.clickAddNew();

        customer.setcustomername("kirti");
        customer.setaddress("akurdi");
        customer.setcontactno1("8967453267");
        customer.setcontactname1("rahul");
        customer.setcontactno2("9805678974");
        customer.setcontactname2("poonam");
        customer.setemail("karishma@co.in");
        customer.setstate("maharashtra");
        customer.setcity("pune");
        customer.setnationality("indian");
        customer.setpincode("234567");
        customer.setBtnSave();
        customer.setClickYes();

    }


}
