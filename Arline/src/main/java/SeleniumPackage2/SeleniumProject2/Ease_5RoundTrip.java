package SeleniumPackage2.SeleniumProject2;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ease_5RoundTrip 
{
WebDriver driver;
@FindBy(xpath="//li[@id='rtrip']")//(id="rtrip")
WebElement RoundTrip;
@FindBy(xpath="//div[@id='frmcity']")
WebElement From1;
@FindBy(xpath="//div[@id='fromautoFill']/ul/li")
List<WebElement> FromCity1;
@FindBy(xpath="(//input[@class='autoFlll cityinput'])[2]")
WebElement To1;
@FindBy(xpath="//div[@id='toautoFill']/ul/li")
List<WebElement> ToCity1;
@FindBy(xpath="//input[@id='ddate']")
WebElement Departure;
@FindBy(id="img2Nex")
WebElement NextButton;
@FindBy(xpath="//div[@class='days']/ul/li")
List<WebElement> DateDeparture;
@FindBy(xpath="//input[@id='rdate']")
WebElement Return;
@FindBy(id="img2Nex")
WebElement NextButton1;
@FindBy(xpath="//div[@class='days']/ul/li")
List<WebElement> DateReturn;
@FindBy(xpath="//span[@id='spnTraveller']")
WebElement Travellers;
@FindBy(xpath="(//button[@id='add'])[1]")
WebElement AddPassenger;
@FindBy(xpath="//div[@id='divSearchFlight']")
WebElement SearchButton1;

@FindBy(xpath="((//ul[@class='bor-d61'])[2]/li)[3]")
WebElement depdate1;
@FindBy(xpath="((//ul[@class='bor-d61'])[2]/li)[6]")
WebElement returndate1;
public void depdateclick() {
	depdate1.click();;
}
public void returndateclick() {
	returndate1.click();
}
public void FormCitySelect()
{
	RoundTrip.click();;
	From1.click();
	int count=FromCity1.size();
	FromCity1.get(count-9).click();
}
public void ToCitySelect()
{
	//To1.click();
	int count=ToCity1.size();
	ToCity1.get(count-2).click();
}
public void DepartureDate()
{
	//Departure.click();
	NextButton.click();
	int count=DateDeparture.size();
	DateDeparture.get(count-4).click();
}
public void Returndate()
{
	//Return.click();
	NextButton1.click();
	int count=DateReturn.size();
	DateReturn.get(count-4).click();
}
public void Passengers()
{
	Travellers.click();
	AddPassenger.click();
}
public void Search()
{
	SearchButton1.click();
}
public Ease_5RoundTrip(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
}
