package travel.pages.Admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.PublicKey;

/**
 * Created by Admin on 18/09/2016.
 */
public class ChangePassword {

    WebDriver driver;
    @FindBy(xpath = "//h1")
    public WebElement PageTitle;

    @FindBy(linkText = "Old Password")
    public WebElement OpLable1;

    @FindBy(id="oldPassword")
    public WebElement OldPassword;

    @FindBy(linkText = "New Password")
    public WebElement NewPlable;

    @FindBy(id="Password")
    public WebElement NewPass;

    @FindBy(linkText = "Confirm Password")
    public WebElement ReTyPlable;

    @FindBy(id="ConfirmPassword")
    public WebElement RetPassword;

    @FindBy(id="btnSubmit")
    public  WebElement SaveBtn;

    @FindBy(linkText = "Cancel")
    public WebElement canBtn;

    @FindBy(id="confirm" )
    public WebElement ClickYes;

    public ChangePassword(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
        if(!PageTitle.isDisplayed())
            throw new IllegalStateException("this is not Change Password page");
    }

    public WebElement   getPageTitle()
    {
    return  PageTitle;
    }

    public void setOldPassword(String OldPassword1)
    {
        OldPassword.sendKeys(OldPassword1);
    }

    public  void setNewPass(String NewPassword)
    {
        NewPass.sendKeys(NewPassword);
    }

    public void setRetPassword(String ReTypePassword1)
    {
        RetPassword.sendKeys(ReTypePassword1);
    }

    public void clickChangeBtn()
    {
    SaveBtn.click();
    }

    public void ClickCancelBtn()
    {
        canBtn.click();
    }
    public  void setClickYes()
    {
        ClickYes.click();
    }



}
