package regression.AdminTest;

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
import travel.pages.Admin.ChangePassword;
import travel.pages.Admin.UserMaster;
import travel.pages.Login;
import travel.pages.Menu;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by AKSHAY on 17/01/2017.
 */
public class ChaPassword {

    WebDriver driver;

    @BeforeClass
    public void chpasstest()

    {
        // extent = new ExtentReports("Extent-report/reports.html",false/*, NetworkMode.OFFLINE*/);
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        Login login = new Login(driver, "http://travel.tfleet.in");

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        login.setUsername("akshay85pokley@gmail.com");

        login.setPassword("oa5945OA");

        login.clickButtonSubmit();
    }

    @Test(dataProvider = "Change_password")
    public void UserTest(String oldpassword,String NewPassword , String ConfirmPassword,String Expected,String Actual) {
        try {

            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            Menu menu = new Menu(driver);
            menu.clickChangePassword();

            ChangePassword changePassword =new ChangePassword(driver);
            changePassword.setOldPassword(oldpassword);
            changePassword.setOldPassword(NewPassword);
            changePassword.setOldPassword(ConfirmPassword);
            changePassword.clickChangeBtn();
            changePassword.setClickYes();

            String actual = "";
            try {
                actual = driver.findElement(By.linkText(Actual)).getText();
                Assert.assertEquals(actual.equals(Expected), "Test Pass");
            } catch (AssertionError e) {
                System.out.println("faill");
            }
        } catch (Exception e) {

        }

    } @DataProvider
    public Object[][] Change_password() throws IOException {
        // String[][] data = new String[0][1];

        FileInputStream fileInputStream = new FileInputStream("Excelsheet/admintest.xls");

        HSSFWorkbook workbook = new HSSFWorkbook(fileInputStream);

        HSSFSheet worksheet = workbook.getSheet("ChangePassword");
       int rowcount=worksheet.getPhysicalNumberOfRows();
       //  int rowcount = worksheet.getLastRowNum();
        String[][] data = new String[rowcount - 1][5];
        for (int i = 1; i < rowcount; i++) {
            HSSFRow row = worksheet.getRow(i);

            HSSFCell Old_PassCell= row.getCell(0);
            if (Old_PassCell == null) {
                data[i - 1][0] = "";
            } else {
                Old_PassCell.setCellType(Cell.CELL_TYPE_STRING);
                data[i - 1][0] = Old_PassCell.getStringCellValue();
            }

            HSSFCell New_PassCell = row.getCell(1);
            if (New_PassCell == null) {
                data[i - 1][1] = "";
            } else {
                New_PassCell.setCellType(Cell.CELL_TYPE_STRING);
                data[i - 1][1] = New_PassCell.getStringCellValue();
            }

            HSSFCell Confir_Passwordcell = row.getCell(2);
            if (Confir_Passwordcell == null) {
                data[i - 1][2] = "";
            } else {
                Confir_Passwordcell.setCellType(Cell.CELL_TYPE_STRING);
                data[i - 1][2] = Confir_Passwordcell.getStringCellValue();
            }

            HSSFCell ExpetedCell= row.getCell(3);
            if (ExpetedCell == null) {
                data[i - 1][3] = "";
            } else {
                ExpetedCell.setCellType(Cell.CELL_TYPE_STRING);
                data[i - 1][3] = ExpetedCell.getStringCellValue();
            }
        }
        return data;
    }
}

