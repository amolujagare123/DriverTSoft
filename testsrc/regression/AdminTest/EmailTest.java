package regression.AdminTest;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import travel.pages.Admin.Email;
import travel.pages.Login;
import travel.pages.Menu;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by AKSHAY on 18/01/2017.
 */
public class EmailTest {

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

        login.setPassword("12345678");

        login.clickButtonSubmit();
    }

    @Test(dataProvider = "Email_data")
    public void emailTest( String ename) {
        try {
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            Menu menu = new Menu(driver);
            menu.clickEmail();

            Email email = new Email(driver);

           WebElement Emplly_name = driver.findElement(By.xpath("//tr/td[1]"));
           // email.getEmployeeName();
            if (ename.equals(Emplly_name)) {
                email.ClickEnquiry();

                email.ClickApply();
                email.ClickYes();
           }



        } catch (AssertionError e) {
            System.out.println("faill");
        }
    }

    @DataProvider
    public Object[][] Email_data() throws IOException {
        // String[][] data = new String[0][1];

        FileInputStream fileInputStream = new FileInputStream("Excelsheet/admintest.xls");

        HSSFWorkbook workbook = new HSSFWorkbook(fileInputStream);

        HSSFSheet worksheet = workbook.getSheet("Email");
        int rowcount = worksheet.getPhysicalNumberOfRows();
        //  int rowcount = worksheet.getLastRowNum();
        String[][] data = new String[rowcount - 1][1];
        for (int i = 1; i < rowcount; i++) {
            HSSFRow row = worksheet.getRow(i);

            HSSFCell EmployeCell= row.getCell(0);
            if (EmployeCell == null) {
                data[i - 1][0] = "";
            } else {
                EmployeCell.setCellType(Cell.CELL_TYPE_STRING);
                data[i - 1][0] = EmployeCell.getStringCellValue();
            }


        }
        return data;
    }
}