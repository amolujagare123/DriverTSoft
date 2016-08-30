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
    @FindBy(id = "Email_Id")
    public WebElement txtUsername;

    @FindBy(id = "Password")
    public WebElement txtPassword;

    @FindBy(id = "btnSubmit1")
    public WebElement btnSubmit;

    @FindBy(xpath = "//b")
    public WebElement lblLogo;

    Login(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, true);
        if (!lblLogo.isDisplayed())
            throw new IllegalStateException("this is not login page");

    }

    public void setUsername(String username)
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
}
