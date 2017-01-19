package travel.pages.Admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Tcraft on 20/09/2016.
 */
public class Email {

WebDriver driver;

    @FindBy(xpath = "//h2")
    public WebElement Logo;

    @FindBy(xpath = "//tr/td[1]")
    public WebElement EmployeeName;

    @FindBy(xpath = "//tr/th[1]")
    public WebElement Employeenamelable;

    @FindBy(xpath = "//tr/td[2]")
    public WebElement Email;

    @FindBy(xpath = "//tr/th[2]")
    public WebElement Emaillabel;

    @FindBy (xpath = "//tr/td[3]/input")
    public WebElement Enquiry;

    @FindBy(xpath = "//tr/th[3]")
    public WebElement Enquirylabel;

    @FindBy(xpath = "//tr/td[4]/input")
    public  WebElement Trip;

    @FindBy(xpath = "//tr/th[4]")
    public  WebElement Triplabel;

    @FindBy(xpath = "//tr/td[6]/input")
    public WebElement Voucher;

    @FindBy(xpath = "//tr/th[6]")
    public WebElement Voucherlable;

    @FindBy(xpath = "//tr/td[5]/input")
    public WebElement Invoice;

    @FindBy(xpath = "//tr/th[5]")
    public WebElement Invoicelable;

    @FindBy(xpath = "//div/button")
    public WebElement Apply;

    @FindBy(xpath = "//div/a")
    public WebElement cancel;

    @FindBy(xpath = ".//*[@id='confirm']")
    public WebElement yes;

    @FindBy(xpath = ".//*[@id='btnNo']")
    public WebElement No;


    public Email(WebDriver driver)
    {    this.driver=driver;
        PageFactory.initElements(driver,this);
       if(!Logo.isDisplayed());
        throw new IllegalStateException("this is not Email page");
    }

    public WebElement getLogo()
    {
        return Logo;
    }


    public WebElement getEmployeeName()
    {
        return EmployeeName;
    }

    public WebElement getEmployeenamelable()
    {
        return Employeenamelable;
    }

    public WebElement getEmail()
    {
        return Email;
    }

    public WebElement getEmaillabel()
    {
        return Emaillabel;
    }

    public WebElement getEnquirylabel()
    {
        return  Enquirylabel;
    }


    public WebElement getTriplabel()
    {
        return  Triplabel;
    }

    public WebElement getInvoicelable()
    {
        return  Invoicelable;
    }

    public WebElement getVoucherlable()
    {
        return  Voucherlable;
    }
    public void ClickEnquiry()
    {
        Enquiry.click();
    }

    public void ClickTrip()
    {
        Trip.click();
    }

    public void ClickVoucher()
    {
        Voucher.click();
    }

    public  void ClickInvoice()
    {
        Invoice.click();
    }

    public void ClickApply()
    {
        Apply.click();
    }

    public void ClickYes()
    {
        yes.click();
    }

    public void ClickNo()
    {
        No.click();
    }



}
