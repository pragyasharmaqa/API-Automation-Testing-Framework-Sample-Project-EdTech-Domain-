package reporter;

import org.testng.ITestContext;
import org.testng.ITestListener;
//import org.testng.ITestNGListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener {

	public void onStart(ITestContext context) {
		// not implemented
		System.out.println("Test execution is started...");
	}

	public void onTestStart(ITestResult result) {
		System.out.println("Test method execution is started...");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test passed");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("failed");
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test skipped");
	}
	
	public void onFinish(ITestContext context) {
		System.out.println("Test Execution is finished");
	  }
}
