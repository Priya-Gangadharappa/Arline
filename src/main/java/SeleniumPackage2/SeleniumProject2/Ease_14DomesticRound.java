package SeleniumPackage2.SeleniumProject2;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ease_14DomesticRound 
{
WebDriver driver;
@FindBy(xpath="//li[@id='rtrip']")//(id="rtrip")
WebElement RoundTripD;
@FindBy(xpath="//div[@id='frmcity']")
WebElement From1D;
@FindBy(xpath="//div[@id='fromautoFill']/ul/li")
List<WebElement> FromCity1D;
@FindBy(xpath="(//input[@class='autoFlll cityinput'])[2]")
WebElement To1D;
@FindBy(xpath="//div[@id='toautoFill']/ul/li")
List<WebElement> ToCity1D;
@FindBy(xpath="//input[@id='ddate']")
WebElement DepartureD;
@FindBy(id="img2Nex")
WebElement NextButtonD;
@FindBy(xpath="//div[@class='days']/ul/li")
List<WebElement> DateDepartureD;
@FindBy(xpath="//input[@id='rdate']")
WebElement ReturnD;
@FindBy(id="img2Nex")
WebElement NextButton1D;
@FindBy(xpath="//div[@class='days']/ul/li")
List<WebElement> DateReturnD;
@FindBy(xpath="//span[@id='spnTraveller']")
WebElement TravellersD;
@FindBy(xpath="(//button[@id='add'])[1]")
WebElement AddPassengerD;
@FindBy(xpath="//div[@id='divSearchFlight']")
WebElement SearchButton1D;
public void FormCitySelectDomestic()
{
	RoundTripD.click();;
	From1D.click();
	int count=FromCity1D.size();
	FromCity1D.get(count-10).click();
}
public void ToCitySelectDomestic()
{
	//To1D.click();
	int count=ToCity1D.size();
	ToCity1D.get(count-9).click();
}
public void DepartureDateDomestic()
{
	//DepartureD.click();
	NextButtonD.click();
	int count=DateDepartureD.size();
	DateDepartureD.get(count-4).click();
}
public void ReturndateDomestic()
{
	//ReturnD.click();
	NextButton1D.click();
	int count=DateReturnD.size();
	DateReturnD.get(count-4).click();
}
public void PassengersDomestic()
{
	TravellersD.click();
	AddPassengerD.click();
}
public void SearchDomestic()
{
	SearchButton1D.click();
}
public Ease_14DomesticRound(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
}

