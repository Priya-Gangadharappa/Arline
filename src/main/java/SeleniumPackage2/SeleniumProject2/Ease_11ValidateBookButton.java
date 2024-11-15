package SeleniumPackage2.SeleniumProject2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Ease_11ValidateBookButton {
WebDriver driver;
@FindBy(xpath="//button[@id='Book5']")
WebElement BookNowButton;
@FindBy(xpath="//input[@id='txtCouponCode']")
WebElement Promocode;
@FindBy(xpath="(//div[.='apply'])[2]")
WebElement Apply;
@FindBy(xpath="//form[@class='ng-pristine ng-valid ng-valid-maxlength']")
WebElement SecureTrip;
@FindBy(xpath="//input[@id='txtEmailId']")
WebElement Email;
@FindBy(xpath="//span[.='Continue Booking']")
WebElement continueBook;
@FindBy(xpath="//select[@id='titleAdult0']")
WebElement Title;
@FindBy(xpath="//input[@id='txtFNAdult0']")
WebElement Fname;
@FindBy(xpath="//input[@id='txtLNAdult0']")
WebElement Lname;
@FindBy(xpath="//input[@id='txtEmailAdult0']")
WebElement EmailId;
@FindBy(xpath="//input[@id='txtCPhoneAdult0']")
WebElement Contactno;
@FindBy(xpath="//input[@id='txtCPhone']")
WebElement ContactDetails;
@FindBy(xpath="(//span[@class='cmark_cbox'])[4]")
WebElement Terms;
@FindBy(xpath="(//span[@class='cmark_cbox'])[2]")
WebElement Terms1;
@FindBy(xpath="//span[@id='spnTransaction']")
WebElement ContinueBooking;
@FindBy(xpath="(//a[.='Yes! I Like it'])[1]")
WebElement Likeit;
@FindBy(xpath="//a[.='Skip to Payment']")
WebElement SkiptoPay;

@FindBy(xpath="(//button[.='Book Now'])[2]")
WebElement booknow1;
@FindBy(xpath="(//div[.='Continue'])[2]")
WebElement bookcontinue;
public void contbook() {
	bookcontinue.click();
}
public void BookNowButton() {
	booknow1.click();
}
public void LikeButton() {
	Likeit.click();
}
public void skipPay() {
	SkiptoPay.click();
}
public void BookNow()
{
	/*Set<String> s1=driver.getWindowHandles();
	Iterator i1=s1.iterator();
	String Parentid=(String) i1.next();
	String Childid=(String) i1.next();
	driver.switchTo().window(Childid);*/
	BookNowButton.click();
}
public void Promo()
{
	Promocode.sendKeys("1234");
	Apply.click();
}
public void EmailAddress1() {
	Email.sendKeys("priya.sg1212@gmail.com"+Keys.ENTER);
}

public void EmailAddress()
{
	//SecureTrip.click();
	Email.sendKeys("priya.sg1212@gmail.com",Keys.ENTER);
//	continueBook.click();
}
public void Details()
{
	Select s1=new Select(Title);
	s1.selectByVisibleText("MR");
	Fname.sendKeys("Rishi");
	Lname.sendKeys("Sunak");
	EmailId.sendKeys("priya.sg1212@gmail.com");
	Contactno.sendKeys("7411088304");
	ContactDetails.sendKeys("7411088304");
}
public void Phnno() {
	ContactDetails.sendKeys(Keys.ENTER);
}
public void Term() {
	Terms.click();
}
public void Term1() {
	Terms1.click();
}
public void ContinueBook()
{
	ContinueBooking.click();
}

public Ease_11ValidateBookButton(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
}
