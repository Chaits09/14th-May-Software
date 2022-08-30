package test;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.netty.handler.codec.http.HttpContentEncoder.Result;
import pojo.LaunchBrowser;
import pom.ZerodhaLoginPage;
import utility.BaseTest;
import utility.Parametrization;
import utility.Reports;
import utility.Screenshot;

@Listeners(utility.Listeners.class)
public class LoginPageTest extends BaseTest {

	ExtentReports reports;        //variable reports declared globally
	ExtentTest test;
	@BeforeTest
	public void addreports() {
		reports= Reports.generatereports();
	}

	//WebDriver driver; 
@BeforeMethod
public void LaunchBrowser() {
	 driver = LaunchBrowser.ChromeBrowser();	
}
	
@Test	
public void ZerodhaLoginPage() throws EncryptedDocumentException, IOException, InterruptedException {
	test=reports.createTest("ZerodhaLoginPage");           //to get the report
	String name= Parametrization.GetData("Credential1",0,0);
String pass = Parametrization.GetData("Credential1",1,0);
 
String pin= Parametrization.GetData("Credential1",2,0);
	
  ZerodhaLoginPage zerodhaloginpage=new ZerodhaLoginPage(driver);
  
  zerodhaloginpage.EnterName(name);
  
  zerodhaloginpage.Enterpassword(pass);//pass driver bcz explicit wait element in pom class accept Webdriver driver
                                              
  zerodhaloginpage.ClickonLogin();
 
	Thread.sleep(1000); 
	zerodhaloginpage.EnterPin(pin);
	//zerodhaloginpage.ClickonForgot()
	zerodhaloginpage.ClickonPIN();
	Assert.assertTrue(false);//we pass hard assert to fail the test case and to check listeners are working or not.
	
	
}
@Test
public void ValidateZerodhaForgotLink() {
	test=reports.createTest("validateZerodhaForgotLink");
	ZerodhaLoginPage zerodhaloginpage=new ZerodhaLoginPage(driver);
	zerodhaloginpage.ClickonForgot();	
}

@AfterMethod
//public void CloseBrowser() {
//	driver.close();
//}}
public void postTest(ITestResult result) {
	if(result.getStatus()== ITestResult.FAILURE)
	{
		test.log(Status.FAIL, result.getName());
		
	}
	else if(result.getStatus()==ITestResult.SUCCESS)
	{
		test.log(Status.PASS, result.getName());
	}
	else
	{
		test.log(Status.SKIP, result.getName());
		
	}}
@AfterTest
public void flushReport() {
	reports.flush();
		
		
}

}



