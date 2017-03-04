package regression.MasterTest;

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
import travel.pages.Login;
import travel.pages.Master.Customer;
import travel.pages.Menu;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by AKSHAY on 20/01/2017.
 */
public class TaxMasterTest {

    WebDriver driver;

    @BeforeClass
    public void Suppliertest()
    {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        Login login = new Login(driver);
        driver.get("http://travel.tfleet.in");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        login.setUsername("akshay85pokley@gmail.com");

        login.setPassword("12345678");

        login.clickButtonSubmit();
    }

    @Test(dataProvider = "Customer_data")

    public void UserTest( String Expected,String Actual) {

        try {

            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            Menu menu = new Menu(driver);
            menu.clickCustomer();

            Customer customer=new Customer(driver);

            driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);



            String actual = "";
            try {
                actual = driver.findElement(By.xpath(Actual)).getText();
                Assert.assertEquals(actual.equals(Expected), "Test Pass");
            } catch (AssertionError e) {
                System.out.println("a");
            }
        } catch (Exception e) {

        }
    }

    @DataProvider

    public Object[][] Customer_data() throws IOException {


        FileInputStream fileInputStream = new FileInputStream("Excelsheet/MasterTest.xls");

        HSSFWorkbook workbook = new HSSFWorkbook(fileInputStream);

        HSSFSheet worksheet = workbook.getSheet("Customer");
        int rowcount=worksheet.getPhysicalNumberOfRows();
        // int rowcount = worksheet.getLastRowNum();
        String[][] data = new String[rowcount - 1][13];
        for (int i = 1; i < rowcount; i++) {
            HSSFRow row = worksheet.getRow(i);

            HSSFCell Custome_NameCell=row.getCell(0);
            if (Custome_NameCell == null) {
                data[i - 1][0] = "";
            } else {
                Custome_NameCell.setCellType(Cell.CELL_TYPE_STRING);
                data[i - 1][0] = Custome_NameCell.getStringCellValue();
            }

            HSSFCell AddressCell=row.getCell(1);
            if(AddressCell==null)
            {
                data[i-1][1]="";
            }else {
                AddressCell.setCellType(Cell.CELL_TYPE_STRING);
                data[i-1][1]=AddressCell.getStringCellValue();
            }

            HSSFCell ContNO1Cell=row.getCell(2);
            if(ContNO1Cell==null)
            {
                data[i-1][2]="";
            }else {
                ContNO1Cell.setCellType(Cell.CELL_TYPE_STRING);
                data[i-1][2]=ContNO1Cell.getStringCellValue();
            }


            HSSFCell ContName1Cell=row.getCell(3);
            if(ContName1Cell==null)
            {
                data[i-1][3]="";
            }else {
                ContName1Cell.setCellType(Cell.CELL_TYPE_STRING);
                data[i-1][3]=ContName1Cell.getStringCellValue();
            }

            HSSFCell ContNO2Cell=row.getCell(4);
            if(ContNO2Cell==null)
            {
                data[i-1][4]="";
            }else {
                ContNO2Cell.setCellType(Cell.CELL_TYPE_STRING);
                data[i-1][4]=ContNO2Cell.getStringCellValue();
            }


            HSSFCell ContName2Cell=row.getCell(5);
            if(ContName2Cell==null)
            {
                data[i-1][5]="";
            }else {
                ContName2Cell.setCellType(Cell.CELL_TYPE_STRING);
                data[i-1][5]=ContName2Cell.getStringCellValue();
            }

            HSSFCell EmailCell=row.getCell(6);
            if(EmailCell==null)
            {
                data[i-1][6]="";
            }else {
                EmailCell.setCellType(Cell.CELL_TYPE_STRING);
                data[i-1][6]=EmailCell.getStringCellValue();
            }

            HSSFCell StateCell=row.getCell(7);
            if(StateCell==null)
            {
                data[i-1][7]="";
            }else {
                StateCell.setCellType(Cell.CELL_TYPE_STRING);
                data[i-1][7]=StateCell.getStringCellValue();
            }


            HSSFCell CityCell=row.getCell(8);
            if(CityCell==null)
            {
                data[i-1][8]="";
            }else {
                CityCell.setCellType(Cell.CELL_TYPE_STRING);
                data[i-1][8]=CityCell.getStringCellValue();
            }


            HSSFCell NationalityCell=row.getCell(9);
            if(NationalityCell==null)
            {
                data[i-1][9]="";
            }else {
                NationalityCell.setCellType(Cell.CELL_TYPE_STRING);
                data[i-1][9]=NationalityCell.getStringCellValue();
            }


            HSSFCell PincodeCell=row.getCell(10);
            if(PincodeCell==null)
            {
                data[i-1][10]="";
            }else {
                PincodeCell.setCellType(Cell.CELL_TYPE_STRING);
                data[i-1][10]=PincodeCell.getStringCellValue();
            }

            HSSFCell ExpetedCell = row.getCell(11);
            if (ExpetedCell  == null) {
                data[i - 1][11] = "";
            } else {
                ExpetedCell .setCellType(Cell.CELL_TYPE_STRING);
                data[i - 1][11] = ExpetedCell.getStringCellValue();
            }

        }
        return data;
    }
}

