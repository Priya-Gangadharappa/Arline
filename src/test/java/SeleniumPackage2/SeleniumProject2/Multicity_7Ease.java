package SeleniumPackage2.SeleniumProject2;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Ease_Listener.class)
public class Multicity_7Ease extends Launch_Quit_ease
{
	@Test(retryAnalyzer=Ease_Retry.class)
public void multicity()
{
	Ease_7Multicity EM1=new Ease_7Multicity(driver);
	EM1.FromCityFirst();
	EM1.ToCityFirst();
	EM1.DepartureDateMulti();
	EM1.Passenger();
	//EM1.FromCitySecond();
	EM1.ToCitySecond();
	EM1.DeapartA();
}
}
