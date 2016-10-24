package travel.pages.Account;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by TCT on 10/4/2016.
 */
public class Expense
{
    WebDriver driver;

    @FindBy(xpath = "//h1")
    public WebElement Hedpagetitle;

    @FindBy(linkText = "Add New")
    public  WebElement AddNew;

    @FindBy(id = "Exp_No")
    public WebElement expeno;

    @FindBy(id = "Exp_Type_Nm")
    public  WebElement selectexptype;

    @FindBy(id = "Login_Id")
    public  WebElement selectempnm;

    @FindBy(id = "Paid_To_Party")
    public  WebElement paidtoparty;

    @FindBy(id = "Description")
    public  WebElement descrip;

    @FindBy(id = "ddlpaymode")
    public  WebElement selectpaymode;

    @FindBy(id = "Amount")
    public  WebElement amount;

    @FindBy(id = "Add_Info")
    public  WebElement addiinfo;

    @FindBy(linkText = "btnSubmit")
    public  WebElement save;

    @FindBy(id = "confirm")
    public  WebElement clickyes;

    @FindBy(xpath = "//div[1]/div/div[4]")
    public WebElement expnolabel;

    @FindBy(xpath = "//div[2]/div[2]/div/div[2]")
    public WebElement exptypelabel;

    @FindBy(xpath = "//div[2]/div[2]/div/div[4]")
    public WebElement empnmlabel;

    @FindBy(xpath = "//div[2]/div[3]/div/div[2]")
    public WebElement paitoparlabel;

    @FindBy(xpath = "//div[2]/div[3]/div/div[4]")
    public WebElement descrilabel;

    @FindBy(xpath = ".//*[@id='ddlpaymode']")
    public WebElement paymolabel;

    @FindBy(xpath = "//div[2]/div[4]/div/div[4]")
    public WebElement amtlabel;

    @FindBy(xpath = "//div[3]/div[3]/div/div[2]")
    public WebElement addinfolabel;

    @FindBy(xpath = ".//*[@id='jqgh_list_Exp_Id']")
    public WebElement editlabel;

    @FindBy(xpath = ".//*[@id='jqgh_list_Exp_No']")
    public WebElement expnlabel;

    @FindBy(xpath = ".//*[@id='jqgh_list_Emp_Nm']")
    public WebElement empnamelabel;

    @FindBy(xpath = ".//*[@id='jqgh_list_Exp_Date']")
    public WebElement expdatlabel;

    @FindBy(xpath = ".//*[@id='jqgh_list_Exp_Type_Nm']")
    public WebElement exptyplabel;

    @FindBy(xpath = ".//*[@id='jqgh_list_Amount']")
    public WebElement expamtlabel;

    @FindBy(xpath = ".//*[@id='jqgh_list_Delete']")
    public WebElement deletlabel;

    @FindBy(id = "confirm")
    public  WebElement clickdel;

    @FindBy(linkText = "Cancel")
    public WebElement cancel;


    public Expense(WebDriver driver)
   {
       this.driver = driver;
       PageFactory.initElements(driver,true);
       if(!Hedpagetitle.isDisplayed())
        throw new IllegalStateException("this is not add expanse page");

   }

    public WebElement getpagetitle()
    {
        return Hedpagetitle;
    }

    public void clickAddNew()
    {
        AddNew.click();
    }

    public WebElement getexpno()
    {
       return  expeno;
    }

    public void setexptypet(String exptype)
    {
        Select combo = new Select(selectexptype);
        combo.selectByVisibleText(exptype);
    }

    public void setempnm(String empnm)
    {
        Select combo = new Select(selectempnm);
        combo.selectByVisibleText(empnm);
    }

    public void setpaitopar(String paitopar)
    {
        paidtoparty.sendKeys(paitopar);
    }

    public void setdescri(String descri)
    {
        descrip.sendKeys(descri);
    }
    public void setpaymod(String paymod)
    {
        Select combo = new Select(selectpaymode);
        combo.selectByVisibleText(paymod);
    }

    public void setamt(String amt)
    {
        amount.sendKeys(amt);
    }

    public void setaddi(String addi)
    {
        addiinfo.sendKeys(addi);
    }

    public void clicksave()
    {
        save.click();
    }

    public void clickyes()
    {
        clickyes.click();
    }

    public WebElement getexpnolabel()
    {
        return  expnolabel;
    }

    public WebElement getexptypelabel()
    {
        return  exptypelabel;
    }

    public WebElement getempnmlabel()
    {
        return  empnmlabel;
    }

    public WebElement getpaitoparlabel()
    {
        return  paitoparlabel;
    }

    public WebElement getdesilabel()
    {
        return  descrilabel;
    }

    public WebElement getpaymolabel()
    {
        return  paymolabel;
    }

    public WebElement getamtlabel()
    {
        return  amtlabel;
    }

    public WebElement getaddilabel()
    {
        return  addinfolabel;
    }

    public WebElement geteditlabel()
    {
        return  editlabel;
    }

    public WebElement getexpnlabel()
    {
        return  expnlabel;
    }

    public WebElement getempnamlabel()
    {
        return  empnamelabel;
    }

    public WebElement getexpdatlabel()
    {
        return  expdatlabel;
    }

    public WebElement getexptyplabel()
    {
        return   exptyplabel;
    }

    public WebElement getexpamtlabel()
    {
        return   expamtlabel;
    }

    public WebElement getdelelabel()
    {
        return  deletlabel;
    }

    public void clickdel()
    {
        clickdel.click();
    }

    public void setcancel()
    {
        cancel.click();
    }



}
