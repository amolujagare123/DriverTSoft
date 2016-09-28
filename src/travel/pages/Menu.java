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
    WebElement Admin;

    @FindBy(linkText = "User Master")
    WebElement UserMaster;



    public Menu(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);

    }


    public void clickUserMaster()
    {
        Admin.click();
        UserMaster.click();
    }



}
