package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pojo.LaunchBrowser;
import pom.ForgotPage;
import utility.Parametrization;

public class ForgotPageTest {
           WebDriver driver;
           @BeforeMethod
     public void LaunchBrowser() {
    	 driver=LaunchBrowser.ChromeBrowser();
		
	}
	@Test
	public void ForgotPage() throws EncryptedDocumentException, IOException, InterruptedException  {
		
       String name=Parametrization.GetData("Credential1",5, 0);
		   String number = Parametrization.GetData("Credential1",6, 0);
		   String email = Parametrization.GetData("Credential1",7, 0);
		   
		   ForgotPage forgotpage=new ForgotPage(driver);
		   
		   forgotpage.ClickonForgot();
		   forgotpage.SwichToForgotPopup(driver);
	       forgotpage.enterYourName(name);
	       forgotpage.enterPanNumber(number);
	       Thread.sleep(3000);
		  // forgotpage.ClickonSMS();
		   
	   forgotpage.enterEMAIL(email);
		
Thread.sleep(5000);
	}}

//	@AfterMethod
//
//	public void closeBrowser() {
//		driver.close();
//}}
	
	
	
	
	
	
	
	
	
	
	
	

