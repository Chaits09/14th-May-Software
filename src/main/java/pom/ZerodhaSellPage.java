package pom;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZerodhaSellPage {

@FindBy(xpath="// input[@icon='search']") private WebElement search;
@FindBy(xpath="//span[@class='tradingsymbol']")private List<WebElement> searchmultiple; 
@FindBy(xpath="//button[@data-balloon='Sell']") private WebElement SELL;
@FindBy(xpath="//button[@class='submit']") private WebElement actualsell;

public ZerodhaSellPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void SearchStock(WebDriver driver,String stock) {
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(1000));
	wait.until(ExpectedConditions.visibilityOf(search));
	search.sendKeys(stock);
}
	public int SearchResultNumbers() {
	int listofstocks=searchmultiple.size();
	return listofstocks;
	}
	public void searchstockClickonSELL(WebDriver driver,String RequiredStock) {
		
	for(int a=0;a<searchmultiple.size();a++)
	{
	 WebElement s=searchmultiple.get(a);
	     String stockname =s.getText();
	   
	     if(stockname.equals(RequiredStock));
	     {
	    	Actions action=new Actions(driver);
	    	action.moveToElement(s);
	    	action.perform();
	    	break;
	    	}}}
	    public void clickonSearchResultSell() {
	    	SELL.click();
	    }
	    public void ClickonSelectedToSell() {
	    	actualsell.click();
	    }
}
	
