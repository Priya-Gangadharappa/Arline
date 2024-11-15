package SeleniumPackage2.SeleniumProject2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ease_2validLogin 
{
WebDriver driver;
@FindBy(xpath="(//a[.='Login with Password'])[1]")
WebElement LoginWithPassword;
@FindBy(xpath="//input[@id='txtEmail2']")
WebElement EnterPassword;
@FindBy(xpath="(//input[@class='_btnLogin'])[3]")
WebElement LoginButton2;
public void LoginWPass() 
{
	LoginWithPassword.click();
}
public void EnterPass()
{
	EnterPassword.sendKeys("Doctor@9496");
}
public void LoginButton22()
{
	LoginButton2.click();
}

public Ease_2validLogin(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
}
