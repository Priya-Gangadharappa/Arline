package SeleniumPackage2.SeleniumProject2;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ease_8SeatSelection
{
WebDriver driver;
@FindBy(xpath="(//a[.='Let Me Choose Myself'])[1]")
WebElement ChooseSeat;
@FindBy(xpath="//label[@id='BOM_BLR3A']")
WebElement SeatSelection;
@FindBy(xpath="//div[@id='divancMealDtl']")
WebElement Meal;
@FindBy(xpath="(//a[@id='add3'])[13]")
WebElement Food;
@FindBy(xpath="//div[@id='divancBaggDtl']")
WebElement Baggage;
@FindBy(xpath="(//a[@id='add31'])[4]")
WebElement Bag;
@FindBy(xpath="(//span[.='Continue Booking'])[4]")
WebElement ContinueSeatBook;
@FindBy(xpath="(//span[.='Seat'])[2]")
WebElement SeatVis;

public WebElement SeatVisible() {
	return SeatVis;
}
public void Seat() 
{
//	ChooseSeat.click();
	SeatSelection.click();
}
public void MealSelection()
{
	Meal.click();
	Food.click();
}
public void Baggagee()
{
	Baggage.click();
	Bag.click();
}
public void ContinueBookSeat()
{
	ContinueSeatBook.click();
}
public Ease_8SeatSelection(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
}
