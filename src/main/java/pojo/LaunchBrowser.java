package pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchBrowser {

	public static WebDriver ChromeBrowser() {
		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--disable-notifications");//
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chait\\OneDrive\\Documents\\software\\chromedriver.exe");
		
		
		WebDriver driver= new ChromeDriver(option);          //pass option in argument
		driver.navigate().to("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		return driver;
			
	}	
	
    }
