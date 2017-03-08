package regression;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.openqa.selenium.WebDriver;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.*;
import travel.pages.Login;
import travel.utilities.initExtentReport;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import static travel.utilities.TakeScreenshot.takeScreenshot;

/**
 * Created by Admin on 18/09/2016.
 */
public class LoginTest {
    WebDriver driver;
    ExtentReports extent ;

    @BeforeClass
    public void Openbrowser() {

        extent =initExtentReport.init();
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://travel.tfleet.in");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @Test(dataProvider = "LoginInput")

    public void loginTest(String UserID, String UserPassword, String Expeted, String XPATH) throws IOException {
        ExtentTest test = extent.startTest("Login Test", "To Test Login Button Fuctionality");

        try {

            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

            Login login = new Login(driver);
            test.log(LogStatus.INFO, "Login Driver initialised");
            login.setUsername(UserID);
            test.log(LogStatus.INFO, "Set EmailId");
            login.setPassword(UserPassword);
            test.log(LogStatus.INFO, "Set Password");
            login.clickButtonSubmit();
            test.log(LogStatus.INFO, "Click On Login Button ");
            WebElement actual;


            try {
                actual = driver.findElement(By.xpath(XPATH));

                Assert.assertEquals(actual.equals(Expeted), "Test Pass");
                test.log(LogStatus.PASS, "Test Pass");

                driver.close();

            } catch (AssertionError e) {
                test.log(LogStatus.FAIL, String.valueOf(e));
                test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture("./Login/"+takeScreenshot(driver)));


            } catch (NoSuchElementException e) {
                test.log(LogStatus.FAIL, "Element not found : "+e);
                test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture("./Login/"+takeScreenshot(driver)));

            }
        } catch (Throwable e) {
            test.log(LogStatus.ERROR,"There is Error : "+e);
            test.log(LogStatus.INFO, "Snapshot below: " + test.addScreenCapture("./Login/"+takeScreenshot(driver)));

        }
        extent.endTest(test);
        extent.flush();

    }
        @DataProvider
        public Object[][] LoginInput () throws IOException {

            FileInputStream fis = new FileInputStream("D:\\PROJECT\\DriverTSoft\\Excelsheet\\LoginTest.xls");

            HSSFWorkbook hswb = new HSSFWorkbook(fis);

            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

            HSSFSheet worksheet = hswb.getSheet("s");

            int rowCount = worksheet.getPhysicalNumberOfRows();
            String[][] data = new String[rowCount - 1][4];
            for (int i = 1; i < rowCount; i++)

            {
                HSSFRow row = worksheet.getRow(i);

                HSSFCell UserIDCell = row.getCell(0);
                if (UserIDCell == null) {
                    data[i - 1][0] = "";
                } else {
                    UserIDCell.setCellType(Cell.CELL_TYPE_STRING);
                    data[i - 1][0] = UserIDCell.getStringCellValue();
                }

                HSSFCell UserPasswordCell = row.getCell(1);
                if (UserPasswordCell == null) {
                    data[i - 1][1] = "";
                } else {
                    UserPasswordCell.setCellType(Cell.CELL_TYPE_STRING);
                    data[i - 1][1] = UserPasswordCell.getStringCellValue();
                }

                HSSFCell ExpectedCell = row.getCell(2);
                if (ExpectedCell == null) {
                    data[i - 1][2] = "";
                } else {
                    ExpectedCell.setCellType(Cell.CELL_TYPE_STRING);
                    data[i - 1][2] = ExpectedCell.getStringCellValue();
                }


                HSSFCell XPATHCell = row.getCell(3);
                if (XPATHCell == null) {
                    data[i - 1][3] = "";
                } else {
                    XPATHCell.setCellType(Cell.CELL_TYPE_STRING);
                    data[i - 1][3] = XPATHCell.getStringCellValue();
                }
            }


            return data;
        }

    }


