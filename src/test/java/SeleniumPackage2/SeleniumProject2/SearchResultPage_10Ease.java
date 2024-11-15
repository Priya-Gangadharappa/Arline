package SeleniumPackage2.SeleniumProject2;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Ease_Listener.class)
public class SearchResultPage_10Ease extends Launch_Quit_ease
{
	@Test(retryAnalyzer=Ease_Retry.class)
public void search() throws InterruptedException
{
	Ease_5RoundTrip ER1=new Ease_5RoundTrip(driver);
	ER1.FormCitySelect();
	ER1.ToCitySelect();
	ER1.depdateclick();
	ER1.returndateclick();
	ER1.Search();
	Thread.sleep(8000);
	
	Ease_10SearchResultPage ES1=new Ease_10SearchResultPage(driver);
	ES1.FlightDetailDropDown();
//	ES1.TravelInfo();
	ES1.faredclick();
	Thread.sleep(1000);
	
	ES1.baginfo();
	Thread.sleep(1000);
	
	ES1.cancelinformation();
	
}
}
