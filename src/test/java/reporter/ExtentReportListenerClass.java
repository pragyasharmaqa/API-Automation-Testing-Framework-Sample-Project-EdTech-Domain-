package reporter;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class ExtentReportListenerClass implements ITestListener {

	public ExtentSparkReporter sparkreporter; //report, UI or location, theme
	public ExtentReports extent;		//for common info
	public ExtentTest test;			// creating a test entry in report and update the report
	
	public void onStart(ITestContext context) {
		sparkreporter = new ExtentSparkReporter("myreport.html"); 		//location
		sparkreporter.config().setDocumentTitle("Automation Test Report"); //title for report
		sparkreporter.config().setReportName("Regression Testing"); 	 //name of report
		sparkreporter.config().setTheme(Theme.DARK);		//theme of report
		
		extent = new ExtentReports();
		extent.attachReporter(sparkreporter);
		
		extent.setSystemInfo("Computername", "Local Server");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("OS", "Windows");
		extent.setSystemInfo("Browser", "Chrome");
		;
	}
	
	public void onTestStart(ITestResult result) {
		
	}
	
	public void onTestSuccess(ITestResult result) {
		test = extent.createTest(result.getName());
		test.log(Status.PASS, "Test case passed is " + result.getName());
		
	}
	
	public void onTestFailure(ITestResult result) {
		test = extent.createTest(result.getName());
		test.log(Status.FAIL, "Test case failed is " + result.getName());
	}
	
	public void onTestSkipped(ITestResult result) {
		test = extent.createTest(result.getName());
		test.log(Status.SKIP, "Test case skipped is " + result.getName());
	}
	
	public void onFinish(ITestContext context) {
		extent.flush();
	}
}
