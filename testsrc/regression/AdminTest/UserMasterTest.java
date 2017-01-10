package regression.AdminTest;

import jxl.Sheet;
import jxl.Workbook;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



import jxl.read.biff.BiffException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import travel.pages.Admin.UserMaster;
import travel.pages.Login;
import travel.pages.Menu;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by AKSHAY on 07/01/2017.
 */
public class UserMasterTest {

    WebDriver driver;

    @BeforeClass
    public void maintest()

    {
        // extent = new ExtentReports("Extent-report/reports.html",false/*, NetworkMode.OFFLINE*/);
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        Login login = new Login(driver, "http://travel.tfleet.in");

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        login.setUsername("akshay05pokley@gmail.com");

        login.setPassword("fg3052FG");

        login.clickButtonSubmit();
    }

    @Test(dataProvider = "userInput")

    public void UserTest(String Employeename) {

        try {

            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            Menu menu = new Menu(driver);
            menu.clickUserMaster();

            UserMaster usermaster = new UserMaster(driver);
            usermaster.ClickAddnew();
            usermaster.setEmployeeName(Employeename);
        } catch (AssertionError e) {
            System.out.println("a");
        }
    }

    @DataProvider

    public Object[][] userInput() throws IOException {
        // String[][] data = new String[0][1];

        FileInputStream fileInputStream = new FileInputStream("Excelsheet/new.xls");

        HSSFWorkbook workbook = new HSSFWorkbook(fileInputStream);

        HSSFSheet worksheet = workbook.getSheet("new");
        int rowcount=worksheet.getPhysicalNumberOfRows();
       // int rowcount = worksheet.getLastRowNum();
        String[][] data = new String[rowcount - 1][1];
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
        return data;
    }
}

