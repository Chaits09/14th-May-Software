package utility;

import com.aventstack.extentreports.ExtentReports;

import com.aventstack.extentreports.reporter.ExtentSparkReporter; 

public class Reports {

	public static ExtentReports generatereports() {
		ExtentSparkReporter htmlReporter = new ExtentSparkReporter("ProjectReport.html");
		ExtentReports reports = new ExtentReports();
		
		 reports.attachReporter(htmlReporter);
		 reports.setSystemInfo("Suit", "Regression");
		 reports.setSystemInfo("Tuesday", "Chaits");
		 
		return reports;
	}
	
}
