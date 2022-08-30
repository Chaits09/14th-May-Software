package utility;



import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners extends BaseTest implements ITestListener {
	//WebDriver driver;
     public void onTestStart(ITestResult result) {
    	 
	System.out.println("Test Started"+result.getName());
     }
     
     public void onTestSuccess(ITestResult result)
     {
    	 System.out.println("Test passed"+result.getName());
     }
     
     public void onTestFailure(ITestResult result)
     {
    	try
    	{
     Screenshot.takeScreenShot(driver,result.getName());
    	}
	catch(IOException e)
    	{
		e.printStackTrace();
	}
     } 
     public void onTestSkipped(ITestResult result) 
     {
    	 System.out.println("Test skipped"+result.getName());	
	
}
	
}
