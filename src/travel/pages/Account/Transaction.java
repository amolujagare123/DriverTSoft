package travel.pages.Account;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by TCT on 10/3/2016.
 */
public class Transaction
{

    WebDriver driver;

    @FindBy(xpath = "//h1")
    public WebElement Hedpagetitle;

    @FindBy(linkText = "Add New")
    public  WebElement AddNew;

    @FindBy(id = "Pay_Cat")
    public  WebElement selectpaycate;

    @FindBy(id = "ddlBankNm")
    public  WebElement selectbankname;

    @FindBy(id = "ddlAccNo")
    public  WebElement selectaccno;

    @FindBy(id = "ddlpaymode")
    public  WebElement selectpaytype;

    @FindBy(id = "Amount")
    public  WebElement amt;

    @FindBy(id = "Remark")
    public  WebElement remark;

    @FindBy(id = "btnSubmit")
    public  WebElement clicksave;

    @FindBy(id = "confirm")
    public  WebElement clickyes;

    @FindBy(linkText = "Cancel")
    public WebElement cancel;

    @FindBy(xpath = "//div[1]/div/div[2]")
    public WebElement trandatelabel;

    @FindBy(xpath = "//div[1]/div/div[4]")
    public WebElement paycatlabel;

    @FindBy(xpath = "//div[2]/div/div[2]")
    public WebElement banknmlabel;

    @FindBy(xpath = "//div[2]/div/div[4]")
    public WebElement accnolabel;

    @FindBy(xpath = "//div[3]/div/div[2]")
    public WebElement paytyplabel;

    @FindBy(xpath = "//div[3]/div/div[4]")
    public WebElement remarklabel;

    @FindBy(xpath = "//div[4]/div/div[2]")
    public WebElement amtlabel;

    @FindBy(xpath = "//thead//th[1]")
    public WebElement editlabel;

    @FindBy(xpath = "//thead//th[2]")
    public WebElement banknamelabel;

    @FindBy(xpath = "//thead//th[3]")
    public WebElement paycatelabel;

    @FindBy(xpath = "//thead//th[4]")
    public WebElement amountlabel;

    @FindBy(xpath = "//thead//th[5]")
    public WebElement tradatlabel;

    @FindBy(xpath = "//thead//th[6]")
    public WebElement chequeddlabel;

    @FindBy(xpath = "//thead//th[6]")
    public WebElement deletelabel;

    @FindBy(id = "confirm")
    public  WebElement  yesdelete;


    public Transaction(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, true);
        if (!Hedpagetitle.isDisplayed())
            throw new IllegalStateException("this is not add transaction page");

    }

    public WebElement getpagetitle()
    {
        return Hedpagetitle;
    }

    public void clikAddNew()
    {
        AddNew.click();
    }

    public void setpaycat(String paycat)
    {
        Select combo = new Select(selectpaycate);
        combo.selectByVisibleText(paycat);
    }

    public void setbankname(String bankname)
    {
        Select combo = new Select(selectbankname);
        combo.selectByVisibleText(bankname);
    }

    public void setaccno(String accno)
    {
        Select combo = new Select(selectaccno);
        combo.selectByVisibleText(accno);
    }

    public void setpaytyp(String paytyp)
    {
        Select combo = new Select(selectpaytype);
        combo.selectByVisibleText(paytyp);
    }

    public void setamount(String amount)
    {
        amt.sendKeys(amount);
    }

    public void setremark(String remak)
    {
        remark.sendKeys(remak);
    }

    public WebElement gettrandatelabel()
    {
        return   trandatelabel;
    }

    public WebElement getpaycatlabel()
    {
        return   paycatlabel;
    }

    public WebElement getbanknmlabel()
    {
        return  banknmlabel;
    }

    public WebElement getaccnolabel()
    {
        return  accnolabel;
    }

    public WebElement getpaytyplabel()
    {
        return   paytyplabel;
    }

    public WebElement getremarklabel()
    {
        return   remarklabel;
    }

    public WebElement getamtlabel()
    {
        return   amtlabel;
    }

    public WebElement geteditlabel()
    {
        return  editlabel;
    }

    public WebElement getbannknamelabel()
    {
        return  banknamelabel;
    }

    public WebElement getpaycatelabel()
    {
        return  paycatelabel;
    }

    public WebElement getamountlabel()
    {
        return  amountlabel;
    }

    public WebElement gettradatlabel()
    {
        return  tradatlabel;
    }

    public WebElement getChequeddlabel()
    {
        return  chequeddlabel;
    }

    public WebElement getdeletelabel()
    {
        return  deletelabel;
    }

    public void setyesdelete()
    {
        yesdelete.click();
    }

    public void setbtnSave()
    {
        clicksave.click();

    }

    public void setClickYes()
    {
        clickyes.click();
    }


    public void setcancel()
    {
        cancel.click();
    }




}
