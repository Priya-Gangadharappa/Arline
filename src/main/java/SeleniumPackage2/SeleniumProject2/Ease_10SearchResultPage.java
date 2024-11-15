package SeleniumPackage2.SeleniumProject2;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ease_10SearchResultPage 
{
WebDriver driver;
@FindBy(xpath="(//div[@class='li-fld'])[1]/span")
WebElement FlightDetail;
//@FindBy(xpath="//div[@id='divFlightDetailSec0']/ul/li")
//List<WebElement> FlightInfo;
@FindBy(xpath="//div[@id='divFlightDetailSec0']/ul/li")
List<WebElement> Deatils;
@FindBy(xpath="//div[@id='divFlightDetailSec0']/ul/li")
List<WebElement> Baggage;
@FindBy(xpath="//div[@id='divFlightDetailSec0']/ul/li")
List<WebElement> Cancellation;

@FindBy(xpath="//li[.='Fare Details & Rules']")
WebElement fared;
@FindBy(xpath="//li[.='Baggage Information']")
WebElement baggageinfo;
@FindBy(xpath="//li[.='Cancellation & Change Rule']")
WebElement cancelinfo;

public void faredclick() {
	fared.click();
}
public void baginfo() {
	baggageinfo.click();
}
public void cancelinformation() {
	cancelinfo.click();
}
public void FlightDetailDropDown()
{
	FlightDetail.click();
}
public void TravelInfo() 
{
	//int count=FlightInfo.size();
	//FlightInfo.get(count-4).click();
	
	int count1=Deatils.size();
	Deatils.get(count1-3).click();
	
	int count2=Baggage.size();
	Baggage.get(count2-2).click();
	
	int count3=Cancellation.size();
	Cancellation.get(count3-1).click();
}

	public Ease_10SearchResultPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

}
