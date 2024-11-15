package SeleniumPackage2.SeleniumProject2;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ease_3InvalidLogin extends AirIndia_DDT
{
	WebDriver driver;
	@FindBy(xpath="//span[.='Login or Signup']")
	WebElement LoginANDSignup;
	@FindBy(xpath="//span[.='Login & check bookings']")
	WebElement custLogin;
	@FindBy(id="txtEmail")
	WebElement EmailorMobileno;
	@FindBy(xpath="(//div[@class='_inpwdth'])[2]/input")
	WebElement Cont1;
	//@FindBy(xpath="//div[@id='divLoginOTP']")
	//WebElement Otp;
	@FindBy(xpath="(//a[.='Login with Password'])[1]")
	WebElement LoginWithPassword;
	@FindBy(xpath="//input[@id='txtEmail2']")
	WebElement EnterPassword;
	@FindBy(xpath="(//input[@class='_btnLogin'])[3]")
	WebElement LoginButton2;
	@FindBy(xpath="//div[.='Password Authentication']")
	WebElement LoginAutho;
	
	public WebElement AuthoVerify()
	{
		return LoginAutho;
	}
	public void Register(WebDriver driver)
	{       this.driver=driver;
		Actions a1=new Actions(driver);
		a1.moveToElement(LoginANDSignup).perform();
		//LoginANDSignup.click();	
	}
	public void CustomerLogin()
	{
		custLogin.click();
	}
	public void MobileNo() throws InterruptedException
	{
		EmailorMobileno.sendKeys(userName,Keys.TAB, Keys.ENTER);
	}
	public void continue1() throws InterruptedException
	{  //  Thread.sleep(8000);
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	wait.until(ExpectedConditions.elementToBeClickable(Cont1));
		Cont1.click();
	}
	public void Otp()
	{
		Scanner s1=new Scanner(System.in);
		String OTP=s1.next();
	//	Otp.sendKeys(OTP);
	}
	public void LoginPass()
	{
		LoginWithPassword.click();
	}
	public void EnterPassword1()
	{
		EnterPassword.sendKeys(passWord);	
	}
	public void EnterPassreal()
	{
		EnterPassword.sendKeys("Doctor@9496");
	}
	public void LoginButton22()
	{
		LoginButton2.click();
	}
	
	public Ease_3InvalidLogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
