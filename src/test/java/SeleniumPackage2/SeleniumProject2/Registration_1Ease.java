package SeleniumPackage2.SeleniumProject2;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Ease_Listener.class)
public class Registration_1Ease extends Launch_Quit_ease
{
//WebDriver driver;
@Test
public void Registration() throws InterruptedException
{
	Ease_1SignUp ES1=new Ease_1SignUp(driver);
	ES1.Register(driver);	
	ES1.CustomerLogin();
	ES1.MobileNo();
	ES1.continue1();
	ES1.Otp();
	
}
}
