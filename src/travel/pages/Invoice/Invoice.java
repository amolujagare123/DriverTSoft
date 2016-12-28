package travel.pages.Invoice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by AKSHAY on 27/12/2016.
 */
public class Invoice {

    WebDriver driver;

    @FindBy(xpath = "//section[@class='content-header']//h2")
     WebElement GetInvoicelogo;

    @FindBy(xpath = "//div[@class='box-header']//a")
    WebElement clickonaddnew;

    @FindBy(xpath = "//div[@class='dataTables_filter']/label/input")
    WebElement SearchTextbox;



    @FindBy(xpath = ".//*[@id='AllServInvtable_filter']/label")
    WebElement LebaleSearchtbox;

    /*Invoice Grid*//*
    @FindBy(xpath = ".//*[@id='AllServInvtable']/thead/tr/th[1]")
    WebElement  PrintBtnlable;

    @FindBy (xpath = ".//*[@id='AllServInvtable']/thead/tr/th[2]")
    WebElement InviceNOLable;

    @FindBy(xpath = ".//*[@id='AllServInvtable']/thead/tr/th[3]")
    WebElement Tripnolabel;

    @FindBy (xpath = ".//*[@id='AllServInvtable']/thead/tr/th[4]")
    WebElement Invoicedatelable;

    @FindBy(xpath = ".//*[@id='AllServInvtable']/thead/tr/th[5]")
    WebElement Customernamelabel;

    @FindBy(xpath = ".//*[@id='AllServInvtable']/thead/tr/th[6]")
    WebElement Contactnamelable;

    @FindBy(xpath = ".//*[@id='AllServInvtable']/thead/tr/th[7]")
    WebElement Servicenamelable;

    @FindBy(xpath = ".//*[@id='AllServInvtable']/thead/tr/th[8]")
    WebElement SaleAmountLable;

    @FindBy(xpath = ".//*[@id='AllServInvtable']/thead/tr/th[9]")
    WebElement cancelLebe;
*/

/*Invoice AddNew Page*/

    @FindBy(xpath = "//section[@class='content-header']//h1")
    WebElement getinvoicelogo;

    @FindBy(xpath = "")
    WebElement Selectcustomer;

    @FindBy(xpath = "")
    WebElement SelectcustomerLable;


    @FindBy(xpath = "")
    WebElement SelectInvoiceDate;

    @FindBy(xpath = "")
    WebElement SelectInvoiceDatelabel;

    @FindBy(xpath = "")
    WebElement SelectTripno;

    @FindBy(xpath = "")
    WebElement SelectTripnolabel;

    @FindBy(xpath = "")
    WebElement getBookedByname;

    @FindBy(xpath = "")
    WebElement getBookedBynamelable;

    @FindBy(xpath = "")
    WebElement getcontactno;

    @FindBy(xpath = "")
    WebElement getcontactnolabel;


}
