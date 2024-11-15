package SeleniumPackage2.SeleniumProject2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Ease_6Classes 
{
WebDriver driver;
@FindBy(xpath="//label[@id='lbEconomy']")
WebElement Economy;
@FindBy(xpath="//label[@id='lbPremiumEconomy']")
WebElement PremiumEconomy;
@FindBy(xpath="//label[@id='lbPremiumEconomy']")
WebElement Business;
@FindBy(xpath="//label[@id='lbFirstClass']")
WebElement FirstClass;
@FindBy(xpath="//button[@class='srchBtnSe']")
WebElement Searchbutton1;

@FindBy(xpath="//select[@id='optClass']")
WebElement Classes;
@FindBy(xpath="//button[@id='btnSrch']")
WebElement SearchButton2;
public WebElement text() {
	return Classes;
}
public void ClassP()
{
	Select s1=new Select(Classes);
	s1.selectByVisibleText(" Premium Economy");	
}
public void ClassE()
{
	Select s1=new Select(Classes);
	s1.selectByVisibleText(" Economy");	
}public void ClassB()
{
	Select s1=new Select(Classes);
	s1.selectByVisibleText(" Business");	
}
public void ClassF()
{
	Select s1=new Select(Classes);
	s1.selectByVisibleText("First Class");	
}
public void search() {
	Searchbutton1.click();
}
public void Search2button()
{
	SearchButton2.click();
}
public void Classes() throws InterruptedException
{
	Economy.click();
	Thread.sleep(1000);
	PremiumEconomy.click();
	Thread.sleep(1000);
	Business.click();
	Thread.sleep(1000);
	FirstClass.click();
}
/*public void Search()
{
	Searchbutton1.click();
}*/
public Ease_6Classes(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
}
