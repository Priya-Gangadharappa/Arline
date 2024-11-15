package SeleniumPackage2.SeleniumProject2;

import java.util.Iterator;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Ease_Listener.class)
public class SeatSelection_8Ease extends Launch_Quit_ease
{
	@Test(retryAnalyzer=Ease_Retry.class)
public void Seatselection() throws InterruptedException
{
	Ease_4OneWay EO1=new Ease_4OneWay(driver);
	EO1.FromTrip();
	EO1.ToTrip();
//	EO1.DatePicker();
	EO1.depdateclick1();
	EO1.Search();
	Thread.sleep(8000);
	
	Ease_11ValidateBookButton EV1=new Ease_11ValidateBookButton(driver);
	EV1.BookNow();
//	EV1.Promo();
	EV1.EmailAddress();
	EV1.Details();
	EV1.ContinueBook();
	Thread.sleep(3000);
	Ease_8SeatSelection ES2=new Ease_8SeatSelection(driver);

	boolean seat= ES2.SeatVisible().isDisplayed();
	Assert.assertEquals(seat, true, "The Page is Mismatched");
	
}
}
