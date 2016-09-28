package regression;

import org.openqa.selenium.WebDriver;


//import org.junit.BeforeClass;
//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import travel.pages.Login;
import travel.utilities.Driver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Admin on 18/09/2016.
 */
public class LoginTest {
    WebDriver mydriver = Driver.getDriver(Driver.DriverTypes.FIREFOX);
    @BeforeTest

    public void test ()
    {

        mydriver.manage().window().maximize();
        mydriver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);

        Login login =new Login (mydriver,"http://travel.tfleet.in");
        mydriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        login.setUsername("akshay85pokley@gmail.com");

        login.setPassword("12345");

        login.clickButtonSubmit();

    }
@Test

    public  void test1()

{
    System.out.println("hi");
}


    }


