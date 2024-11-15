package SeleniumPackage2.SeleniumProject2;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Ease_Retry implements IRetryAnalyzer
{
	 int current_count=0;
	 int retry_cocunt=0;
	 
	 
	@Override
	public boolean retry(ITestResult result) 
	{
		 if(current_count<retry_cocunt)
		 {
			 return true;
		 }
		 return false;
		
	}
}
