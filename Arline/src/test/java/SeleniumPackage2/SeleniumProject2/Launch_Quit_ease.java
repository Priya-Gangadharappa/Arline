package SeleniumPackage2.SeleniumProject2;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners(Ease_Listener.class)
public class Launch_Quit_ease extends Ease_Listener
{
	/*WebDriver driver;	
	@BeforeMethod
	public void Launch() throws InterruptedException
	{
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	wait.until(ExpectedConditions.titleContains("-EaseMyTrip.com"));
	ChromeOptions Options=new ChromeOptions();
	Options.addArguments("--disable-notifications");
	
	driver=new ChromeDriver();
	driver.get("https://www.easemytrip.com/");
	driver.manage().window().maximize();
	}*/
	WebDriver driver;

	@BeforeMethod
	public void Launch() throws InterruptedException 
	{
		Thread.sleep(1000);
	   ChromeOptions options = new ChromeOptions();
	    options.addArguments("--disable-notifications");
	    
	    driver = new ChromeDriver(options);	    
	    driver.get("https://www.easemytrip.com/");
	    driver.manage().window().maximize();
	}

	
	//@Test(retryAnalyzer=Amazon_RetryTestcase.class)
	
@AfterMethod
public void quit() throws IOException
{	
//driver.quit();
}
}


