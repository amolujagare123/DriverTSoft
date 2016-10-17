package travel.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Admin on 27/09/2016.
 */
public class Menu {

    WebDriver driver;

    /*Admin*/

    @FindBy(linkText = "Admin")
   public WebElement Admin;

    @FindBy(linkText = "User Master")
   public WebElement UserMaster;

    @FindBy(linkText = "Change Password")
    public WebElement ChangePassword;

    @FindBy(linkText = "Permission")
    public WebElement Permission;

    @FindBy(linkText = "Email")
    public WebElement Email;

/*Master*/
   @FindBy(linkText = "Master")
   public WebElement Master;

    @FindBy(linkText = "Supplier")
    public WebElement Supplier;

    @FindBy(linkText = "Customer")
    public WebElement Customer;

    @FindBy(linkText = "Bank")
    public WebElement Bank;

    @FindBy(linkText = "Tax Master")
    public WebElement TaxMaster;

    /*Account*/
    @FindBy(linkText = "Account")
    public WebElement Account;

    @FindBy(linkText = "Transaction")
    public WebElement Transaction;

    @FindBy(linkText = "Expense")
    public WebElement Expense;

    @FindBy(linkText = "Receipt")
    public WebElement Receipt;

    @FindBy(linkText = "Billing Ledger")
    public WebElement BillingLedger;

    @FindBy(linkText = "Profit & Loss")
    public WebElement ProfitAndLoss;

/*Enquiry*/
    @FindBy(linkText = "Enquiry")
    public WebElement Enquiry;

 /*Trip*/
    @FindBy(linkText = "Trip")
    public WebElement Trip;

 /*Invoice*/
    @FindBy(linkText = "Invoice")
    public WebElement Invoice;

/*Credit Note*/
    @FindBy(linkText = "Credit Note")
    public WebElement CreditNote;

  /*Summary*/
    @FindBy(linkText = "Summary")
    public WebElement Summary;


    public Menu(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);

    }

/*Admin*/
    public void clickUserMaster()
    {
        Admin.click();
        UserMaster.click();
    }

   public void clickChangePassword()
   {
       Admin.click();
       ChangePassword.click();
   }

    public void clickPermission()
    {
        Admin.click();
        Permission.click();
    }

    public void clickEmail()
    {
        Admin.click();
        Email.click();
    }

 /*Master*/
    public void clickSupplier()
    {
        Master.click();
        Supplier.click();
    }

    public void clickCustomer()
    {
        Master.click();
        Customer.click();
    }

    public void clickBank()
    {
        Master.click();
        Bank.click();
    }
    public void clickTaxMaster()
    {
        Master.click();
        TaxMaster.click();
    }
 /*Account*/

    public void clickTransaction()
    {
        Account.click();
        Transaction.click();
    }

    public void clickExpense()
    {
        Account.click();
        Expense.click();
    }

    public void clickReceipt()
    {
        Account.click();
        Receipt.click();
    }

    public void clickBillingLedger()
    {
        Account.click();
        BillingLedger.click();
    }

    public void clickProfitAndLoss()
    {
        Account.click();
        ProfitAndLoss.click();
    }
/*Enquiry*/
    public void clickEnquiry()
    {
        Enquiry.click();
    }
/*Trip*/
    public void clickTrip()
    {
        Trip.click();
    }

 /*Invoice*/

    public void clickInvoice()
    {
        Invoice.click();
    }
/*Credit Note*/
    public void clickCreditNote()
    {
        CreditNote.click();
    }
/*Summary*/
    public void clickSummary()
    {
        Summary.click();
    }
}
