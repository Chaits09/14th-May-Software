package test;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.zerodhaSignUpPage;
import pojo.LaunchBrowser;
import pom.zerodhaSignUpPage;


public class SignUpPageTest {

	 WebDriver driver;
	    @BeforeMethod
	  public void LaunchBrowser() { 
	 driver= LaunchBrowser.ChromeBrowser();
	    }
	@Test
	
	public void ZerodhaSignUpPage() throws InterruptedException  {
	
	zerodhaSignUpPage signup=new zerodhaSignUpPage(driver);

        signup.clickondontHaveAccount();
        
       Thread.sleep(5000);
        signup.SwitchToSignUpPopup(driver);
       // Thread.sleep(5000);
     //   signup.NRIaccount();
     // signup.EnterMobile(Mobile);
    
      //signup.ClickonProduct();
      //Thread.sleep(5000);
      // signup.ClickonAbout();
}

}	



	
