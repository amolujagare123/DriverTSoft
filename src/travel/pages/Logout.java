package travel.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Tcraft on 29/09/2016.
 */
public class Logout {
WebDriver driver;
    @FindBy(xpath = "//div[1]//ul/li/a/img")
    public WebElement LogoImg;

    @FindBy(linkText = "Sign out")
    public WebElement LogOutBTN;


    public Logout(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void clicklogoimg()
    {
        LogoImg.click();
    }

    public void clickLogbtn()
    {
        LogOutBTN.click();
    }

}
