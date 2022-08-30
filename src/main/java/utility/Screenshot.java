package utility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;



public class Screenshot {

	
		public static void takeScreenShot(WebDriver driver,String name) throws IOException {  //return type is void so return statement reqd
			
            String date=Screenshot.getDate();
		TakesScreenshot click=((TakesScreenshot)driver);
		
		File source=click.getScreenshotAs(OutputType.FILE);
		
		File destination= new File("C:\\Users\\chait\\OneDrive\\Documents\\KiteZerodha\\screenshot"+"name"+""+date+".jpg");
	
		FileHandler.copy(source, destination);
		
	
	}
	public static String getDate()  {
		DateTimeFormatter dtf= DateTimeFormatter.ofPattern("yyyy-MMM-dd HH-mm-ss");// MMM to get month name in alphabet
		LocalDateTime currentTime = LocalDateTime.now();
		String d =dtf.format(currentTime);
		return d;
	}
	
}

		
	
	
	
	
	
	
	
	
	

