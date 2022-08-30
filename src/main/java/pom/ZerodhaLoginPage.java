package pom;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class ZerodhaLoginPage {

	@FindBy(xpath="//input[@id='userid']")private WebElement username;
	@FindBy(xpath="//input[@id='password']") private WebElement Password;
	@FindBy(xpath="//button[@class='button-orange wide']")private WebElement LogIn;
	@FindBy(xpath="//input[@id='pin']") private WebElement PIN;
	@FindBy(xpath="//button[@class='button-orange wide']") private WebElement SubmitPin;
	@FindBy(xpath="//a[text()='Forgot user ID or password?']") private WebElement ForgotPass;
	@FindBy(xpath="//a[@class='text-light']")private WebElement NewAccount;
	@FindBy(xpath="//img[@alt='Kite Android']") private WebElement playstore;
	@FindBy(xpath="//img[@alt='Kite iOS']")private WebElement appleSign;
	
	public ZerodhaLoginPage(WebDriver driver) {
	
		PageFactory.initElements(driver, this);
	}
	public void EnterName(String name) {
		username.sendKeys(name);
	}
	
	public void Enterpassword(String pass)
	{              
      Password.sendKeys(pass);
	}
	//*************************************EXPLICITE WAIT for password element*******************************************
//	      public void Enterpassword(String pass,WebDriver driver) {
//          WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(5000));                             
//		wait.until(ExpectedConditions.visibilityOf(Password));
//		Password.sendKeys(pass);}
	//*******************************************************************************************************************
	
	public void ClickonLogin()
	{
		LogIn.click();
	}
	public void EnterPin(String pin) {
	PIN.sendKeys( pin);
	}
	public void ClickonPIN() {
		SubmitPin.click();
	}
	public void ClickonForgot()
	{
	ForgotPass.click();}
	public void SwichToForgotPopup(WebDriver driver) {
		Set<String> handle = driver.getWindowHandles();
	      Iterator <String> i =handle.iterator();
	while(i.hasNext())
		{
		String popup = i.next();
		driver.switchTo().window(popup);
		   String Title=driver.getTitle();
		   if (Title.equals(""));{
		   break;
		}}}
	
	public void ClickonNewAccount() {
		NewAccount.click();
	}
	public void ClickonPlaystore() {
		playstore.click();
	}
	public void ClickonApple() {
		appleSign.click();}
	}
	

////WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(2000));
//	wait.until(ExpectedConditions.visibilityOf(Password));