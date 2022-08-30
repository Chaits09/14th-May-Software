package pom;

import java.util.Set;
import java.util.Iterator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class zerodhaSignUpPage {
	
	@FindBy(xpath="//a[@class='text-light']")private WebElement dontHaveAccount;
	@FindBy(xpath="//input[@id='user_mobile']")private WebElement MobileNo;
	@FindBy(xpath="//button[@id='open_account_proceed_form']") private WebElement SubmitMobNo;
	@FindBy(xpath="//a[@href='/open-account/nri']")private WebElement ClickonNRI;

	@FindBy(xpath="(//a[text()='About'])[1]")private WebElement About;
	@FindBy(xpath="(//a[text()='Products']")private WebElement Product;
	
	
	
	public  zerodhaSignUpPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickondontHaveAccount() {
		dontHaveAccount.click();
	}
	public void SwitchToSignUpPopup(WebDriver driver) {
		    Set<String> handles =driver.getWindowHandles();
		   Iterator<String> i= handles.iterator();
		   while(i.hasNext()) {
			   String popup=i.next();
			   driver.switchTo().window(popup);
			        String Title=driver.getTitle();
			        if(Title.equals("Signup and open a Zerodha trading and demat account online and start"));
			        {
			        break;
			        }
		   }
	}
	
	public void EnterMobile(String Mob) {
		MobileNo.sendKeys(Mob);
	}
	public void SubmitMobileNumber() {
		SubmitMobNo.click();
	}
	public void NRIaccount() {
	ClickonNRI.click();	
	}
	
	public void ClickonAbout() {
		About.click();
	}
	public void ClickonProduct() {
		Product.click();
	}
	
}
