package SeleniumPackage2.SeleniumProject2;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Ease_Listener.class)
public class MultiPassanger_9Ease extends Launch_Quit_ease
{
	@Test(retryAnalyzer=Ease_Retry.class)
	public void AddPassenger() throws InterruptedException
	{
		Ease_4OneWay EO1=new Ease_4OneWay(driver);
		EO1.FromTrip();
		EO1.ToTrip();
//		EO1.DatePicker();
		EO1.depdateclick1();		
		Ease_9MultiPassanger EM= new Ease_9MultiPassanger(driver);
		EM.Passenger1();
		EO1.Search();
		Thread.sleep(6000);
		Ease_11ValidateBookButton EV1=new Ease_11ValidateBookButton(driver);
		EV1.BookNow();
		EV1.EmailAddress1();
		EV1.Details();
		
		Ease_9MultiPassanger EM1=new Ease_9MultiPassanger(driver);
		EM1.Details1();
		
		String name1= EM1.name1().getText();
		String name2= EM1.name2().getText();
		Assert.assertEquals(name1, "Mr Rishi Sunak", "Name is not matching");
		Assert.assertEquals(name2, "Ms Ridhi Sunak", "Name is not matching");
	}
}


