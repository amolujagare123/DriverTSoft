package travel.pages.Admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Tcraft on 29/08/2016.
 */
public class UserMaster {

    WebDriver driver;

    @FindBy(xpath = "//h1")
   public WebElement Hedpagetitle;


    @FindBy(linkText = "Add New")
  public   WebElement BtnAddNew;

    @FindBy(id="Emp_Nm")
   public WebElement txtEmployeeName;

    @FindBy( id="Password")
    public WebElement txtPassword;

    @FindBy( id="ConfirmPassword")
    public WebElement txtReTypePasswor;

    @FindBy(id="Designation")
    public WebElement selectDesignation;

    @FindBy(id="ContNo1")
    public WebElement txtmobileno;

    @FindBy(id="Email")
    public WebElement txtEmail;

    @FindBy(id="Address")
   public WebElement txtAddress;

    @FindBy(id="Add_info")
    public WebElement txtAdditInfo;

    @FindBy(id="btnSubmit")
   public WebElement btnSave;

    @FindBy(id="confirm" )
     public WebElement ClickYes;

    UserMaster(WebDriver driver){

        PageFactory.initElements(driver,true);

        if(!Hedpagetitle.isDisplayed())
            throw new IllegalStateException("this is not Add user page");

    }


    public void setPagetitle(String pagetitle)
    {
        Hedpagetitle.sendKeys(pagetitle);
    }


    public  void setEmployeeName(String EmployeeName)
    {
    txtEmployeeName.sendKeys(EmployeeName);
    }

    public  void setPassword(String Password)
    {
        txtPassword.sendKeys(Password);
    }//

    public  void setReTypePassword(String RePassword)
    {
        txtReTypePasswor.sendKeys(RePassword);
    }

    public  void setDesignation(String Desig)
    {
       Select combo = new Select (selectDesignation) ;
        combo.selectByVisibleText(Desig);
    }

    public  void setMobile(String Mobile)
    {
        txtmobileno.sendKeys(Mobile);
    }

    public  void setEmail(String Email)
    {
        txtEmail.sendKeys(Email);
    }

    public  void setAddress(String Address)
    {
        txtAddress.sendKeys(Address);
    }

    public  void setAddtionalInfo(String AddInfo)
    {
        txtAdditInfo.sendKeys(AddInfo);
    }

    public  void setBtnSave()
    {
        btnSave.click();
    }

    public  void setClickYes()
    {
        ClickYes.click();
    }

}
