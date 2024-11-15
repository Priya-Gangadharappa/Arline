package SeleniumPackage2.SeleniumProject2;


import java.util.Iterator;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Ease_Listener.class)
public class PaymentPage_15Ease extends Launch_Quit_ease

{
	@Test(retryAnalyzer=Ease_Retry.class)
public void Payment() throws InterruptedException
{
	Ease_4OneWay EO1=new Ease_4OneWay(driver);
	EO1.FromTrip();
	EO1.ToTrip();
//	EO1.DatePicker();
	EO1.depdateclick1();
	EO1.Search();
	
	Ease_11ValidateBookButton EV1=new Ease_11ValidateBookButton(driver);
	Thread.sleep(8000);
	EV1.BookNow();
	EV1.EmailAddress1();
	EV1.Details();
	Thread.sleep(2000);
	EV1.ContinueBook(); 
	EV1.LikeButton();
	Thread.sleep(3000);
	EV1.skipPay();
	Thread.sleep(3000);
	Ease_15PaymentPage EP1=new Ease_15PaymentPage(driver);
	EP1.CardDetails();
	EP1.MakePayment(); 
	
	String msg= EP1.msgdisplay().getText();
	Assert.assertEquals(msg, "Please enter correct credit/debit card number.", "The Error is Wrong");
}
}
