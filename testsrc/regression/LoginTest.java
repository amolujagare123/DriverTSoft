package regression;

import org.openqa.selenium.WebDriver;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.*;
import travel.pages.Login;
import travel.pages.Logout;
import travel.utilities.Driver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Admin on 18/09/2016.
 */
public class LoginTest {
    WebDriver mydriver = Driver.getDriver(Driver.DriverTypes.CHROME);

    @BeforeClass

    public void test() {

        mydriver.manage().window().maximize();
        mydriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        Login login = new Login(mydriver, "http://travel.tfleet.in");
        mydriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        login.setUsername("ashutoshchandan441@gmail.com");
        mydriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        login.setPassword("chandan1");

        login.clickButtonSubmit();

    }

    @Test

    public void test1()

    {
        System.out.println("hi");
    }


    @Test
    public void logout()
    {
        Logout logout=new Logout( mydriver);
        mydriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        logout.clicklogoimg();
        logout.clickLogbtn();
    }

}
