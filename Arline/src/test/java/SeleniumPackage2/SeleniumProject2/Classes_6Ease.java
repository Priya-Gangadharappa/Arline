 package SeleniumPackage2.SeleniumProject2;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Ease_Listener.class)
public class Classes_6Ease extends Launch_Quit_ease
{
@Test(retryAnalyzer=Ease_Retry.class)
public void DifferentClasses() throws InterruptedException
{
	Ease_5RoundTrip ER1=new Ease_5RoundTrip(driver);
	ER1.FormCitySelect();
	ER1.ToCitySelect();
	ER1.depdateclick();
	ER1.returndateclick();
	ER1.Search();
	Thread.sleep(6000);
	
	Ease_6Classes EC1=new Ease_6Classes(driver);
	EC1.ClassP();
	EC1.Search2button();
	Thread.sleep(6000);

	EC1.ClassE();
	EC1.Search2button();
	Thread.sleep(6000);
	
	EC1.ClassB();
	EC1.Search2button();
	Thread.sleep(6000);
	
	EC1.ClassF();
	EC1.Search2button();
	Thread.sleep(6000);  
}
}
