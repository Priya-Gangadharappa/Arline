package SeleniumPackage2.SeleniumProject2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ease_7Multicity 
{
WebDriver driver;
@FindBy(xpath="//li[@id='mcity']")
WebElement multicity;
@FindBy(xpath="//input[@id='FromSector-mul1_show']")
WebElement FromF;
@FindBy(xpath="//div[@id='FromMulti1']/ul/li")
List<WebElement> FromCityF;
@FindBy(xpath="//input[@id='ToSector-mul1_show']")
WebElement ToF;
@FindBy(xpath="//div[@id='ToMulti1']/ul/li")
List<WebElement> ToCityF;
@FindBy(xpath="//input[@id='ddateMul1']")
WebElement Ddate;
@FindBy(xpath="(//div[@class='month3'])[2]")
WebElement NextButtonFirst;
@FindBy(xpath="//div[@class='days']/ul/li")
List<WebElement> Date;
@FindBy(xpath="//span[@id='snMulTravel']")
WebElement TravellerFirst;
@FindBy(xpath="//button[@id='addadt']")
WebElement AddPass;

@FindBy(xpath="//input[@id='FromSector-mul2_show']")
WebElement FromSecond;
@FindBy(xpath="//div[@id='FromMulti2']/ul/li")
List<WebElement> FromCitys;
@FindBy(xpath="//input[@id='ToSector-mul2_show']")
WebElement ToSecond;
@FindBy(xpath="//div[@id='ToMulti2']/ul/li")
List<WebElement> ToCityS;
@FindBy(xpath="//input[@id='ddateMul2']")
WebElement ADate;
@FindBy(xpath="(//div[@class='month3'])[2]")
WebElement NextButtonSecond;
@FindBy(xpath="//div[@class='days']/ul/li")
List<WebElement> DatEA;

@FindBy(xpath="(//input[@class='srchBtnmultcty'])[1]")
WebElement Searchmulti;
public void FromCityFirst()
{
	multicity.click();
	FromF.click();
	int count=FromCityF.size();
	FromCityF.get(count-10).click();	
}
public void ToCityFirst()
{
	ToF.click();
	int count=ToCityF.size();
	ToCityF.get(count-9).click();
}
public void DepartureDateMulti()
{
	Ddate.click();
	NextButtonFirst.click();
	int count=Date.size();
	Date.get(count-2).click();
}
public void Passenger()
{
	TravellerFirst.click();
	AddPass.click();
}
public void FromCitySecond()
{
	FromSecond.click();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.titleContains("EaseMyTrip.com"));
	int count=FromCityF.size();
	FromCityF.get(count-9).click();	
}
public void ToCitySecond()
{
	ToSecond.click();
	int count=ToCityS.size();
	ToCityS.get(count-2).click();
}
public void DeapartA()
{
	ADate.click();
	NextButtonSecond.click();
	int count=Date.size();
	Date.get(count-2).click();
	Searchmulti.click();
}
public Ease_7Multicity(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
}
