/*
package UI_Testing.Admin;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import travel.pages.Login;
import travel.pages.Menu;
import travel.pages.Admin.UserMaster;
import java.util.concurrent.TimeUnit;
*/
/**
 * Created by AKSHAY on 12/01/2017.
 *//*

public class usermasterUI { WebDriver driver;



    @BeforeClass
    public void maintest()

    {
        // extent = new ExtentReports("Extent-report/reports.html",false*/
/*, NetworkMode.OFFLINE*//*
);
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        Login login = new Login(driver, "http://travel.tfleet.in");

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        login.setUsername("akshay05pokley@gmail.com");

        login.setPassword("bg1352BG");

        login.clickButtonSubmit();
    }

    @Test(dataProvider = "userInput")

    public void UserUITest(String logo,String Employeename,String Email,String password,String repassword,String designation,
                           String mobile,String address,String Expected,String Actual){

        try {
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            Menu menu = new Menu(driver);
            menu.clickUserMaster();

            UserMaster usermasterui =new UserMaster(driver);
            usermasterui.ClickAddnew();


        }catch(){

    }
}*/
