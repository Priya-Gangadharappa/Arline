package SeleniumPackage2.SeleniumProject2;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Ease_Listener.class)
public class InvalidLogin_3Ease extends Launch_Quit_ease
{
	@Test(retryAnalyzer=Ease_Retry.class)
public void Invalid() throws EncryptedDocumentException, IOException, InterruptedException
{
	AirIndia_DDT d1=new AirIndia_DDT();
	d1.DDT();
Ease_3InvalidLogin EI1=new Ease_3InvalidLogin(driver);
	EI1.Register(driver);	
	EI1.CustomerLogin();
	EI1.MobileNo();
    EI1.continue1();
	Thread.sleep(5000);
	EI1.LoginPass();
	EI1.EnterPassword1();
	EI1.LoginButton22();
	String text= EI1.AuthoVerify().getText();
	Assert.assertEquals(text, "Password Authentication", "Not matching");
}
}
