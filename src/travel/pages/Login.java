package travel.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Tcraft on 29/08/2016.
 */
public class Login {
    WebDriver driver;

    @FindBy(id = "msg")
    public WebElement mesg;

    @FindBy(id = "Email_Id")
    public WebElement txtUsername;

    @FindBy(id = "Password")
    public WebElement txtPassword;

    @FindBy(id = "btnSubmit1")
    public WebElement btnSubmit;

    @FindBy(xpath = "//b")
    public WebElement lblLogo;

    public Login(WebDriver driver,String url) {
        this.driver = driver;
        driver.get(url);
        PageFactory.initElements(driver,this);
        if (!lblLogo.isDisplayed())
            throw new IllegalStateException("this is not login page");

    }

    public void  setUsername(String username)
    {
        txtUsername.sendKeys(username);

    }

    public void setPassword(String password)
    {
        txtPassword.sendKeys(password);
    }

    public void clickButtonSubmit()
    {
        btnSubmit.click();

    }

    public WebElement getlblLogo()
    {
        return lblLogo;
    }

    public  WebElement getMesg()
    {
        return mesg;
    }
}
