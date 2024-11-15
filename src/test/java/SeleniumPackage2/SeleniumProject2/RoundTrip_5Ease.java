package SeleniumPackage2.SeleniumProject2;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Ease_Listener.class)
public class RoundTrip_5Ease extends Launch_Quit_ease
{
	@Test(retryAnalyzer=Ease_Retry.class)
public void Round()
{
	Ease_5RoundTrip ER1=new Ease_5RoundTrip(driver);
	ER1.FormCitySelect();
	ER1.ToCitySelect();
	ER1.depdateclick();
	ER1.returndateclick();
	ER1.Search();
}
}
