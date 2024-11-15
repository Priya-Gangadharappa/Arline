package SeleniumPackage2.SeleniumProject2;

import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Test;

public class ValidateBookButton_11Ease extends Launch_Quit_ease
{
	@Test(retryAnalyzer=Ease_Retry.class)
public void ValidateDetails() throws InterruptedException
{
	
	Ease_5RoundTrip ER1=new Ease_5RoundTrip(driver);
	ER1.FormCitySelect();
	ER1.ToCitySelect();
//	ER1.DepartureDate();
//	ER1.Returndate();
	ER1.depdateclick();
	ER1.returndateclick();
	ER1.Search();
	
	Ease_11ValidateBookButton EV1=new Ease_11ValidateBookButton(driver);
	Thread.sleep(8000);
	EV1.BookNowButton();
	Thread.sleep(4000);
	EV1.contbook();
//	EV1.BookNow();
//	EV1.Promo();
	EV1.EmailAddress();
	EV1.Details();
	EV1.ContinueBook();
	
}
}
