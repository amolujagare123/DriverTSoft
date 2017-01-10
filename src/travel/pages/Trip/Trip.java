package travel.pages.Trip;/*
package travel.pages.Trip;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

*/
/**
 * Created by Minal on 12/26/2016.
 *//*

public class Trip {
    WebDriver driver;
    */
/*home page*//*

    @FindBy(xpath = "html/body/div[1]/div/section[1]/h1")
    public WebElement Headpagetitlelbl;

    @FindBy(xpath = "./*/
/*[@id='Trip_filter']/label/input")
    WebElement searchtxt;

    @FindBy(xpath = "./*/
/*[@id='Trip_filter']/label")
    public WebElement searchlbl;

    @FindBy(xpath = "./*/
/*[@id='Trip']/thead/tr/th[1]")
    public WebElement tripnumberlbl;

    @FindBy(xpath = "./*/
/*[@id='Trip']/thead/tr/th[2]")
    public WebElement datelbl;

    @FindBy(xpath = "./*/
/*[@id='Trip']/thead/tr/th[4]")
    public WebElement cusaddresslbl;

    @FindBy(xpath = "./*/
/*[@id='Trip']/thead/tr/th[5]")
    public WebElement contactnolbl;

    @FindBy(xpath = "./*/
/*[@id='Trip']/thead/tr/th[6]")
    public WebElement citylbl;

    @FindBy(xpath = "./*/
/*[@id='Trip']/thead/tr/th[7]")
    public WebElement bookedbylbl;

    @FindBy(xpath = "./*/
/*[@id='Trip']/thead/tr/th[8]")
    public WebElement statuslbl;

    @FindBy(xpath = "html/body/div[1]/div/section[2]/div/div[2]/div/div[1]/a")
    public WebElement addnewbtn;

    */
/*invoice add trip*//*

    @FindBy(xpath = "html/body/div[1]/div/section[1]/h1")
    public WebElement addtriptitlelbl;

    @FindBy(xpath = "html/body/div[1]/div/section[2]/div/div/form/div[1]/div[2]/div/div[1]/label")
    public WebElement tripnumberLabel;

    @FindBy(xpath = "./*/
/*[@id='Item1_Trip_No']")
    public WebElement tripnumbertxt;

    @FindBy(xpath = "html/body/div[1]/div/section[2]/div/div/form/div[1]/div[2]/div/div[2]/label")
    public WebElement customername1Label;

       @FindBy(xpath ="./*/
/*[@id='ddl_CustNm1']" )
    public WebElement custname1txt;

    */
/*add customer link*//*

    @FindBy(xpath = "./*/
/*[@id='btnResp']")
    public WebElement plusbtn;

    @FindBy(xpath = "./*/
/*[@id='exampleModalLabel']")
    public WebElement addcustpagetitlelbl;

    @FindBy(xpath = "//div[@class='box-body']/div/div/label[@for='Cust_Nm']")
    public WebElement customernameLabel;

    @FindBy(xpath = "./*/
/*[@id='Cust_Nm']")
    public WebElement customernametxt;

    @FindBy(xpath = "//div[@class='box-body']/div/div/label[@for='Cust_Addr']")
    public WebElement addressLabel;

    @FindBy(xpath = "./*/
/*[@id='Cust_Addr']")
    public WebElement addresstxt;

    @FindBy(xpath = "//div[@class='box-body']/div/div/label[@for='Cont_No']")
    public WebElement contactnumber1Label;

    @FindBy(xpath=" [@id='ContNo1']")
    public WebElement contactnumber1txt;

    @FindBy(xpath = "//div[@class='box-body']/div/div/label[@for='Cont_Persn']")
    public WebElement contactperson1Label;

    @FindBy(xpath = "./*/
/*[@id='Cont_Persn']")
    public WebElement contactperson1txt;

    @FindBy(xpath = "//div[@class='box-body']/div/div/label[@for='Sec_Cont_No']")
    public WebElement contactnumber2Label;

    @FindBy(xpath = "./*/
/*[@id='ContNo2']")
    public WebElement contactnumber2txt;

    @FindBy(xpath = "//div[@class='box-body']/div/div/label[@for='Sec_Cont_Persn']")
    public WebElement contactperson2Label;

    @FindBy(xpath = "./*/
/*[@id='Sec_Cont_Persn']")
    public WebElement contactperson2txt;

    @FindBy(xpath = "//div[@class='box-body']/div/div/label[@for='Cust_Email']")
    public WebElement emailLabel;

    @FindBy(xpath = "./*/
/*[@id='Cust_Email']")
    public WebElement emailtxt;

    @FindBy(xpath = "//div[@class='box-body']/div/div/label[@for='StateId']")
    public WebElement stateLabel;

    @FindBy(xpath="./*/
/*[@id='ddlState']")
    public WebElement selectstate;

    @FindBy(xpath = "//div[@class='box-body']/div/div/label[@for='CityId']")
    public WebElement cityLabel;

    @FindBy(xpath = "./*/
/*[@id='ddlCity']")
    public WebElement selectcity;

    @FindBy(xpath = "//div[@class='box-body']/div/div/label[@for='Nationality']")
    public WebElement nationalityLabel;

    @FindBy(xpath = "./*/
/*[@id='Nationality']")
    public WebElement nationalitytxt;

    @FindBy(xpath = "//div[@class='box-body']/div/div/label[@for='Pincode']")
    public WebElement pincodeLabel;

    @FindBy(xpath = "./*/
/*[@id='Pin_Code']")
    public WebElement pincodetxt;

    @FindBy(xpath = "./*/
/*[@id='btnSubmit1']")
    public WebElement submitbtn;

    @FindBy(xpath = "./*/
/*[@id='msg1']")
    public WebElement getmsg;

    @FindBy(xpath = "./*/
/*[@id='cancel1']")
    public WebElement cancelbtn;

    @FindBy(xpath = "//div[@class='box-body']/div/div/label[@for='Item1_Psngr_Contno']")
    public WebElement passengermobileLabel;

    @FindBy(xpath = "./*/
/*[@id='ContNo_Wo91']")
    public WebElement passengermobiletxt;

    @FindBy(xpath = "//div[@class='box-body']/div/div/label[@for='Item1_Bk_By']")
    public WebElement bookedbyLabel;

    @FindBy(xpath="./*/
/*[@id='Item1_Bk_By']")
    public WebElement bookedbytxt;

    @FindBy(xpath = "//div[@class='box-body']/div/div/label[@for='Item1_Bkby_Conctno']")
    public WebElement bookedbycontactnumberLabel;


    @FindBy(xpath = "./*/
/*[@id='ContNo_Wo92']")
    public WebElement bookedbycontactnumbertxt;

    */
/*passenger details*//*


    @FindBy(xpath = "//div[@class='box-body']/div/table[@id='PsgTab']/thead/tr/th[1]")
    public WebElement firstnameLabel;

    @FindBy(xpath="./*/
/*[@id='PsgTab']/tbody/tr/td[1]/input")
    public WebElement firstnametxt;

    @FindBy(xpath = "//div[@class='box-body']/div/table[@id='PsgTab']/thead/tr/th[2]")
    public WebElement lastnameLabel;

    @FindBy(xpath="./*/
/*[@id='PsgTab']/tbody/tr/td[2]/input")
    public WebElement lastnametxt;

    @FindBy(xpath = "//div[@class='box-body']/div/table[@id='PsgTab']/thead/tr/th[3]")
    public WebElement ageLabel;

    @FindBy(xpath = "./*/
/*[@id='PsgTab']/tbody/tr/td[3]/input")
    public WebElement agetxt;

    @FindBy(xpath = "//div[@class='box-body']/div/table[@id='PsgTab']/thead/tr/th[4]")
    public WebElement genderLabel;

    @FindBy(xpath = "./*/
/*[@id='PsgTab']/tbody/tr/td[5]/select")
    public WebElement genderselect;

    @FindBy(xpath = "//div[@class='box-body']/div/table[@id='PsgTab']/thead/tr/th[5]")
    public WebElement specialrequestLabel;

    @FindBy(xpath = "./*/
/*[@id='PsgTab']/tbody/tr/td[6]/input")
    public WebElement specialrequesttxt;

    @FindBy(xpath = "./*/
/*[@id='btnPsgAdd']")
    public WebElement addbtn;

    @FindBy(xpath = "./*/
/*[@id='btnSubmit']")
    public WebElement savebtn;

    */
/*bus services*//*

    @FindBy(xpath = "//div[@class='box-body']/div[@class='row']/div[@class='col-sm-1']/input[@id='chkAll']")
    public WebElement selectallselect;

    @FindBy(xpath = "//div[@class='box-body']/div[@class='row']/div[@class='col-sm-1']/input[@id='chkBus']")
    public WebElement busselect;

    @FindBy(xpath = "//div[@id='addBus']/div[@class='box-header with-border alert alert-info alert-dismissable']/h4/a")
    public WebElement busbtn;

    @FindBy(xpath = "//table[@id='bustab']/thead/tr/th[1]")
    public WebElement operatornameLabel;

    @FindBy(xpath = "//table[@id='bustab']/tbody/tr/td[1]/input[@class='form-control textDecor abc']")
    public WebElement operatornametxt;

    @FindBy(xpath = "//table[@id='bustab']/thead/tr/th[2]")
    public WebElement bustypeLabel;

    @FindBy(xpath = "//select[@id='BusType0']")
    public WebElement bustypeselect;

   @FindBy(xpath = "//table[@id='bustab']/thead/tr/th[3]")
    public WebElement origin1Label;

    @FindBy(xpath = "//table[@id='bustab']/tbody/tr/td[3]/input[@class='form-control textDecor abc']")
    public WebElement origin1txt;

    @FindBy(xpath = "//table[@id='bustab']/thead/tr/th[4]")
    public WebElement destination1Label;

    @FindBy(xpath = "//table[@id='bustab']/tbody/tr/td[4]/input[@class='form-control textDecor abc']")
    public WebElement destination1txt;

    @FindBy(xpath = "//table[@id='bustab']/thead/tr/th[5]")
    public WebElement journeydate1Label;

    @FindBy(xpath = "//div[@id='datetimepickerBus_0']/span[@class='input-group-addon']")
    public WebElement journeydate1txt;

    @FindBy(xpath = "//table[@id='bustab']/thead/tr/th[6]")
    public WebElement supplier1Label;

    @FindBy(xpath = "//table[@id='bustab']/tbody/tr/td[6]/input[@class='form-control textDecor abc']")
    public WebElement supplierselect;

    @FindBy(xpath = "//div[@id='divBus']/form/div/div/div[2]/input[@id='btnAddBus']")
    public WebElement addbusbtn;

    @FindBy(xpath = "//div[@id='divBus']/form/div/div/div[2]/input[@id='btnRemoveBus']")
    public WebElement removebusbtn;

    @FindBy(xpath = "//div[@id='divBus']/form/div/div/div[2]/button")
    public WebElement submitbusbtn;

    @FindBy(xpath = "//div[@id='divBus']/form/div/div/div[2]/a")
    public WebElement cancelbusbtn;

    */
/*airline*//*

    @FindBy(xpath = "//div[@id='addAirline']/div[1]/h4/a")
    public WebElement airlinebtn;

    @FindBy(xpath = "//table[@id='busAir']/thead/tr/th[1]")
    public WebElement airlinenameLabel;

    @FindBy(xpath = "//table[@id='busAir']/tbody/tr/td/input[@id='AC_Airline_0']")
    public WebElement airlinenametxt;

    @FindBy(xpath = "//table[@id='busAir']/thead/tr/th[2]")
    public WebElement flightnumberLabel;

    @FindBy(xpath = "./*/
/*[@id='busAir']/tbody/tr/td[2]/div/input")
    public WebElement flightnumbertxt;

    @FindBy(xpath = "//table[@id='busAir']/thead/tr/th[3]")
    public WebElement fareclass1Label;

    @FindBy(xpath = "./*/
/*[@id='busAir']/tbody/tr/td[3]/select")
    public WebElement fareclass1txt;

    @FindBy(xpath = "//table[@id='busAir']/thead/tr/th[4]")
    public WebElement origin2Label;

    @FindBy(xpath = "//table[@id='busAir']/tbody/tr/td/input[@id='AC_AFm_0']")
    public WebElement origin2txt;

    @FindBy(xpath = "//table[@id='busAir']/thead/tr/th[4]")
    public WebElement destination2Label;

    @FindBy(xpath = "//table[@id='busAir']/tbody/tr/td/input[@id='AC_ATo_0']")
    public WebElement destination2txt;

    @FindBy(xpath = "//table[@id='busAir']/thead/tr/th[5]")
    public WebElement flexibilitydaysLabel;

    @FindBy(xpath = "./*/
/*[@id='busAir']/tbody/tr/td[6]/input")
    public WebElement flexibilitydaystxt;

    @FindBy(xpath="//table[@id='busAir']/thead/tr/th[5]")
    public WebElement journeydate2Label;

    @FindBy(xpath = "//div[@id='datetimepickerAir_0']/span[@class='input-group-addon']")
    public WebElement journeydate2txt;

    @FindBy(xpath = "//table[@id='busAir']/thead/tr/th[6]")
    public WebElement supplier2Label;

    @FindBy(xpath = "./*/
/*[@id='airlineSup0']")
    public WebElement supplier2txt;

    @FindBy(xpath="//div[@id='divCar']/form/div/div/div[2]/input[@id='btnAdd']")
    public WebElement addairlinebtn;

    @FindBy(xpath="//div[@id='divCar']/form/div/div/div[2]/input[@id='btnRemove']")
    public WebElement removeairlinebtn;

    @FindBy(xpath = "//div[@id='divCar']/form/div/div/div[2]/button")
    public WebElement saveairlinebtn;

    @FindBy(xpath="//div[@id='divCar']/form/div/div/div[2]/a")
    public WebElement cancelairlinebtn;

    */
/*car service*//*

    @FindBy(xpath = "//div[@id='addCar']/div[1]/h4/a")
    public  WebElement carservicebtn;

    @FindBy(xpath = "//table[@id='Cartab']/thead/tr/th[1]")
    public  WebElement dutydiscriptionLabel;

    @FindBy(xpath = "//table[@id='Cartab']/tbody/tr/td[1]/input[@class='form-control textDecor abc']")
    public WebElement dutydiscriptiontxt;

    @FindBy(xpath = "//table[@id='Cartab']/thead/tr/th[2]")
    public  WebElement carnameLabel;

    @FindBy(xpath = "//table[@id='Cartab']/tbody/tr/td/select[@id='CarId0']")
    public WebElement carnametxt;

    @FindBy(xpath = "//table[@id='Cartab']/thead/tr/th[3]")
    public  WebElement cartypeLabel;

    @FindBy(xpath = "./*/
/*[@id='CarType0']")
    public WebElement cartypetxt;

    @FindBy(xpath = "//table[@id='Cartab']/thead/tr/th[4]")
    public  WebElement pickuppointLabel;

    @FindBy(xpath = "//table[@id='Cartab']/tbody/tr/td[1]/input[@class='form-control textDecor abc']")
    public WebElement pickuppointtxt;

    @FindBy(xpath = "//table[@id='Cartab']/thead/tr/th[5]")
    public  WebElement fromdateLabel;

    @FindBy(xpath = "//div[@id='datetimepickerCar_0']/span[@class='input-group-addon']")
    public WebElement fromdatetct;

    @FindBy(xpath = "//table[@id='Cartab']/thead/tr/th[6]")
    public  WebElement todateLabel;

    @FindBy(xpath = "//div[@id='datetimepickerCar1_0']/span[1]/span")
    public WebElement todatetxt;

    @FindBy(xpath = "//table[@id='Cartab']/thead/tr/th[7]")
    public  WebElement suppliernameLabel;

    @FindBy(xpath = "./*/
/*[@id='CarSup0']")
    public WebElement suppliernametxt;

    @FindBy(xpath = "//div[@id='divCar']/form/div/div/div[2]/input[@id='btnAddCar']")
    public WebElement addcarbtn;

    @FindBy(xpath = "//div[@id='divCar']/form/div/div/div[2]/input[@id='btnRemoveCar']")
    public WebElement removecarbtn;

    @FindBy(xpath = "//div[@id='divCar']/form/div/div/div[2]/button")
    public WebElement submitcarbtn;

    @FindBy(xpath = "//div[@id='divCar']/form/div/div/div[2]/a")
    public WebElement cancelcarbtn;

*/
/*hotelservice*//*


    @FindBy(xpath = "//div[@id='addHotel']/div[1]/h4/a")
    public WebElement hotelbtn;

    @FindBy(xpath = "//table[@id='Hoteltab']/thead/tr/th[1]")
    public  WebElement hotelnameLabel;

    @FindBy(xpath = "//table[@id='Hoteltab']/tbody/tr/td[1]/input")
    public WebElement hotelnametxt;

    @FindBy(xpath = "//table[@id='Hoteltab']/thead/tr/th[2]")
    public  WebElement hotellocationLabel;

    @FindBy(xpath = "//table[@id='Hoteltab']/tbody/tr/td[2]/input")
    public WebElement hotellocationtxt;

    @FindBy(xpath = "//table[@id='Hoteltab']/thead/tr/th[3]")
    public  WebElement roomtypeLabel;

    @FindBy(xpath = "//table[@id='Hoteltab']/tbody/tr/td/select[@id='HotelType0']")
    public WebElement roomtypetxt;

    @FindBy(xpath = "//table[@id='Hoteltab']/thead/tr/th[4]")
    public  WebElement checkinLabel;

    @FindBy(xpath = "//div[@id='datetimepicker2']/span[2]/span")
    public WebElement checkintxt;

    @FindBy(xpath = "//table[@id='Hoteltab']/thead/tr/th[5]")
    public  WebElement checkoutLabel;

    @FindBy(xpath = "//div[@id='datetimepickerCarHotel_0']/span[2]")
    public WebElement checkouttxt;

    @FindBy(xpath = "//table[@id='Hoteltab']/thead/tr/th[6]")
    public  WebElement suppliername2Label;

    @FindBy(xpath = "./*/
/*[@id='HotelSup0']")
    public WebElement suppliername2txt;

    @FindBy(xpath = "//div[@id='divHotel']/form/div/div/div[2]/input[@id='btnAddHotel']")
    public WebElement addhotelbtn;

    @FindBy(xpath = "//div[@id='divHotel']/form/div/div/div[2]/input[@id='btnRemoveHotel']")
    public  WebElement removehotelbtn;

    @FindBy(xpath = "//div[@id='divHotel']/form/div/div/div[2]/button")
    public WebElement submithotelbtn;

    @FindBy(xpath = "//div[@id='divHotel']/form/div/div/div[2]/a")
    public WebElement cancelhotelbtn;

    */
/*insurance*//*

    @FindBy(xpath = "//div[@id='addInsur']/div[1]/h4/a")
    public WebElement insurancebtn;

    @FindBy(xpath = "//table[@id='Insurtab']/thead/tr/th[1]")
    public WebElement submissiondate1Label;

    @FindBy(xpath = "//div[@id='datetimepickerBus_0']/span[2]/span")
    public WebElement submissiondate1txt;

    @FindBy(xpath = "//table[@id='Insurtab']/thead/tr/th[2]")
    public WebElement insuredbyLabel;

    @FindBy(xpath = "//table[@id='Insurtab']/tbody/tr/td[2]/input")
    public WebElement insuredbytxt;

    @FindBy(xpath = "//table[@id='Insurtab']/thead/tr/th[3]")
    public WebElement insurancetypeLabel;

    @FindBy(xpath = "./*/
/*[@id='InsurType0']")
    public WebElement insurancetypetxt;

    @FindBy(xpath = "")//table[@id='Insurtab']/thead/tr/th[4]
    public WebElement suppliername3Label;

    @FindBy(xpath = "./*/
/*[@id='SuppId0']")
    public WebElement supplier3txt;

    @FindBy(xpath = "//div[@id='divInsur']/form/div/div/div[2]/button")
    public WebElement submitinsurancebtn;

    @FindBy(xpath = "//div[@id='divInsur']/form/div/div/div[2]/a")
    public WebElement cancelinsurancebtn;

    */
/*miscellaneous service*//*

    @FindBy(xpath = "//div[@id='addMisc']/div[1]/h4/a")
    public WebElement miscellaneousbtn;

    @FindBy(xpath = "//div[@id='addMisccollapseTwo']/div[1]/div/table/thead/tr/th[1]")
    public WebElement servicedetailsLabel;

    @FindBy(xpath = "//div[@id='addMisccollapseTwo']/div[1]/div[1]/table/tbody/tr/td[1]/input")
    public WebElement servicedetailstxt;

    @FindBy(xpath = "//div[@id='addMisccollapseTwo']/div[1]/div/table/thead/tr/th[2]")
    public WebElement suppliername4Label;

    @FindBy(xpath = "//select[@id='MiscSup0']")
    public WebElement suppliername4txt;

    @FindBy(xpath = "//div[@id='divMisc']/form/div/div/div[2]/button")
    public WebElement savemiscbtn;

    @FindBy(xpath = "//div[@id='divMisc']/form/div/div/div[2]/a")
    public WebElement cancelmiscbtn;

    */
/*passport service*//*

    @FindBy(xpath = "//div[@id='addPassport']/div[1]/h4/a']")
    public WebElement passportbtn;

    @FindBy(xpath = "//table[@id='PPtab']/thead/tr/th[1]")
    public WebElement appointmentdateLabel;

    @FindBy(xpath = "//div[@id='datetimepickerBus_0']/span[1]/span")
    public WebElement appointmentdatetxt;

    @FindBy(xpath = "//table[@id='PPtab']/thead/tr/th[2]")
    public WebElement suppliername5Label;

    @FindBy(xpath = "//select[@id='PP_Sup0']")
    public WebElement suppliername5txt;

    @FindBy(xpath = "//table[@id='PPtab']/thead/tr/th[3]")
    public WebElement documentreceivedLabel;

    @FindBy(xpath = "//table[@id='PPtab']/tbody/tr/td/input")
    public WebElement documentreceivedtxt;

    @FindBy(xpath = "//div[@id='divPassport']/form/div/div/div[2]/button")
    public WebElement savepassbtn;

    @FindBy(xpath = "//div[@id='divPassport']/form/div/div/div[2]/a")
    public WebElement cancelpassbtn;

    */
/*railway service*//*

    @FindBy(xpath = "//div[@id='addRlwy']/div[1]/h4/a")
    public WebElement railwaybtn;

    @FindBy(xpath = "//div[@class='box-body']/div/table/thead/tr/th[1]")
    public WebElement trainnoLabel;

    @FindBy(xpath = "//div[@class='box-body']/div/table/tbody/tr/td[1]/input")
    public WebElement trainnotxt;

    @FindBy(xpath = "//div[@class='box-body']/div/table/thead/tr/th[2]")
    public WebElement fareclassLabel;

    @FindBy(xpath = "//div[@class='box-body']/div/table[@id='Rlwytab']/tbody/tr/td[2]/select")
    public WebElement fareclasstxt;

    @FindBy(xpath = "//div[@class='box-body']/div/table/thead/tr/th[3]")
    public WebElement fromLabel;

    @FindBy(xpath = "//div[@class='box-body']/div/table/tbody/tr/td[3]/input")
    public WebElement fromtxt;

    @FindBy(xpath = "//div[@class='box-body']/div/table/thead/tr/th[4]")
    public WebElement toLabel;

    @FindBy(xpath = "//div[@class='box-body']/div/table/tbody/tr/td[4]/input")
    public WebElement totxt;

    @FindBy(xpath = "//div[@class='box-body']/div/table/thead/tr/th[5]")
    public WebElement sectorLabel;

    @FindBy(xpath = "//div[@class='box-body']/div/table/tbody/tr/td[5]/input")
    public WebElement sectortxt;

    @FindBy(xpath = "//div[@class='box-body']/div/table/thead/tr/th[6]")
    public WebElement journeydateLabel;

    @FindBy(xpath = "//div[@id='datetimepickerAir_0']/span[2]")
    public WebElement journeydatetxt;

    @FindBy(xpath = "//div[@class='box-body']/div/table/thead/tr/th[7]")
    public WebElement suppliername6Lable;

    @FindBy(xpath = "//div[@class='box-body']/div/table[@id='Rlwytab']/tbody/tr/td[7]/select")
    public WebElement suppliername6tct;

    @FindBy(xpath = "//div[@id='divRlway']/form/div/div/div[2]/input[@id='btnAddRlwy']")
    public WebElement addrlwaybtn;

    @FindBy(xpath = "//div[@id='divRlway']/form/div/div/div[2]/input[@id='btnRemoveRlwy']")
    public WebElement removerlwaybtn;

    @FindBy(xpath = "//div[@id='divRlway']/form/div/div/div[2]/button")
    public WebElement saverlwaybtn;

    @FindBy(xpath = "//div[@id='divRlway']/form/div/div/div[2]/a")
    public WebElement cancelrlwaybtn;

    */
/*visa service*//*

    @FindBy(xpath = "//div[@id='addVisa']/div[1]/h4/a")
    public WebElement visabtn;

    @FindBy(xpath = "//div[@class='box-body']/div/table[@id='Visatab']/thead/tr/th[5]")
    public WebElement visatypeLabel;

    @FindBy(xpath = "//div[@class='box-body']/div/table[@id='Visatab']/tbody/tr/td[1]/select")
    public WebElement visatypetxt;

    @FindBy(xpath = "//div[@class='box-body']/div/table[@id='Visatab']/thead/tr/th[5]")
    public WebElement documentreceived1Label;

    @FindBy(xpath = "//div[@class='box-body']/div/table[@id='Visatab']/tbody/tr/td[2]/input")
    public WebElement documentreceived1txt;

    @FindBy(xpath = "//div[@class='box-body']/div/table[@id='Visatab']/thead/tr/th[5]")
    public WebElement submissiondateLabel;

    @FindBy(xpath = "//div[@class='box-body']/div/table[@id='Visatab']/tbody/tr/td[3]/div[@id='txtdate']/span[2]/span")
    public WebElement submissiondatetxt;

    @FindBy(xpath = "//div[@class='box-body']/div/table[@id='Visatab']/thead/tr/th[5]")
    public WebElement countrynameLabel;

    @FindBy(xpath = "//div[@class='box-body']/div/table[@id='Visatab']/tbody/tr/td[4]/input")
    public WebElement countrynametxt;

    @FindBy(xpath = "//div[@class='box-body']/div/table[@id='Visatab']/thead/tr/th[5]")
    public WebElement suppliername7Label;

    @FindBy(xpath = "//div[@class='box-body']/div/table[@id='Visatab']/tbody/tr/td[5]/select")
    public WebElement suppliername7txt;

    @FindBy(xpath = "//div[@id='divVisa']/form/div/div/div[2]/button")
    public WebElement savevisabtn;

    @FindBy(xpath = "//div[@id='divVisa']/form/div/div/div[2]/a")
    public WebElement cancelvisabtn;

    public Trip(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,true);
        if(!addtriptitle.isDisplayed())
            throw new IllegalStateException("this is not Add user page");
    }
    public void setHeadpagetitlelbl(String headpagetitle)
    {
        Headpagetitlelbl.sendKeys(headpagetitle);
    }
    public void setSearchtxt(String search)
    {
        searchtxt.sendKeys(search);
    }
    public void setSearchlbl(String search)
    {
        searchlbl.sendKeys(search);
    }
    public void setTripnumberlbl(String tripnumber)
    {
        tripnumberlbl.sendKeys(tripnumber);
    }
    public void setDatelbl(String date)
    {
        datelbl.sendKeys(date);
    }
    public void setCusaddresslbl(String cusaddress)
    {
        cusaddresslbl.sendKeys(cusaddress);
    }
    public void setContactnolbl(String contactno)
    {
        contactnolbl.sendKeys(contactno);
    }
    public  void setCitylbl(String city)
    {
        citylbl.sendKeys(city);
    }
    public void setBookedbylbl(String bookedby)
    {
        bookedbylbl.sendKeys(bookedby);
    }
    public void setStatuslbl(String status)
    {
        searchlbl.sendKeys(statuslbl);
    }
    public void setAddnewbtn()
    {
        addnewbtn.click();
    }
    public void setAddtriptitlelbl(String addtriptitle)
    {
        addtriptitlelbl.sendKeys(addtriptitle);
    }
    public void setTripnumberLabel(String tripnumber)
    {
        tripnumberlbl.sendKeys(tripnumber);
    }
    public void setTripnumbertxt(String tripnumber)
    {
        tripnumbertxt.sendKeys(tripnumber);
    }
    public void setCustomername1Label(String customername1)
    {
        customername1Label.sendKeys(customername1);
    }
    public void setPlusbtn()
    {
        plusbtn.click();
    }
    public void setAddcustpagetitlelbl(String addcustpagetitle)
    {
        addcustpagetitlelbl.sendKeys(addcustpagetitle);
    }
    public void setCustomernameLabel(String customername)
    {
        customernameLabel.sendKeys(customername);
    }
    public void setCustomernametxt(String customername)
    {
        customernametxt.sendKeys(customername);
    }
    public void setAddressLabel(String address)
    {
        addressLabel.sendKeys(address);
    }
    public void setAddresstxt(String address)
    {
        addresstxt.sendKeys(address);
    }
    public void setContactnumber1Label(String contactnumber1)
    {
        contactnumber1Label.sendKeys(contactnumber1);
    }
    public void setContactnumber1txt(String contactnumber1)
    {
        contactnumber1txt.sendKeys(contactnumber1);
    }
    public void setContactperson1Label(String contactperson1)
    {
        contactperson1Label.sendKeys(contactperson1);
    }
    public void setContactperson1txt(String contactperson1)
    {
        contactperson1txt.sendKeys(contactperson1);
    }
    public void setContactnumber2Label(String contactnumber2)
    {
        contactnumber2Label.sendKeys(contactnumber2);
    }
    public void setContactnumber2txt(String contactnumber2)
    {
        contactnumber2txt.sendKeys(contactnumber2);
    }
    public void setContactperson2Label(String contactperson2)
    {
        contactperson2Label.sendKeys(contactperson2);
    }
    public void setContactperson2txt(String contactperson2)
    {
        contactperson2txt.sendKeys(contactperson2);
    }
    public void setEmailLabel(String email)
    {
        emailLabel.sendKeys(email);
    }
    public void setEmailtxt(String email)
    {
        emailtxt.sendKeys(email);
    }
    public void setStateLabel(String state)
    {
        stateLabel.sendKeys(state);
    }
    public void setSelectstate(String state)
    {
        selectstate.sendKeys(state);
    }
    public void setCityLabel(String city)
    {
        citylbl.sendKeys(city);
    }
    public void setNationalityLabel(String  nationality)
    {
        nationalityLabel.sendKeys(nationality);
    }
    public void setNationalitytxt(String nationality)
    {
        nationalitytxt.sendKeys(nationality);
    }
    public void setPincodeLabel(String pincode)
    {
        pincodeLabel.sendKeys(pincode);
    }
    public void setPincodetxt(String pincode)
    {
        pincodetxt.sendKeys(pincode);
    }
    public void setSubmitbtn()
    {
        submitbtn.click();
    }
    public void setGetmsg()
    {
        //return getmsg;
    }
    public void setCancelbtn()
    {
        cancelbtn.click();
    }
    public void setPassengermobileLabel(String passengermobile)
    {
        passengermobileLabel.sendKeys(passengermobile);
    }
    public void setPassengermobiletxt(String passengermobile)
    {
        passengermobiletxt.sendKeys(passengermobile);
    }
    public void setBookedbyLabel(String bookedby)
    {
        bookedbylbl.sendKeys(bookedby);
    }
    public void setBookedbytxt(String bookedby)
    {
        bookedbytxt.sendKeys(bookedby);
    }
    public void setBookedbycontactnumberLabel(String bookedbycontactnumber)
    {
        bookedbycontactnumberLabel.sendKeys(bookedbycontactnumber);
    }
    public void setBookedbycontactnumbertxt(String bookedbycontactnumber)
    {
        bookedbycontactnumbertxt.sendKeys(bookedbycontactnumber);
    }
    public void setSelectallselect(String selectall)
    {
        selectallselect.sendKeys(selectall);
    }
    public void setFirstnameLabel(String firstname)
    {
        firstnameLabel.sendKeys(firstname);
    }
    public void setFirstnametxt(String firstname)
    {
        firstnametxt.sendKeys(firstname);
    }
    public void setLastnameLabel(String lastname)
    {
        lastnameLabel.sendKeys(lastname);
    }
    public void setLastnametxt(String lastname)
    {
        lastnametxt.sendKeys(lastname);
    }
    public void setAgeLabel(String age)
    {
        ageLabel.sendKeys(age);
    }
    public void setAgetxt(String age)
    {
        agetxt.sendKeys(age);
    }
    public void setGenderLabel(String gender)
    {
        genderLabel.sendKeys(gender);
    }
    public void setGenderselect(String gender)
    {
        genderselect.sendKeys(gender);
    }
    public void setSpecialrequestLabel(String specialrequest)
    {
        specialrequestLabel.sendKeys(specialrequest);
    }
    public void setSpecialrequesttxt(String specialrequest)
    {
        specialrequesttxt.sendKeys(specialrequest);
    }
    public void setAddbtn()
    {
        addbtn.click();
    }
    public void setSavebtn()
    {
        savebtn.click();
    }
    public void setBusbtn()
    {
        busbtn.click();
    }
    public void setOperatornameLabel(String operatorname)
    {
        operatornameLabel.sendKeys(operatorname);
    }
    public void setOperatornametxt(String operatorname)
    {
        operatornametxt.sendKeys(operatorname);
    }
    public void setBustypeLabel(String bustype)
    {
        bustypeLabel.sendKeys(bustype);
    }
    public void setBustypeselect(String bustype)
    {
        bustypeselect.sendKeys(bustype);
    }
    public void setOrigin1Label(String origin1)
    {
        origin1Label.sendKeys(origin1);
    }
    public void setOrigin1txt(String origin1)
    {
        origin1txt.sendKeys(origin1);
    }
    public void setDestination1Label(String destination1)
    {
        destination1Label.sendKeys(destination1);
    }
    public void setDestination1txt(String destination1)
    {
        destination1txt.sendKeys(destination1);
    }
    public void setJourneydate1Label(String journeydate1)
    {
        journeydate1Label.sendKeys(journeydate1);
    }
    public void setJourneydate1txt(String journeydate1)
    {
        journeydate1txt.sendKeys(journeydate1);
    }
    public void  setSupplier1Label(String supplier1)
    {
        supplier1Label.sendKeys(supplier1);
    }
    public void setSupplierselect(String supplier)
    {
        supplierselect.sendKeys(supplier);
    }
    public void setAddbusbtn()
    {
        addbusbtn.click();
    }
    public void setRemovebusbtn()
    {
        removebusbtn.click();
    }
    public void setCancelbusbtn()
    {
        cancelbusbtn.click();
    }
    public void setAirlinebtn()
    {
        airlinebtn.click();
    }
    public void setAirlinenameLabel(String airlinename)
    {
        airlinenameLabel.sendKeys(airlinename);
    }
    public void setAirlinenametxt(String airlinename)
    {
        airlinenametxt.sendKeys(airlinename);
    }
    public void setFlightnumberLabel(String flightnumber)
    {
        flightnumberLabel.sendKeys(flightnumber);
    }
    public void setFlightnumbertxt(String flightnumber)
    {
        flightnumbertxt.sendKeys(flightnumber);
    }
    public void setFareclass1Label(String fareclass1)
    {
        fareclass1Label.sendKeys(fareclass1);
    }
    public void setFareclass1txt(String fareclass1)
    {
        fareclass1txt.sendKeys(fareclass1);
    }
    public void setOrigin2Label(String origin2)
    {
        origin2Label.sendKeys(origin2);
    }
    public void setOrigin2txt(String origin2)
    {
        origin2txt.sendKeys(origin2);
    }
    public void setDestination2Label(String destination2)
    {
        destination2Label.sendKeys(destination2);
    }
    public void setDestination2txt(String destination2)
    {
        destination2txt.sendKeys(destination2);
    }
    public void setFlexibilitydaysLabel(String flexibilitydays)
    {
        flexibilitydaysLabel.sendKeys(flexibilitydays);
    }
    public void setFlexibilitydaystxt(String flexibilitydays)
    {
        flexibilitydaystxt.sendKeys(flexibilitydays);
    }
    public void setJourneydate2Label(String journeydate2)
    {
        journeydate2Label.sendKeys(journeydate2);
    }
    public void setJourneydate2txt(String journeydate2)
    {
        journeydate2txt.sendKeys(journeydate2);
    }
    public void setSupplier2Label(String supplier2)
    {
        supplier2Label.sendKeys(supplier2);
    }
    public void setSupplier2txt(String supplier2)
    {
        supplier2txt.sendKeys(supplier2);
    }
    public void setAddairlinebtn()
    {
        addairlinebtn.click();
    }
    public void setRemoveairlinebtn()
    {
        removeairlinebtn.click();
    }
    public void setSaveairlinebtn()
    {
        saveairlinebtn.click();
    }
    public void setCancelairlinebtn()
    {
        cancelairlinebtn.click();
    }
    public void setCarservicebtn()
    {
        carservicebtn.click();
    }
    public void setDutydiscriptionLabel(String dutydiscription)
    {
        dutydiscriptionLabel.sendKeys(dutydiscription);
    }
    public void setDutydiscriptiontxt(String dutydiscription)
    {
        dutydiscriptiontxt.sendKeys(dutydiscription);
    }
    public void setCarnameLabel(String carname )
    {
        carnameLabel.sendKeys(carname);
    }


}
*/
