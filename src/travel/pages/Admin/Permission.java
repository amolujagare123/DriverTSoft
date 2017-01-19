package travel.pages.Admin;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import travel.pages.Master.TaxMaster;

import java.awt.*;

/**
 * Created by AKSHAY on 19/01/2017.
 */
public class Permission {

    WebDriver driver;

    @FindBy(xpath = "//h1")
    public WebElement Logo;

    @FindBy(xpath = "//div[2]/label")
    public  WebElement Usernamelabel;

    @FindBy(xpath = ".//*[@id='ddl_EmpNm']")
    public WebElement SelectUsername;

    @FindBy(xpath = "//th[1]")
    public  WebElement Pagenamelabel;

    @FindBy(xpath = "//th[2]")
    public  WebElement Clicknamelabel;

    @FindBy(xpath = "//tr[1]/td[1]")
    public WebElement usermasterlabel;

    @FindBy(xpath = "//tr[2]/td[1]")
    public WebElement ChangePasslabel;

    @FindBy(xpath = "//tr[3]/td[1]")
    public WebElement Supplierlabel;

    @FindBy(xpath = "//tr[4]/td[1]")
    public WebElement Customerlabel;

    @FindBy(xpath = "//tr[5]/td[1]")
    public WebElement Banklabel;

    @FindBy(xpath = "//tr[6]/td[1]")
    public WebElement Transtionlabel;

    @FindBy(xpath = "//tr[7]/td[1]")
    public WebElement Expencelabel;

    @FindBy(xpath = "//tr[8]/td[1]")
    public WebElement Reciptlabel;

    @FindBy(xpath = "//tr[9]/td[1]")
    public WebElement Billingledgerlabel;

    @FindBy(xpath = "//tr[10]/td[1]")
    public WebElement Enquirylabel;

    @FindBy(xpath = "//tr[11]/td[1]")
    public WebElement triplabel;

    @FindBy(xpath = "//tr[12]/td[1]")
    public WebElement invoicelabel;

    @FindBy(xpath = "//tr[13]/td[1]")
    public WebElement criditNotelabel;

    @FindBy(xpath = "//tr[14]/td[1]")
    public WebElement permissionlabel;

    @FindBy(xpath = "//tr[15]/td[1]")
    public WebElement taxmasterlabel;

    @FindBy(xpath = "//tr[16]/td[1]")
    public WebElement EmailNotelabel;

    @FindBy(xpath = "//tr[17]/td[1]")
    public WebElement profitandlosslabel;

    @FindBy(xpath = "//tr[18]/td[1]")
    public WebElement summarylabel;

    @FindBy(xpath = "//tr[19]/td[1]")
    public WebElement printchecklabel;

    /*checkbox*/

    @FindBy(xpath = "//tr[1]/td[2]/input")
    public WebElement usermaster;

    @FindBy(xpath = "//tr[2]/td[2]/input")
    public WebElement ChangePass;

    @FindBy(xpath = "//tr[3]/td[2]/input")
    public WebElement Supplier;

    @FindBy(xpath = "//tr[4]/td[2]/input")
    public WebElement Customer;

    @FindBy(xpath = "//tr[5]/td[2]/input")
    public WebElement Bank;

    @FindBy(xpath = "//tr[6]/td[2]/input")
    public WebElement Transition;

    @FindBy(xpath = "//tr[7]/td[2]/input")
    public WebElement Expence;

    @FindBy(xpath = "//tr[8]/td[2]/input")
    public WebElement Recipt;

    @FindBy(xpath = "//tr[9]/td[2]/input")
    public WebElement Billingledger;

    @FindBy(xpath = "//tr[10]/td[2]/input")
    public WebElement Enquiry;

    @FindBy(xpath = "//tr[11]/td[2]/input")
    public WebElement trip;

    @FindBy(xpath = "//tr[12]/td[2]/input")
    public WebElement invoice;

    @FindBy(xpath = "//tr[13]/td[2]/input")
    public WebElement criditNote;

    @FindBy(xpath = "//tr[14]/td[2]/input")
    public WebElement permission;

    @FindBy(xpath = "//tr[15]/td[2]/input")
    public WebElement taxmaster;

    @FindBy(xpath = "//tr[16]/td[2]/input")
    public WebElement EmailNote;

    @FindBy(xpath = "//tr[17]/td[2]/input")
    public WebElement profitandloss;

    @FindBy(xpath = "//tr[18]/td[2]/input")
    public WebElement summary;

    @FindBy(xpath = "//tr[19]/td[2]/input")
    public WebElement printcheck;

    public Permission(WebDriver driver)
        {
    this.driver=driver;
    PageFactory.initElements(driver,this);
    if(!Logo.isDisplayed())
        throw new IllegalComponentStateException("This is not permission page");
}

    public WebElement getLogo()
    {
        return Logo;
    }

    public void setUsername(String selectuser)
    {
    Select combo = new Select (SelectUsername) ;
        combo.selectByVisibleText(selectuser);
    }

    public WebElement getUsernamelabel()
    {
        return Usernamelabel;
    }
    public WebElement getPagenamelabel()
    {
        return Pagenamelabel;
    }
    public WebElement getClicknamelabel()
    {
        return Clicknamelabel;
    }

    public WebElement getUsermasterlabel()
    {
        return usermasterlabel;
    }
    public WebElement getTriplabel()
    {
        return triplabel;
    }
    public WebElement getTranstionlabel()
    {
        return Transtionlabel;
    }
    public WebElement gettaxmasterlabel()
    {
        return taxmasterlabel;
    }
    public WebElement getSupplierlabel()
    {
        return Supplierlabel;
    }
    public WebElement getSummarylabel()
    {
        return summarylabel;
    }
    public WebElement getReciptlabel()
    {
        return Reciptlabel;
    }
    public WebElement getProfitandlosslabel()
    {
        return profitandlosslabel;
    }
    public WebElement getPrintchecklabel()
    {
        return printchecklabel;
    }
    public WebElement getEnquirylabel()
    {
        return Enquirylabel;
    }
    public WebElement getPermissionlabel()
    {
        return permissionlabel;
    }



    public WebElement getBanklabel()
    {
        return Banklabel;
    }

    public WebElement getBillingledgerlabel()
    {
        return Billingledgerlabel;
    }

    public WebElement getChangePasslabel()
    {
        return ChangePasslabel;
    }



    public WebElement getCriditNotelabel()
    {
        return criditNotelabel;
    }

    public WebElement getCustomerlabel()
    {
        return Customerlabel;
    }

    public WebElement getEmailNotelabel()
    {
        return EmailNotelabel;
    }

    public WebElement getExpencelabel()
    {
        return Expencelabel;
    }

    public WebElement getInvoicelabel()
    {
        return  invoicelabel;
    }


    public void ClickUsermaster()
    {
        usermaster.click();
    }
    public void ClickTrip()
    {
        trip.click();
    }
    public void ClickTransition()
    {
        Transition.click();
    }
    public void Clicktaxmaster()
    {
        taxmaster.click();
    }
    public void ClickSupplier()
    {
        Supplier.click();
    }
    public void ClickSummary()
    {
       summary.click();
    }
    public void ClickRecipt()
    {
        Recipt.click();
    }
    public void ClickProfitandloss()
    {
        profitandloss.click();
    }
    public void ClickPrintcheck()
    {
        printcheck.click();
    }
    public void ClickEnquiry()
    {
       Enquiry.click();
    }
    public void ClickPermission()
    {
        permission.click();
    }



    public void ClickBank()
    {
        Bank.click();
    }

    public void ClickBillingledger()
    {
        Billingledger.click();
    }

    public void ClickChangePass()
    {
        ChangePass.click();
    }

    public void ClickCriditNote()
    {
        criditNote.click();
    }

    public void ClickCustomer()
    {
       Customer.click();
    }

    public void ClickEmailNotelabel()
    {
       EmailNote.click();
    }

    public void ClickExpence()
    {
        Expence.click();
    }

    public void ClickInvoice()
    {
        invoice.click();
    }

}
