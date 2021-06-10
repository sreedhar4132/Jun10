package frame;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG {

	public static ExtentReports extent;
	public static ExtentTest test;
	public static ExtentSparkReporter repoter;
	 
	 
	public static ExtentReports getReportObject()
	{
		String path=System.getProperty("user.dir")+"\\reports\\index-%d{yyyy-MM-dd-HH-mm-ss}.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setReportName("web application");
		reporter.config().setDocumentTitle("test results");
		
		extent=new ExtentReports();
	    extent.attachReporter(reporter);
	    extent.setSystemInfo("tester","sreedhar");
	    return extent;
	}
	
}
