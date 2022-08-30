package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class ZerodhaBuyPage {
	
 @FindBy(xpath="//button[@data-balloon='Market depth widget']") private WebElement marketdepth;
 @FindBy(xpath="//div[@class='app page-dashboard']") private WebElement chart;
 @FindBy(xpath="//div[@class='app page-dashboard']") private WebElement delete;
 @FindBy(xpath="//input[@label='Qty.']") private WebElement ChangeQuantity;
 @FindBy(xpath="//span[text()='Orders']") private WebElement orders;
 @FindBy(xpath="//button[@class='button-outline cancel']") private WebElement Cancelstock;
 @FindBy(xpath="//button[@data-balloon='Buy']") private WebElement searchBUY;
 @FindBy(xpath="//button[@class='submit']") private WebElement ActualBuy;

public ZerodhaBuyPage(WebDriver driver) {
PageFactory.initElements(driver,this);	
}
public void ClickToChangeQuantity(String quantity) {
	 ChangeQuantity.sendKeys(quantity);
}
		public void ClickonActualShareToBUY() {
		// WebDriverWait wait= new WebDriverWait(driver,Duration.ofMillis(1000));
		//	wait.until(ExpectedConditions.visibilityOf(ActualBuy));
		ActualBuy.click();	
}
		public void ClickonCancelToSelectedStock() {
			Cancelstock.click();}
		
		public void ClickonOrders() {
			orders.click();
		}
		public void ClickonSearchResultBuy() {	 
//			WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(1000));
//			wait.until(ExpectedConditions.visibilityOf(searchBUY));
			searchBUY.click();}}