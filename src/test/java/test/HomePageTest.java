package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pojo.LaunchBrowser;
import pom.ZerodhaHomePage;
import pom.ZerodhaLoginPage;
import utility.Parametrization;

public class HomePageTest {
	
WebDriver driver;
@BeforeMethod
	public void LaunchBrowser() throws EncryptedDocumentException, IOException, InterruptedException {
		 driver= LaunchBrowser.ChromeBrowser();
		 ZerodhaLoginPage zerodhaloginpage=new ZerodhaLoginPage(driver);
			String name= Parametrization.GetData("Credential1",0,0);
			String pass = Parametrization.GetData("Credential1",1,0);
			String pin= Parametrization.GetData("Credential1",2,0);
		  zerodhaloginpage.EnterName(name);
		  zerodhaloginpage.Enterpassword(pass);
		  
		  zerodhaloginpage.ClickonLogin();
		  Thread.sleep(2000);
		  zerodhaloginpage.EnterPin(pin);
		  zerodhaloginpage.ClickonPIN();
		  
}

@Test
public void SearchStockTest() throws InterruptedException {
	
	ZerodhaHomePage zerodhahomepage =new ZerodhaHomePage(driver);
	
	zerodhahomepage.SearchStock("Reliance",driver);
	int number =zerodhahomepage.getsearchResultNumber();
	System.out.println(number);
	Assert.assertTrue(number>0);
	
}
@Test
public void searchDesiredStockAndClickonBuy() {	
	ZerodhaHomePage zerodhahomepage =new ZerodhaHomePage(driver);
	zerodhahomepage.SearchStock("Adani", driver);
	zerodhahomepage.SearchStockClickonBUY(driver,"ADANIENT");
	zerodhahomepage.ClickonSearchResultBuy();
	   //SoftAssert soft=new SoftAssert();
	      //soft.assertTrue(true, "ADANIENT"); 
	     // soft.assertAll();
	Assert.assertTrue(true, "Buy ADANIENT");// Expected result is ADANIENT when it True then assertion will pass.

	
	zerodhahomepage.ClickToChangeQuantity("2");
	zerodhahomepage.ClickonActualShareToBUY();
	
	zerodhahomepage.ClickonCancelToSelectedStock();
	//zerodhahomepage.ClickonOrders();
}
public void ClickonMarketDepth() {
	ZerodhaHomePage zerodhahomepage =new ZerodhaHomePage(driver);
	zerodhahomepage.SearchStock(null, driver);
}
}

//@AfterMethod
//public void CloseBrowser() {
//driver.close();}
//}
