package regression.EXtendTest;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import travel.pages.Login;
import travel.pages.Logout;
import travel.utilities.Driver;
import travel.utilities.initExtentReport;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static travel.utilities.TakeScreenshot.takeScreenshot;

/**
 * Created by Tcraft on 30/09/2016.
 */
public class LogoExcTest
{

    WebDriver driver = Driver.getDriver(Driver.DriverTypes.CHROME);
    ExtentReports extent = initExtentReport.init();


    Login login = new Login(driver, "url");

    @BeforeClass
    public void test()
    {
        System.out.println("g");

        }



    @Test(dataProvider = "getdata")
    public void LoginTest1
            (
                    String Email_Id, String Password
            ) throws IOException
    {

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Login login = new Login(driver, "http://travel.tfleet.in");
        ExtentTest test = extent.startTest("Test login test | logout test", "to test login functionality");

        try
        {
            login.setUsername(Email_Id);
            test.log(LogStatus.INFO, "Email_Id set ");

            login.setPassword(Password);
            test.log(LogStatus.INFO, "Password set ");

            login.clickButtonSubmit();
            test.log(LogStatus.INFO, "Click Save Button ");


        } catch (Throwable e) {

            String ExceptedResult = "Login Succefully";
            String Actual = login.mesg.getText();
            Assert.assertEquals(Actual, ExceptedResult, "Test Fail");
        }
        takeScreenshot(driver);
        test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture("./screenshots/" + takeScreenshot(driver)));


        //  logger.endTest(test);
        //logger.flush();


    }

    @Test
    public void logout() {
        Logout logout = new Logout(driver);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        logout.clicklogoimg();
        logout.clickLogbtn();

    }

    @DataProvider
    public Object[][] getdata() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("Excelsheet/addCompanyData.xls");

        HSSFWorkbook workbook = new HSSFWorkbook(fileInputStream);

        HSSFSheet worksheet = workbook.getSheet("Sheet1");
        int rowCount = worksheet.getPhysicalNumberOfRows();
        String[][] data = new String[rowCount - 1][5];

        for (int i = 1; i < rowCount; i++) {
            HSSFRow row = worksheet.getRow(i);

            HSSFCell Email_IdCell = row.getCell(0);
            if (Email_IdCell == null) {
                data[i - 1][0] = "";
            } else {
                Email_IdCell.setCellType(Cell.CELL_TYPE_STRING);
                data[i - 1][0] = Email_IdCell.getStringCellValue();
            }
            HSSFCell companyEmailPassword = row.getCell(1);
            if (companyEmailPassword == null) {
                data[i - 1][1] = "";
            } else {
                companyEmailPassword.setCellType(Cell.CELL_TYPE_STRING);
                data[i - 1][1] = companyEmailPassword.getStringCellValue();
            }
        }
        return data;
    }
    }


