package regression;

import org.openqa.selenium.WebDriver;


import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import travel.pages.HomePage;
import travel.pages.Login;
import travel.utilities.Driver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Admin on 18/09/2016.
 */
public class LoginTest {
    WebDriver mydriver = Driver.getDriver(Driver.DriverTypes.CHROME);
    @Test

    public void test ()
    {

        mydriver.manage().window().maximize();
        mydriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        Login login =new Login (mydriver,"http://travel.tfleet.in");
        mydriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        Login username= login.setUsername("akshay85pokley@gmail.com");

        Login password=login.setPassword("12345");


    }
@Test

    public  void test1()

{
    System.out.println("hi");
}


    }


