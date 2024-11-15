package SeleniumPackage2.SeleniumProject2;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Ease_Listener.class)
public class LoginSearchLogout_12Ease extends Launch_Quit_ease
{
	@Test(retryAnalyzer=Ease_Retry.class)
public void EndtoEnd() throws InterruptedException
{
	Ease_1SignUp ES1=new Ease_1SignUp(driver);
	ES1.Register(driver);	
	ES1.CustomerLogin();
	Thread.sleep(2000);
	ES1.MobileNo();
	Thread.sleep(3000);
	ES1.continue1();

	Ease_2validLogin EV1=new Ease_2validLogin(driver);
	EV1.LoginWPass();
	EV1.LoginWPass();
	Thread.sleep(4000);
	
	Ease_4OneWay EO1=new Ease_4OneWay(driver);
	//EO1.FromTrip();
	EO1.FromDep1();
	EO1.ToTrip();
	EO1.DatePicker();
	EO1.Search();
	
	Ease_12LoginSearchLogout EL1=new Ease_12LoginSearchLogout(driver);
	EL1.Logout(); 
}
}
