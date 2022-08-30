package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.LaunchBrowser;
import pom.ZerodhaHomePage;
import pom.ZerodhaLoginPage;
import pom.ZerodhaSellPage;
import utility.Parametrization;

public class SellPageTest {

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
		
		ZerodhaSellPage zerodhasellpage =new ZerodhaSellPage(driver);
		
		zerodhasellpage.SearchStock(driver,"Reliance");
		int number =zerodhasellpage.SearchResultNumbers();
		System.out.println(number);
		Assert.assertTrue(number>0);	
}
	@Test
	public void searchDesiredStockAndClickonSELL() {	
		ZerodhaSellPage zerodhasellpage =new ZerodhaSellPage(driver);
		zerodhasellpage.SearchStock(driver,"TATA");
		zerodhasellpage.searchstockClickonSELL(driver,"TATACOFFEE");
		zerodhasellpage.clickonSearchResultSell();
		zerodhasellpage.ClickonSelectedToSell();
}}
