package travel.pages.Master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by TCT on 8/31/2016.
 */
public class Supplier {

    WebDriver driver;


    @FindBy(xpath = "///h1")
    public WebElement Hedpagetitle;

    @FindBy(linkText = "Add New")
    public WebElement Addnew;

    @FindBy(id = "Serv_1")
    public WebElement Bus;

    @FindBy(id = "Serv_2")
    public WebElement Airline;

    @FindBy(id = "Serv_3")
    public WebElement Car;

    @FindBy(id = "Serv_4")
    public WebElement Hotel;

    @FindBy(id = "Serv_5")
    public WebElement Train;

    @FindBy(id = "Serv_6")
    public WebElement Visa;

    @FindBy(id = "Serv_7")
    public WebElement Passport;

    @FindBy(id = "Serv_8")
    public WebElement Miscellaneous;

    @FindBy(id = "Serv_9")
    public WebElement Insurance;

    @FindBy(id = "Supp_Nm")
    public WebElement txtsuppliername;

    @FindBy(id = "Supp_Addr")
    public WebElement txtaddress;

    @FindBy(id = "City")
    public WebElement txtcity;

    @FindBy(id = "State")
    private WebElement txtstate;

    @FindBy(id = "Fax_No")
    private WebElement txtfaxno;

    @FindBy(id = "ST_Reg_No")
    private WebElement txtservicetax;

    @FindBy(id = "ContNo1")
    private WebElement txtcontactno1;

    @FindBy(id = "Cont_Persn")
    private WebElement txtcontactperson1;

    @FindBy(id = "ContNo2")
    private WebElement txtcontactno2;

    @FindBy(id = "Sec_Cont_Persn")
    private WebElement txtcontactperson2;

    @FindBy(id = "Supp_Email")
    private WebElement txtemail;

    @FindBy(id = "Website")
    private WebElement txtwebsite;

    @FindBy(id = "ddl_BankNm")
    private WebElement selectbankname;

    @FindBy(id = "Bank_Acc_No")
    private WebElement txtbankaccountno;

    @FindBy(id = "Branch_Nm")
    private WebElement txtbranchname;

    @FindBy(id = "Branch_Addr")
    private WebElement txtbranchaddress;

    @FindBy(id = "MICR_No")
    private WebElement txtmicrno;

    @FindBy(id = "IFSC_Code")
    private WebElement txtifsccode;

    @FindBy(xpath ="//div[2]//div[3]")
    public WebElement Buslabel;

    @FindBy(xpath = "//div[2]//div[5]")
    public WebElement Airlabel;

    @FindBy(xpath = "//div[2]//div[7]")
    public WebElement Carlabel;

    @FindBy(xpath = "//div[2]//div[9]")
    public WebElement Hotellabel;

    @FindBy(xpath = "//div[3]//div[3]")
    public WebElement Trailabel;

    @FindBy(xpath = "//div[3]//div[5]")
    public WebElement Visalabel;

    @FindBy(xpath = "//div[3]//div[7]")
    public WebElement Passlabel;

    @FindBy(xpath = "//div[3]//div[9]")
    public WebElement Misclabel;

    @FindBy(xpath = "//div[4]//div[3]")
    public WebElement Insulabel;

    @FindBy(xpath = "//div[5]//div[2]")
    public WebElement supplnmlabel;

    @FindBy(xpath = "//div[5]//div[4]")
    public WebElement addrlabel;

    @FindBy(xpath = "//div[6]//div[2]")
    public WebElement citylabel;

    @FindBy(xpath = "//div[6]//div[4]")
    private WebElement statelabel;

    @FindBy(xpath = "//div[7]//div[2]")
    private WebElement faxlabel;

    @FindBy(xpath = "//div[7]//div[4]")
    private WebElement servitaxlabel;

    @FindBy(xpath = "//div[8]//div[2]")
    private WebElement contactnolabel1;

    @FindBy(xpath = "//div[8]//div[4]")
    private WebElement contperlabel1;

    @FindBy(xpath = "//div[9]//div[2]")
    private WebElement contnolabel2;

    @FindBy(xpath = "//div[9]//div[4]")
    private WebElement contperlabel2;

    @FindBy(xpath = "//div[10]//div[2]")
    private WebElement emailabel;

    @FindBy(xpath = "//div[10]//div[4]")
    private WebElement websitelabel;

    @FindBy(xpath = "//div[11]//div[2]")
    private WebElement banknmlabel;

    @FindBy(xpath = "//div[11]//div[4]")
    private WebElement accnolabel;

    @FindBy(xpath = "//div[12]//div[2]")
    private WebElement brannmlabel;

    @FindBy(xpath = "//div[12]//div[4]")
    private WebElement branchaddrlabel;

    @FindBy(xpath = "//div[13]//div[2]")
    private WebElement micrnolabel;

    @FindBy(xpath = "//div[13]//div[4]")
    private WebElement ifsclabel;

    @FindBy(id = "btnSubmit")
    public WebElement btnSave;

    @FindBy(id = "confirm")
    public WebElement ClickYes;

    @FindBy(xpath = "//div[15]/a")
    public WebElement Cancellabel;

    @FindBy(xpath = "//thead//th[1]")
    public WebElement editlabel;

    @FindBy(xpath = "//thead//th[2]")
    public WebElement supnmlabel;

    @FindBy(xpath = "//thead//th[3]")
    public WebElement citlabel;

    @FindBy(xpath = "//thead//th[4]")
    public WebElement stalabel;

    @FindBy(xpath = "//thead//th[5]")
    public WebElement contperlabel;

    @FindBy(xpath = "//thead//th[6]")
    public WebElement contnlabel;

    @FindBy(xpath = "//thead//th[7]")
    public WebElement suppemaillabel;

    @FindBy(xpath = "//thead//th[8]")
    public WebElement delelabel;


   public Supplier(WebDriver driver) {
        PageFactory.initElements(driver, true);
        if (!Hedpagetitle.isDisplayed())
            throw new IllegalStateException("this is not Supplier page");
    }

    public void setpagetitle(String pagetitle)
    {
        Hedpagetitle.sendKeys(pagetitle);

    }

    public void clickAddNew()
    {
       Addnew.click();
    }

    public void clickbusservice()
    {
        Bus.click();
    }

    public void clickairlineservice()
    {
        Airline.click();

    }

    public void clickcarservice()
    {
        Car.click();
    }

    public void clickhotelservice()
    {
        Hotel.click();

    }

    public void clicktrainservice()
    {
        Train.click();

    }

    public void clickvisaservice()
    {
        Visa.click();

    }

    public void clickpassportservice()
    {
        Passport.click();

    }
    public void clickMiscellaneouservice()
    {
        Miscellaneous.click();

    }
    public void clickinsuranceservice()
    {
        Insurance.click();

    }

    public void suppliername(String name)
    {
        txtsuppliername.sendKeys(name);

    }

    public void settxtaddress(String address)
    {

        txtaddress.sendKeys(address);

    }

    public void settxtcity(String city)
    {
        txtcity.sendKeys(city);

    }

    public void settxtstate(String state)
    {
        txtstate.sendKeys(state);

    }

    public void settxtfaxno(String faxno)
    {
        txtfaxno.sendKeys(faxno);

    }

    public void settxtservicetax(String serivicetax)
    {
        txtservicetax.sendKeys(serivicetax);

    }

    public void settxtcontactno1(String contactno1)
    {
        txtcontactno1.sendKeys(contactno1);

    }

    public void setcontactperson1(String contactperson1)
    {
        txtcontactperson1.sendKeys(contactperson1);

    }

    public void settxtcontactno2(String contactno2)
    {
        txtcontactno2.sendKeys(contactno2);

    }

    public void settxtcontactperson2(String contactperson2)
    {
        txtcontactperson2.sendKeys(contactperson2);

    }

    public void settxtemail(String email)
    {
        txtemail.sendKeys(email);

    }

    public void settxtwebsite(String website)
    {
        txtwebsite.sendKeys(website);

    }

    public void settxtBankname(String bankname)
    {
        Select combo = new Select(selectbankname);
        combo.selectByVisibleText(bankname);
    }

    public void settxtbankaccountno(String bankaccountno)
    {
        txtbankaccountno.sendKeys(bankaccountno);

    }

    public void settxtbranchname(String branchname)
    {
        txtbranchname.sendKeys(branchname);

    }

    public void settxtbranchaddress(String branchaddress)
    {
        txtbranchaddress.sendKeys(branchaddress);

    }

    public void settxtmicrno(String micrno)
    {
        txtmicrno.sendKeys(micrno);

    }

    public void settxtifsccode(String ifsccode)
    {
        txtifsccode.sendKeys(ifsccode);

    }

    public WebElement getbuslabel()
    {
        return Buslabel;
    }

    public WebElement getairlabel()
    {
        return  Airlabel;
    }

    public WebElement getcarlabel()
    {
        return  Carlabel;
    }

    public WebElement gethotellabel()
    {
        return  Hotellabel;
    }

    public WebElement gettrainlabel()
    {
        return  Trailabel;
    }

    public WebElement getvisalabel()
    {
        return  Visalabel;
    }

    public WebElement getpasslabel()
    {

        return Passlabel;
    }


    public WebElement getmisclabel()
    {
        return   Misclabel;
    }

    public WebElement getinsulabel()
    {
        return  Insulabel;
    }

    public WebElement getsuppnmlabel()
    {
        return  supplnmlabel;
    }

    public WebElement getaddrlabel()
    {
        return  addrlabel;
    }

    public WebElement getcitylabel()
    {
        return  citylabel;
    }

    public WebElement getstatelabel()
    {
        return  statelabel;
    }

    public WebElement getfaxlabel()
    {
        return  faxlabel;
    }

    public WebElement getServitaxlabel()
    {
        return   servitaxlabel;
    }

    public WebElement getcontactnolabel1()
    {
        return  contactnolabel1;
    }

    public WebElement getcontperlabel1()
    {
        return  contperlabel1;
    }


    public WebElement getcontnolabel2()
    {
        return  contnolabel2;
    }

    public WebElement getcontperlabel2()
    {
        return  contperlabel2;
    }

    public WebElement getemaillabel()
    {
        return  emailabel;
    }

    public WebElement getWebsitelabel()
    {
        return  websitelabel;
    }

    public WebElement getbanknmlabel()
    {
        return   banknmlabel;
    }

    public WebElement getaccnolabel()
    {
        return  accnolabel;
    }

    public void setbtnSave()
    {
        btnSave.click();

    }

    public void setClickYes()
    {
        ClickYes.click();

    }
}
































