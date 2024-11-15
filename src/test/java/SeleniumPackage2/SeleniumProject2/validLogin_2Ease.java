 package SeleniumPackage2.SeleniumProject2;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Ease_Listener.class)
public class validLogin_2Ease extends Launch_Quit_ease
{
	@Test(retryAnalyzer=Ease_Retry.class)
public void Login() throws InterruptedException, EncryptedDocumentException, IOException
{	
	Ease_1SignUp ES1=new Ease_1SignUp(driver);
	ES1.Register(driver);	
	ES1.CustomerLogin();
	ES1.MobileNo();
	//Thread.sleep(4000);
	ES1.ContinueNew((ChromeDriver) driver);
	//ES1.Otp();
	/*EI1.LoginPass();
	EI1.EnterPassreal();
//	EI1.EnterPassword1();
	EI1.LoginButton22(); */
	
//	Assert.assertEquals(driver.getTitle(),"Book Flights, Hotels, Holidays, Bus & Train Tickets - EaseMyTrip.com","The Title is not Matching");
}
}
