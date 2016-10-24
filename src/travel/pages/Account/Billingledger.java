package travel.pages.Account;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by TCT on 10/10/2016.
 */
public class Billingledger {

    WebDriver driver;

    @FindBy(xpath = "//h1")
    public WebElement Hedpagetitle;

    @FindBy(linkText = "From Date")
    public WebElement frodat;

    @FindBy(linkText = "To Date")
    public WebElement todat;

    @FindBy(linkText = "Customer Name")
    public WebElement custnm;

    @FindBy(id = "ddlCust_Nm")
    public WebElement selectcustnam;

    @FindBy(id = "Invoice No")
    public WebElement invno;

    @FindBy(id = "txtInvNo")
    public WebElement textinvno;

    @FindBy(id = "btnSave")
    public WebElement view;

    @FindBy(linkText = "Cancel")
    public WebElement cancel;

    @FindBy(id = "btnexport")
    public WebElement expotoexcel;

    public Billingledger(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, true);
        if (!Hedpagetitle.isDisplayed())
            throw new IllegalStateException("this is not add billing ledger page");

    }

    public WebElement getpagetitle()
    {
        return Hedpagetitle;
    }

    public void clikfromda()
    {
        frodat.click();
    }

    public void clicktoda()
    {
        todat.click();
    }

    public WebElement getcustnam()
    {
        return custnm;
    }

    public void setcustname(String custname)
    {
        Select combo = new Select(selectcustnam);
        combo.selectByVisibleText(custname);
    }

    public WebElement getinvno()
    {
        return invno;
    }



}
