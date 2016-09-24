package travel.pages.Master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by TCT on 9/1/2016.
 */
public class Customer {

    WebDriver driver;
    @FindBy(xpath = "//h1")
    public WebElement Hedpagetitle;

    @FindBy(linkText = "Add New")
    public WebElement AddNew;

    @FindBy(id = "Cust_Nm")
    public WebElement txtcustomername;

    @FindBy(id = "Cust_Addr")
    public WebElement txtaddress;

    @FindBy(id = "ContNo1")
    public WebElement txtcontactno1;

    @FindBy(id = "Cont_Persn")
    public WebElement txtcontactname1;

    @FindBy(id = "ContNo2")
    public WebElement txtcontactno2;

    @FindBy(id = "Sec_Cont_Persn")
    public WebElement txtcontactname2;

    @FindBy(id = "Cust_Email")
    public WebElement txtemail;

    @FindBy(id = "ddlState")
    public WebElement selectstate;

    @FindBy(id = "ddlCity")
    public WebElement selectcity;

    @FindBy(id = "Nationality")
    public WebElement txtnationality;

    @FindBy(id = "Pin_Code")
    public WebElement txtpincode;

    @FindBy(xpath = "//div[2]//div[2]")
    public WebElement custname;

    @FindBy(xpath = "//div[2]//div[4]")
    public WebElement custaddr;

    @FindBy(xpath = "//div[3]//div[2]")
    public WebElement contno1;

    @FindBy(xpath = "//div[3]//div[4]")
    public WebElement contname1;

    @FindBy(xpath = "//div[4]//div[2]")
    public WebElement contno2;

    @FindBy(xpath = "//div[4]//div[4]")
    public WebElement contname2;

    @FindBy(xpath = "//div[5]//div[2]")
    public WebElement email;

    @FindBy(xpath = "//div[5]//div[4]")
    public WebElement state;

    @FindBy(xpath = "//div[6]//div[2]")
    public WebElement city;

    @FindBy(xpath= "//div[6]//div[4]")
    public WebElement nationa;

    @FindBy(xpath = "//div[7]//div[2]")
    public WebElement pinco;

    @FindBy(id = "btnSubmit")
    public WebElement btnSave;

    @FindBy(id = "confirm")
    public WebElement ClickYes;

    @FindBy(xpath = "//div[8]/a")
    public WebElement Cancel;

    @FindBy(xpath = ".//*[@id='jqgh_list_Cust_Id']")
    public WebElement edit;

    @FindBy(xpath = ".//*[@id='jqgh_list_Cust_Nm']")
    public WebElement custnm;

    @FindBy(xpath = ".//*[@id='jqgh_list_Cont_No']")
    public WebElement contperson;

    @FindBy(xpath = ".//*[@id='jqgh_list_Cont_Persn']")
    public WebElement contactno;

    @FindBy(xpath = ".//*[@id='jqgh_list_Cust_Email']")
    public WebElement emailid;

    @FindBy(xpath = ".//*[@id='jqgh_list_Delete']")
    public WebElement delet;

    @FindBy(linkText = "Delete")
    public WebElement deletebtn;

    @FindBy(id = "confirm")
    public WebElement yes;

    public Customer(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, true);
        if (!Hedpagetitle.isDisplayed())
            throw new IllegalStateException("this is not Customer Details page");

    }

    public void setpagetitle(String pagetitle)
    {
        Hedpagetitle.sendKeys(pagetitle);

    }

    public void clikAddNew()
    {
        AddNew.click();
    }


    public void setcustomername(String customername)
    {
        txtcustomername.sendKeys(customername);

    }

    public void setaddress(String address)
    {
        txtaddress.sendKeys(address);

    }

    public void setcontactno1(String contactno1)
    {
        txtcontactno1.sendKeys(contactno1);

    }

    public void setcontactname1(String contactname1)
    {
        txtcontactname1.sendKeys(contactname1);

    }

    public void setcontactno2(String contactno2)
    {
        txtcontactno2.sendKeys(contactno2);

    }

    public void setcontactname2(String contactname2)
    {
        txtcontactname2.sendKeys(contactname2);

    }

    public void setemail(String email)
    {
        txtemail.sendKeys(email);
    }

    public void setstate(String state)
    {
        Select combo = new Select(selectstate);
        combo.selectByVisibleText(state);
    }

    public void setcity(String city)
    {
        Select combo = new Select(selectcity);
        combo.selectByVisibleText(city);
    }

    public void setnationality(String nationality)
    {
        txtnationality.sendKeys(nationality);

    }

    public void setpincode(String pincode)
    {
        txtpincode.sendKeys(pincode);

    }

    public WebElement getcustnamelabel()
    {
        return custname;
    }

    public WebElement getcustaddrlabel()
    {
        return  custaddr;
    }

    public WebElement getcontno1label()
    {
        return  contno1;
    }

    public WebElement getcontname1label()
    {
        return contname1;
    }

    public WebElement getcontno2label()
    {
        return contno2;
    }

    public WebElement getcontname2label()
    {
        return contname2;
    }

    public WebElement getemaillabel()
    {
        return email;
    }

    public WebElement getstatelabel()
    {
        return  state;
    }

    public WebElement getcitylabel()
    {
        return  city;
    }

    public WebElement getnationalabel()
    {
        return  nationa;
    }

    public WebElement getpincolabel()
    {
        return pinco;
    }

    public WebElement getcancellabel()
    {
        return Cancel;
    }

    public WebElement geteditlabel()
    {
        return edit;
    }

    public WebElement getcustnmlabel()
    {
        return custnm;
    }

    public WebElement getcontpersonlabel()
    {
        return  contperson;
    }

    public WebElement getcontactnolabel()
    {
        return  contactno;
    }

    public WebElement getemailidlabel()
    {
        return  emailid;
    }

    public WebElement getdeletlabel()
    {
        return  delet;
    }

    public WebElement setdeletebtn()
    {
        return  deletebtn;
    }

    public WebElement setdeleteyes()
    {
        return  yes;
    }


    public void setBtnSave()
    {
        btnSave.click();
    }

    public void setClickYes()
    {
        ClickYes.click();
    }

}

























