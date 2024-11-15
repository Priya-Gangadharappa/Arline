package SeleniumPackage2.SeleniumProject2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AirIndia_2Login extends AirIndia_DDT 
{
WebDriver driver;
@FindBy(xpath="(//button[.='Accept All'])[1]")
WebElement Accept;
@FindBy(xpath="//button[@id='signIn']")
WebElement SiginButton;
@FindBy(xpath="//input[@name='username']")
WebElement UserNamea;
@FindBy(linkText="Sign In with OTP")
WebElement SigninWithOTP;

public void Cookies1() 
{
	 Accept.click();
}
public void Siginclick()
{
	SiginButton.click();
}
public void UN() 
{
	UserNamea.sendKeys(userName);
}
public void sigin()
{
	SigninWithOTP.click();
}

public AirIndia_2Login(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
}
