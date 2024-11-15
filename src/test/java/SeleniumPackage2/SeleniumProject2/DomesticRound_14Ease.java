package SeleniumPackage2.SeleniumProject2;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Ease_Listener.class)
public class DomesticRound_14Ease extends Launch_Quit_ease
{
	@Test(retryAnalyzer=Ease_Retry.class)
public void Domestic()
{
	Ease_14DomesticRound ED1=new Ease_14DomesticRound(driver);
	ED1.FormCitySelectDomestic();
	ED1.ToCitySelectDomestic();
	ED1.DepartureDateDomestic();
	ED1.ReturndateDomestic();
	ED1.PassengersDomestic();
	ED1.SearchDomestic();
}
}
