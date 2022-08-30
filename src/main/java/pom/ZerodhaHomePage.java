package pom;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZerodhaHomePage {
	
@FindBy(xpath="// input[@icon='search']") private WebElement searchBox;
@FindBy(xpath="//span[@class='tradingsymbol']") private List<WebElement> searchresult;  //list<webelements>
	@FindBy(xpath="//button[@data-balloon='Buy']") private WebElement searchBUY;
@FindBy(xpath="//button[@class='submit']") private WebElement ActualBuy;
@FindBy(xpath="//input[@label='Qty.']") private WebElement ChangeQuantity;
@FindBy(xpath="//span[text()='Orders']") private WebElement orders;
@FindBy(xpath="//button[@class='button-outline cancel']") private WebElement Cancelstock;

public ZerodhaHomePage(WebDriver driver)  {
PageFactory.initElements(driver, this);}

public void SearchStock(String stock,WebDriver driver) {
	
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(1000));
	wait.until(ExpectedConditions.visibilityOf(searchBox));
	searchBox.sendKeys(stock);
}
 public int getsearchResultNumber() {  
	int listSize=searchresult.size();
	
          return listSize;
}
public void SearchStockClickonBUY(WebDriver driver,String Requiredstock) { 
	for(int a=0;a<searchresult.size();a++) 
	{
		WebElement s= searchresult.get(a);
		  String stockname=s.getText();
		  if(stockname.equals(Requiredstock));
		  {
	Actions action=new Actions(driver);
	action.moveToElement(s);
	action.perform();
	break;
	      }}}
public void ClickonSearchResultBuy() {	 
//	WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(1000));
//	wait.until(ExpectedConditions.visibilityOf(searchBUY));
	searchBUY.click();
}
 public void ClickToChangeQuantity(String quantity) {
	 ChangeQuantity.sendKeys( quantity);
 }
		public void ClickonActualShareToBUY() {
		ActualBuy.click();	
}
		public void ClickonCancelToSelectedStock() {
			Cancelstock.click();
		}
		public void ClickonOrders() {
			orders.click();
		}
		}

//@FindBy(xpath="//span[text()='Dashboard']") private WebElement dashboard;	
//
//@FindBy(xpath="//span[text()='Orders']") private WebElement order;	
//
//@FindBy(xpath="//span[text()='Holdings']") private WebElement holding ;	
//
//@FindBy(xpath="//span[text()='Positions']") private WebElement position ;