package SeleniumPackage2.SeleniumProject2;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class AirIndia_1RegistrationPage 
{	    
 WebDriver driver;
 @FindBy(xpath="(//button[.='Accept All'])[1]")
 WebElement Accept;
/* @FindBy(xpath="//a[@id='headernav4']")
 WebElement Loyalty_Button;
 @FindBy(id="header4menu0link1")
 WebElement SignupButton;*/
 @FindBy(xpath="//button[@id='signIn']")
 WebElement Signin;
 @FindBy(xpath="//button[@id='create-account-button']")
 WebElement SignupButton2;
 @FindBy(xpath="//div[@class='mat-select-panel-wrap ng-tns-c45-1 ng-trigger ng-trigger-transformPanelWrap ng-star-inserted']")
 WebElement TitleDropdown;
 @FindBy(xpath="//span[.='Mr']")
 WebElement MISTER;
 @FindBy(xpath="//input[@id='userfirstNameInput']")
 WebElement Fname;
 @FindBy(xpath="//input[@id='userLastName']")
 WebElement Lname;
 @FindBy(xpath="//input[@id='nationalityForUser']")
 WebElement NationalityTextbox;
 @FindBy(xpath="//span[.='Indian (IN)']")
 WebElement SelectNationality;
 @FindBy(xpath="//button[@class='btn btn-outline-secondary bi bi-calendar3']")
 WebElement DOBpicker;
 @FindBy(xpath="(//select[@class='form-select'])[1]")
 WebElement dobMonth;
 @FindBy(xpath="(//select[@class='form-select'])[2]")
 WebElement dobYear;
 @FindBy(xpath="(//div[.='5'])[2]")
 WebElement dobDate;
 @FindBy(xpath="//input[@id='contactEmail']")
 WebElement Email;
 @FindBy(xpath="//input[@id='confirmEmail']")
 WebElement ConfirmEmail;
 @FindBy(xpath="//input[@id='phoneNo']")
 WebElement phoneno;
 @FindBy(xpath="//input[@id='confirmPhoneNo']")
 WebElement ConfirmPhoneno;
 @FindBy(xpath="//input[@id='promotionCheck']")
 WebElement CheckBoxTc;
 @FindBy(id="submit-button")
 WebElement submitButton;
 public void Cookies()
 {
	 Accept.click();
 }
/* public void Loyalty()
{
	Loyalty_Button.click();
}
public void SignUp() throws InterruptedException
{
	Thread.sleep(1000);
	SignupButton.click();
}*/
 public void SiginLink() 
 {
	 Signin.click();
 }
public void Signup2()
{
	SignupButton2.click();
}
public void Title()
{
	TitleDropdown.click();
}
public void SelectTitle()
{
	MISTER.click();
}
public void FirstName()
{
	Fname.sendKeys("Rishi");
}
public void LastName()
{
	Lname.sendKeys("Sunak");
}
public void Nationality()
{
	NationalityTextbox.click();
}
public void NationalitySelection()
{
	SelectNationality.click();
}
public void DateOfBirth()
{
	DOBpicker.click();
}
public void MonthDOB()
{
	dobMonth.click();
	Select s1=new Select(dobMonth);
	s1.selectByVisibleText("Aug");			
}
public void YearDOB1()
{
	dobYear.click();
	Select s1=new Select(dobYear);
	s1.selectByVisibleText("1995");
}
public void DateDOB1()
{
	dobDate.click();
}
public void Emailid()
{
	Email.sendKeys("priya.sg1212@gmail.com");
}
public void confirmEmailid1()
{
	ConfirmEmail.sendKeys("priya.sg1212@gmail.com");
}
public void Mobileno()
{
	phoneno.sendKeys("7411088304");
}
public void ConfirmMobileno1()
{
	ConfirmPhoneno.sendKeys("7411088304");
}
public void promotionCheck()
{
	CheckBoxTc.click();
	if(CheckBoxTc.isSelected()&&CheckBoxTc.isEnabled())
	{
		System.out.println("checkBox is selected ");
	}
	else
	{
		System.out.println("checkbox is disabled");
	}
}
public void submit()
{
	submitButton.click();
}
public AirIndia_1RegistrationPage(WebDriver driver)
{
	//this.driver = driver;
	PageFactory.initElements(driver, this);
} 
}
