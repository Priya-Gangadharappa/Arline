package SeleniumPackage2.SeleniumProject2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Ease_12LoginSearchLogout 
{
WebDriver driver;
@FindBy(xpath="//div[@id='spnLogoutPnl']")
WebElement LoginandSignupButton;
@FindBy(xpath="//span[.='Log Out']")
WebElement Logout;
public void Logout()
{
	LoginandSignupButton.click();
	Logout.click();
}
public Ease_12LoginSearchLogout(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
}
