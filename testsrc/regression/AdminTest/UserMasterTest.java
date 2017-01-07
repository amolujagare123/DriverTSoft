package regression.AdminTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import travel.pages.Admin.UserMaster;
import travel.pages.Login;
import travel.pages.Menu;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static travel.utilities.TakeScreenshot.takeScreenshot;

/**
 * Created by AKSHAY on 02/01/2017.
 */
public class UserMasterTest {

    ExtentReports extent;
    WebDriver driver;



    @BeforeClass

    public void maintest()

    {
       // extent = new ExtentReports("Extent-report/reports.html",false/*, NetworkMode.OFFLINE*/);
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        driver =new ChromeDriver();

        Login login = new Login(driver, "http://travel.tfleet.in");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        login.setUsername("akshay05pokley@gmail.com");

        login.setPassword("bn1357BN");

        login.clickButtonSubmit();
    }
    @Test(dataProvider ="getdata")
    public void userMasterSave(String Employeename/*String Password, String Re_Password, String Design,
                               String Mobile, String Email, String Address, String Expected, String Actual*/) throws IOException

    {
        ExtentTest test = extent.startTest("Test Add company | save record", "To test the save button functionality");

        try{

            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            test.log(LogStatus.INFO, "Test Started");
            Menu menu = new Menu(driver);
            test.log(LogStatus.INFO, "Menu Driver initialised");

            menu.clickUserMaster();
            test.log(LogStatus.INFO, "user master page is getting open");


            UserMaster usermaster = new UserMaster(driver);
            test.log(LogStatus.INFO, "user master page is getting open");

            usermaster.ClickAddnew();

            usermaster.setEmployeeName(Employeename);

            /*usermaster.setPassword(Password);
            usermaster.setReTypePassword(Re_Password);
            usermaster.setDesignation(Design);
            usermaster.setMobile(Mobile);
            usermaster.setEmail(Email);
            usermaster.setAddress(Address);
            usermaster.ClickBtnSave();
            usermaster.setClickYes();*/

            try {

                String actual = "";
              //  actual = driver.findElement(By.xpath(Actual)).getText();



              //  Assert.assertEquals(actual,Expected,"test pass");
               /* test.log(LogStatus.PASS, "Test  is passed");
                test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture("./screenshots/"+takeScreenshot(driver)));
*/

            } catch (AssertionError e) {
               /* test.log(LogStatus.FAIL, e);
                test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture("./screenshots/"+takeScreenshot(driver)));
*/
            } catch (Exception e) {

                /*test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture("./screenshots/"+takeScreenshot(driver)));
                test.log(LogStatus.ERROR, e);
*/
            }
        }
        catch(Exception e)
        {

           /* test.log(LogStatus.ERROR,e);
            test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture("./screenshots/"+takeScreenshot(driver)));
*/
        }/*
        extent.endTest(test);
        extent.flush();*/
    }

    @DataProvider
    public  Object[][] getdata() throws IOException {
        String[][] data = new String[0][];
        try {
            FileInputStream fileInputStream = new FileInputStream("Excelsheet/admintest.xls");

            HSSFWorkbook workbook = new HSSFWorkbook(fileInputStream);

            HSSFSheet worksheet = workbook.getSheet("Sheet1");

            int rowcount = worksheet.getLastRowNum();
            data = new String[rowcount - 1][9];
            for (int i = 1; i < rowcount; i++) {
                HSSFRow row = worksheet.getRow(i);
                HSSFCell Employee_nameCell = row.getCell(0);
                if (Employee_nameCell == null) {
                    data[i - 1][0] = "";
                } else {
                    Employee_nameCell.setCellType(Cell.CELL_TYPE_STRING);
                    data[i - 1][0] = Employee_nameCell.getStringCellValue();
                }

            }
        }catch (FileNotFoundException e)

            {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return data;
        }
    }