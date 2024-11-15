package SeleniumPackage2.SeleniumProject2;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Ease_Listener.class)
public class OneWay_4Ease extends Launch_Quit_ease
{
	@Test(retryAnalyzer=Ease_Retry.class)
public void oneway() throws InterruptedException
{    
	Ease_4OneWay EO1=new Ease_4OneWay(driver);
	EO1.FromTrip();
	EO1.ToTrip();
//	EO1.DatePicker();
	EO1.depdateclick1();
	EO1.Search();
	Thread.sleep(2000);
	boolean title= driver.getTitle().contains("Lowest Airfare, Flight Tickets, Cheap Air Tickets – EaseMyTrip.com");
	Assert.assertEquals(title, true, "Title is not Matching");
}
}
