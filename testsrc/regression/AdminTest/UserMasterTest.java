package regression.AdminTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import travel.pages.Admin.UserMaster;
import travel.pages.Login;
import travel.pages.Menu;
import travel.utilities.Driver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Admin on 27/09/2016.
 */
public class UserMasterTest {

    WebDriver driver = Driver.getDriver(Driver.DriverTypes.CHROME);

    @BeforeClass
    public void test ()
    {

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);

        Login login =new Login (driver,"http://travel.tfleet.in");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        login.setUsername("akshay85pokley@gmail.com");

        login.setPassword("12345");

        login.clickButtonSubmit();

    }


    @Test
    public void userMasterSave()
    {
        Menu menu = new Menu(driver);
        menu.clickUserMaster();

        UserMaster userMaster= new UserMaster(driver);

        userMaster.ClickAddnew();

        userMaster.setEmployeeName("Suraj");
        userMaster.setPassword("12345678");
        userMaster.setReTypePassword("12345678");
        userMaster.setDesignation("Manager");
        userMaster.setMobile("8983675455");
        userMaster.setEmail("aksh@gmail.com");
        userMaster.setAddress("uudg");
        userMaster.setAddtionalInfo("hgdjhgd");

        userMaster.ClickBtnSave();
        userMaster.setClickYes();



    }



}
