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

public class AirIndia_Listener2 implements ITestListener
{
 static WebDriver driver;
@Override
public void onTestSuccess(ITestResult result) 
{
	
	ITestListener.super.onTestSuccess(result);
	Reporter.log("Test case is pass");
	
	TakesScreenshot ts1=(TakesScreenshot) driver;
    File source=ts1.getScreenshotAs(OutputType.FILE);
    File destination=new File("C:\\Users\\priya\\OneDrive\\Desktop\\AirIndiaPass"+Math.random()+".png");
    try {
		FileHandler.copy(source, destination);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

@Override
public void onTestFailure(ITestResult result) {
    ITestListener.super.onTestFailure(result);
    Reporter.log("Test case is fail");
    
    if (driver instanceof TakesScreenshot) {
        TakesScreenshot ts2 = (TakesScreenshot) driver;
        File source = ts2.getScreenshotAs(OutputType.FILE);
        File destination = new File("C:\\Users\\priya\\OneDrive\\Desktop\\AirInidaFail" + Math.random() + ".png");
        try {
            FileHandler.copy(source, destination);
        } catch (IOException e) {
            e.printStackTrace();
        }
    } else {
        Reporter.log("Driver does not support taking screenshots");
    }
}
}