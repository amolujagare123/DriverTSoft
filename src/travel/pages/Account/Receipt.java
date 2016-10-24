package travel.pages.Account;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by TCT on 10/5/2016.
 */
public class Receipt
{
    WebDriver driver;

    @FindBy(xpath = "//h1")
    public WebElement Hedpagetitle;

    @FindBy(linkText = "Trip Number")
    public WebElement tripno;

    @FindBy(linkText = "Customer Name")
    public WebElement custnm;

    @FindBy(linkText = "Invoice Number")
    public WebElement invnum;

    @FindBy(id = "T")
    public WebElement raditripno;

    @FindBy(id = "C")
    public WebElement radicustnm;

    @FindBy(id = "I")
    public WebElement radiinvnm;

    @FindBy(xpath = ".//*[@id='divtripno']/div[1]")
    public WebElement tripnolabel;

    @FindBy(xpath = "//thead//th[1]")
    public WebElement invonolabel;

    @FindBy(xpath = "//thead//th[2]")
    public WebElement invoiamtlabel;

    @FindBy(xpath = "//thead//th[3]")
    public WebElement pendiamtlabel;

    @FindBy(xpath = "//thead//th[4]")
    public WebElement paidamtlabel;

    @FindBy(id = "chk_pvid[0]")
    public WebElement tricheckbox;

    @FindBy(linkText = "Balance")
    public WebElement bal;

    @FindBy(id = "txtBalance")
    public WebElement txtbal;

    @FindBy(linkText = "Voucher No")
    public WebElement vouchno;

    @FindBy(id = "Voucher_Id")
    public WebElement vouchid;

    @FindBy(linkText = "Customer Name")
    public WebElement custnam;

    @FindBy(id = "txtCustNm")
    public WebElement txtcust;

    @FindBy(linkText = "Voucher Date")
    public WebElement vouchdate;

    @FindBy(linkText = "Payment Mode")
    public WebElement selectpaymemod;

    @FindBy(linkText = "Payment Details")
    public WebElement paydetai;

    @FindBy(id = "PV_Cash_Dtls")
    public WebElement  paydettext;

    @FindBy(linkText = "Amount Paid")
    public WebElement amtpaid;

    @FindBy(id = "txtPaidAmt")
    public WebElement amtpaidtxt;


    public Receipt(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, true);
        if(!Hedpagetitle.isDisplayed())
            throw new IllegalStateException("this is not add receipt voucher page");

    }

    public WebElement getpagetitle()
    {
        return Hedpagetitle;
    }

    public WebElement gettripno()
    {
       return tripno;
    }

    public WebElement getcustnm()
    {
        return custnm;
    }

    public WebElement getinvno()
    {
       return invnum;
    }

    public void clicktripno()
    {
        raditripno.click();
    }

    public void clickcustnm()
    {
        radicustnm.click();
    }

    public void clickinvno()
    {
        radiinvnm.click();
    }

    public WebElement gettripnolabel()
    {
        return tripnolabel;
    }

    public WebElement getinvoinolabel()
    {
        return invonolabel;
    }

    public WebElement getinvoiamtlabel()
    {
        return invoiamtlabel;
    }

    public WebElement getpendamtlabel()
    {
        return  pendiamtlabel;
    }

    public WebElement  getpaidamtlabel()
    {
        return paidamtlabel;
    }

    public  void clicktricheckbox()
    {
        tricheckbox.click();
    }

    public  WebElement getbalan()
    {
       return bal;
    }

    public  WebElement gettxtbal()
    {
        return txtbal;
    }

    public  WebElement getvouchno()
    {
        return vouchno;
    }

    public WebElement getvouchid()
    {
        return vouchid;
    }

    public  WebElement getcustnam()
    {
        return  custnam;
    }

    public  WebElement getcusttxt()
    {
        return txtcust;
    }

    public WebElement getvouchdate()
    {
        return vouchdate;
    }

    public void setpaymod(String paymod)
    {
        Select combo = new Select(selectpaymemod);
        combo.selectByVisibleText(paymod);
    }

    public WebElement getpaydetai()
    {
        return  paydetai;
    }

    public void set(String paydettex)
    {
        paydettext.sendKeys(paydettex);

    }

    public WebElement getamountpaid()
    {
        return amtpaid;
    }

    public WebElement getamtpaidtxt()
    {
        return amtpaidtxt;
    }

}
