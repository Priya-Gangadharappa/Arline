package SeleniumPackage2.SeleniumProject2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Ease_15PaymentPage 
{
WebDriver driver;
@FindBy(xpath="//input[@id='CC']")
WebElement Cardno;
@FindBy(xpath="//input[@id='CCN']")
WebElement HolderName;
@FindBy(xpath="//select[@id='CCMM']")
WebElement ExpMonth;
@FindBy(xpath="//select[@id='CCYYYY']")
WebElement ExpYear;
@FindBy(xpath="//input[@id='CCCVV']")
WebElement CVV;
@FindBy(xpath="(//div[@class='mk-pym'])[1]")
WebElement PaymentButton;
@FindBy(xpath="//span[.='Please enter correct credit/debit card number.']")
WebElement ErroMsg;
public WebElement msgdisplay() {
	return ErroMsg;
}
public void CardDetails()
{
	Cardno.sendKeys("8523123645698523");
	HolderName.sendKeys("Rishi");
	
	Select s1=new Select(ExpMonth);
	s1.selectByIndex(8);
	
	Select s2=new Select(ExpYear);
	s2.selectByVisibleText("2029");
	
	CVV.sendKeys("789");
}
public void MakePayment()
{
	PaymentButton.click();
}

public Ease_15PaymentPage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
}
