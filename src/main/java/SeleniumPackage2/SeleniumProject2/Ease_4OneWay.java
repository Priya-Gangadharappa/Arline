package SeleniumPackage2.SeleniumProject2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ease_4OneWay 
{
WebDriver driver;
@FindBy(xpath="//li[@id='oway']")
WebElement oneway;
@FindBy(id="FromSector_show")
WebElement From;
@FindBy(xpath= "//input[@id='FromSector_show']")
WebElement From1;
@FindBy(xpath="//div[@id='fromautoFill']/ul/li")
List<WebElement> FromCity;
@FindBy(xpath="//input[@id='Editbox13_show']")//(//input[@class='autoFlll cityinput'])[2]")
WebElement To;
@FindBy(xpath="//div[@id='toautoFill']/ul/li")
List<WebElement> ToCity;
@FindBy(xpath="//input[@id='ddate']")
WebElement Departure;
@FindBy(id="img2Nex")
WebElement NextBuuton;
@FindBy(xpath="//div[@class='days']/ul/li")
List<WebElement> Date;
@FindBy(xpath="//button[@class='srchBtnSe']")
WebElement SearchButton;

@FindBy(xpath="((//ul[@class='bor-d51'])[2]/li)[6]")
WebElement depdate1;

@FindBy(xpath="((//ul[@class='bor-d61'])[2]/li)[3]")
WebElement depdate2;
public void depdateclick1() {
	depdate2.click();;
}

public void depdateclick() {
	depdate1.click();
}
public void FromDep1()
{
	From1.click();
	int count=FromCity.size();
	FromCity.get(count-9).click();
}
public void FromTrip()
{
//	oneway.click();
	From.click();
	int count=FromCity.size();
	FromCity.get(count-9).click();
}
public void ToTrip()
{
	//To.click();
//	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
//	wait.until(ExpectedConditions.titleContains("EaseMyTrip.com"));
	int count=ToCity.size();
	ToCity.get(count-2).click();
}
public void DatePicker()
{
	//Departure.click();
	NextBuuton.click();
	int count=Date.size();
	Date.get(count-4).click();
}
public void Search()
{
	SearchButton.click();
}
public Ease_4OneWay(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
}
