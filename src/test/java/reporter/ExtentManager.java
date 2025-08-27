package reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

	private static final ExtentReports extent = new ExtentReports();
	private static final ExtentSparkReporter spark = new ExtentSparkReporter("test-output/ExtentReport.html");
	
	static {
		extent.attachReporter(spark);
	}
	
	public static ExtentReports getInstance() {
		return extent;
	}
}
