package SeleniumPackage2.SeleniumProject2;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Ease_Listener implements ITestListener
{
public static WebDriver driver;
	@Override
	public void onTestSuccess(ITestResult result) {
        Reporter.log("Test case is pass");
        if (driver != null) {
            TakesScreenshot t1 = (TakesScreenshot) driver;
            File source = t1.getScreenshotAs(OutputType.FILE);
            File destination = new File("C:\\Users\\priya\\OneDrive\\Desktop\\Pass" + Math.random() + ".png");
            try {
                FileHandler.copy(source, destination);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
	@Override
	public void onTestFailure(ITestResult result) {
        Reporter.log("Test case is fail");
        if (driver != null) {
            TakesScreenshot t1 = (TakesScreenshot) driver;
            File source = t1.getScreenshotAs(OutputType.FILE);
            File destination = new File("C:\\Users\\priya\\OneDrive\\Desktop\\Fail" + Math.random() + ".png");
            try {
                FileHandler.copy(source, destination);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
