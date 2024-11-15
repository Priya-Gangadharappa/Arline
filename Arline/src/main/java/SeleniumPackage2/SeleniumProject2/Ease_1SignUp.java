package SeleniumPackage2.SeleniumProject2;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ease_1SignUp 
{
WebDriver driver;
@FindBy(xpath="//span[.='Login or Signup']")
WebElement LoginANDSignup;
@FindBy(xpath="//span[.='Login & check bookings']")
WebElement custLogin;
@FindBy(id="txtEmail")
WebElement EmailorMobileno;
@FindBy(id="shwotp")
WebElement Cont;
@FindBy(xpath="//input[@id='shwotp']")
WebElement Cont1;
@FindBy(xpath="//div[@id='divLoginOTP']")
WebElement Otp;
@FindBy(xpath="(//input[@id='OtpLgnBtn'])[1]")
WebElement CreateNewAccout;
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
public void ContinueNew(ChromeDriver driver) throws InterruptedException
{	 //Thread.sleep(8000);
	this.driver=driver;
Wait<ChromeDriver> w1=new FluentWait<ChromeDriver>(driver).
withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(5)).
ignoring(NullPointerException.class);
w1.until(ExpectedConditions.elementToBeClickable(Cont));
//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
//wait.until(ExpectedConditions.elementToBeClickable(Cont1));
	Cont.click();
}
public void MobileNo() throws InterruptedException
{
	EmailorMobileno.sendKeys("7411088304");
	//EmailorMobileno.sendKeys("7411088304",Keys.TAB,Keys.ENTER);
}
public void continue1() throws InterruptedException
{   Thread.sleep(16000);
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	wait.until(ExpectedConditions.elementToBeClickable(Cont1));
    Cont1.click();

}
public void Otp()
{
	Scanner s1=new Scanner(System.in);
	String OTP=s1.next();
	Otp.sendKeys(OTP);
	CreateNewAccout.click();
}
public Ease_1SignUp(WebDriver driver)
{//this.driver=driver;
	PageFactory.initElements(driver, this);
}
}
