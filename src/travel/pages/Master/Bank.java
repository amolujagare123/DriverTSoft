package travel.pages.Master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by TCT on 9/2/2016.
 */
public class Bank {

    WebDriver driver;
    @FindBy(xpath = "//h1")
    public WebElement Hedpagetitle;

    @FindBy(linkText = "Add New")
    public WebElement Addnew;

    @FindBy(id = "ddl_BankNm")
    public WebElement selectbankname;

    @FindBy(xpath = "//div[2]//div[2]")
    public WebElement banknamelabel;

    @FindBy(id = "Bank_Acc_No")
    public WebElement txtaccountno;

    @FindBy(xpath = "//div[3]//div[2]")
    public WebElement accountlabel;

    @FindBy(id = "Bank_Addr")
    public WebElement txtbankaddr;

    @FindBy(xpath = "//div[4]//div[2]")
    public WebElement bankaddlabel;

    @FindBy(id = "ContNo1")
    public WebElement txtcontactno;

    @FindBy(xpath = "//div[5]//div[2]")
    public WebElement contnolabel;

    @FindBy(id = "btnSubmit")
    public WebElement btnSave;

    @FindBy(xpath = "//div/div[6]/a")
    public WebElement cancel;

    @FindBy(id = "jqgh_list_BDtls_Id")
    public WebElement editlabel;

    @FindBy(id = "jqgh_list_Bank_Nm")
    public WebElement banknmlabel;

    @FindBy(id = "jqgh_list_Bank_Acc_No")
    public WebElement accountnolabel;

    @FindBy(id = "jqgh_list_Bank_Addr")
    public WebElement bankaddrelabel;

    @FindBy(id = "jqgh_list_Bank_ContNo")
    public WebElement contactlabel;

    @FindBy(id = "confirm")
    public WebElement ClickYes;

    @FindBy(linkText = "Delete")
    public WebElement deletebtn;

    @FindBy(id = "confirm")
    public WebElement yes;


    public Bank(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, true);
        if (!Hedpagetitle.isDisplayed())
            throw new IllegalStateException("this is not add bank page");

    }

    public WebElement getpagetitle()
    {
        return Hedpagetitle;
    }

    public void clikAddNew()
    {

        Addnew.click();
    }

    public void setBankname(String bankname)
    {
        Select combo = new Select(selectbankname);
        combo.selectByVisibleText(bankname);
    }

    public WebElement getbanknamelabel()
    {
        return banknamelabel;
    }


    public WebElement geteditlabel()
    {
        return editlabel;
    }

    public WebElement getbanknmlabel()
    {
        return banknmlabel;
    }

    public void setaccountno(String accountno)
    {
        txtaccountno.sendKeys(accountno);

    }

    public WebElement getaccountlabel()
    {
        return accountlabel;
    }

    public WebElement getaccountnolabel()
    {
        return accountnolabel;
    }


    public void setbankaddr(String bankaddr)
    {
        txtbankaddr.sendKeys(bankaddr);

    }

    public WebElement getbankaddlabel() {
        return bankaddlabel;
    }

    public WebElement getbankaddrelabel() {
        return bankaddrelabel;
    }


    public void setcontactno(String contactno)
    {
        txtcontactno.sendKeys(contactno);

    }

    public WebElement getcontnolabel()
    {
        return contnolabel;
    }


    public WebElement getcontactlabel()
    {
        return contactlabel;
    }

    public void setbtnSave()
    {
        btnSave.click();

    }

    public void setClickYes()
    {
        ClickYes.click();

    }

    public void setcancel()
    {
        cancel.click();
    }

    public void setdelete()
    {
        deletebtn.click();
    }

    public void setYes()
    {
        yes.click();

    }


}
