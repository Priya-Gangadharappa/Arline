package SeleniumPackage2.SeleniumProject2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Ease_9MultiPassanger 
{
WebDriver driver;
@FindBy(xpath="//span[@id='spnTraveller']")
WebElement Traveller1;
@FindBy(xpath="(//button[@id='add'])[1]")
WebElement Adultsadd;

@FindBy(xpath="//input[@id='txtFNAdult1']")
WebElement Fname;
@FindBy(xpath="//input[@id='txtLNAdult1']")
WebElement Lname;
@FindBy(xpath="//input[@id='txtEmailAdult1']")
WebElement EmailId;
@FindBy(xpath="//input[@id='txtCPhoneAdult1']")
WebElement Contactno;
@FindBy(xpath="//select[@id='titleAdult1']")
WebElement Title;
@FindBy(xpath="(//button[@id='add'])[1]")
WebElement AddPassenger;
@FindBy(xpath="((//label[@id='mycheckbox'])[1]/span)[1]")
WebElement NameText;
@FindBy(xpath="((//label[@id='mycheckbox'])[2]/span)[1]")
WebElement NameText1;
public WebElement name1() {
	return NameText;
}
public WebElement name2() {
	return NameText1;
}
public void Details1()
{
	Select s1=new Select(Title);
	s1.selectByVisibleText("MS");
	Fname.sendKeys("Ridhi");
	Lname.sendKeys("Sunak");
	EmailId.sendKeys("priya.sg1212@gmail.com");
	Contactno.sendKeys("7411088304");
}
public void Passenger1()
{
	Traveller1.click();
	AddPassenger.click();
}
public void ADD()
{
	
	Adultsadd.click();
}

public Ease_9MultiPassanger(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
}