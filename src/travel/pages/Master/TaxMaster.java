package travel.pages.Master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by TCT on 9/3/2016.
 */
public class TaxMaster {
    @FindBy(xpath = "//h1")
    public WebElement Hedpagetitle;

    @FindBy(linkText = "Add Tax")
    public WebElement Addtax;

    @FindBy(id="ddlSTax")
    public WebElement selecttaxname;

    @FindBy(id="ddlSTaxRate")
    public WebElement selecttaxratetype;

    @FindBy(id = "txtTaxRate")
    public WebElement txttaxrate;

    @FindBy(id = "btnSubmit")
    public WebElement btnSave;

    @FindBy(id = "confirm")
    public WebElement ClickYes;


    public TaxMaster(WebDriver driver)
    {
        PageFactory.initElements(driver, true);
        if (!Hedpagetitle.isDisplayed())
            throw new IllegalStateException("this is not taxmaster page");
    }

    public void setpagetitle(String pagetitle)
    {
        Hedpagetitle.sendKeys(pagetitle);

    }

    public void clickAddtax()
    {
        Addtax.click();
    }

    public void settxttaxname(String taxname)
    {
        Select combo = new Select(selecttaxname);
        combo.selectByVisibleText(taxname);
    }

    public void settxttaxratetype(String taxratetype)
    {
        Select combo = new Select(selecttaxratetype);
        combo.selectByVisibleText(taxratetype);
    }

    public void settaxttaxrate(String taxrate)
    {
        txttaxrate.sendKeys(taxrate);

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
