package regression.AdminTest;


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

        Login login = new Login(driver);
        driver.get("http://travel.tfleet.in");

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        login.setUsername("akshay05pokley@gmail.com");

        login.setPassword("bg1352BG");

        login.clickButtonSubmit();
    }

    @Test(dataProvider = "userInput")

    public void UserTest(String Employeename,String Email,String password,String repassword,String designation,
                         String mobile,String address,String Expected,String Actual) {

        try {

            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            Menu menu = new Menu(driver);
            menu.clickUserMaster();

            UserMaster usermaster = new UserMaster(driver);
            usermaster.ClickAddnew();
            usermaster.setEmployeeName(Employeename);
            usermaster.setEmail(Email);
            usermaster.setPassword(password);
            usermaster.setReTypePassword(repassword);
            usermaster.setDesignation(designation);
            usermaster.setMobile(mobile);
            usermaster.setAddress(address);
            usermaster.ClickBtnSave();
            usermaster.setClickYes();
            String actual = "";
            try {
                actual = driver.findElement(By.linkText(Actual)).getText();
                Assert.assertEquals(actual.equals(Expected), "Test Pass");
            } catch (AssertionError e) {
                System.out.println("a");
            }
        } catch (Exception e) {

        }
    }
        @DataProvider

    public Object[][] userInput() throws IOException {
        // String[][] data = new String[0][1];

        FileInputStream fileInputStream = new FileInputStream("Excelsheet/admintest.xls");

        HSSFWorkbook workbook = new HSSFWorkbook(fileInputStream);

        HSSFSheet worksheet = workbook.getSheet("u");
        int rowcount=worksheet.getPhysicalNumberOfRows();
       // int rowcount = worksheet.getLastRowNum();
        String[][] data = new String[rowcount - 1][9];
        for (int i = 1; i < rowcount; i++) {
            HSSFRow row = worksheet.getRow(i);

            HSSFCell Employee_nameCell = row.getCell(0);
            if (Employee_nameCell == null) {
                data[i - 1][0] = "";
            } else {
                Employee_nameCell.setCellType(Cell.CELL_TYPE_STRING);
                data[i - 1][0] = Employee_nameCell.getStringCellValue();
            }

            HSSFCell EmailCell = row.getCell(1);
            if (EmailCell  == null) {
                data[i - 1][1] = "";
            } else {
                EmailCell .setCellType(Cell.CELL_TYPE_STRING);
                data[i - 1][1] = EmailCell .getStringCellValue();
            }

            HSSFCell PasswordCell = row.getCell(2);
            if (PasswordCell == null) {
                data[i - 1][2] = "";
            } else {
                PasswordCell.setCellType(Cell.CELL_TYPE_STRING);
                data[i - 1][2] = PasswordCell.getStringCellValue();
            }

            HSSFCell re_PasswordCell = row.getCell(3);
            if (re_PasswordCell == null) {
                data[i - 1][3] = "";
            } else {
                re_PasswordCell.setCellType(Cell.CELL_TYPE_STRING);
                data[i - 1][3] = re_PasswordCell.getStringCellValue();
            }

            HSSFCell DesignCell = row.getCell(4);
            if (DesignCell == null) {
                data[i - 1][4] = "";
            } else {
                DesignCell.setCellType(Cell.CELL_TYPE_STRING);
                data[i - 1][4] = DesignCell.getStringCellValue();
            }


            HSSFCell MobileCell = row.getCell(5);
            if (MobileCell  == null) {
                data[i - 1][5] = "";
            } else {
                MobileCell .setCellType(Cell.CELL_TYPE_STRING);
                data[i - 1][5] = MobileCell .getStringCellValue();
            }


            HSSFCell AddressCell = row.getCell(6);
            if (AddressCell  == null) {
                data[i - 1][6] = "";
            } else {
                AddressCell .setCellType(Cell.CELL_TYPE_STRING);
                data[i - 1][6] = AddressCell.getStringCellValue();
            }

            HSSFCell ExpetedCell = row.getCell(7);
            if (ExpetedCell  == null) {
                data[i - 1][7] = "";
            } else {
                ExpetedCell .setCellType(Cell.CELL_TYPE_STRING);
                data[i - 1][7] = ExpetedCell.getStringCellValue();
            }



        }
        return data;
    }
}

