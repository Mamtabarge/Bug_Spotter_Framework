package Com.Utility;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listeners extends BaseClass  implements ITestListener {
	
	ExtentReports extent=ExtentReportGenrator.getReports();
	
	ThreadLocal<ExtentTest> extentTest=new ThreadLocal<ExtentTest>();
	

	public void onTestStart(ITestResult result) {
		Library.test=extent.createTest(result.getClass().getName()+"=="+result.getMethod().getMethodName());
		extentTest.set(Library.test);
	}

	public void onTestSuccess(ITestResult result) {
		
		extentTest.get().log(Status.PASS, "Test Case Pass");
		Library.test.addScreenCaptureFromBase64String(getcapture());
		
	}

	public void onTestFailure(ITestResult result) {
		
		extentTest.get().log(Status.FAIL, "Test Case Fail");
	}

	public void onTestSkipped(ITestResult result) {
		
		extentTest.get().log(Status.SKIP, "Test Case Skip");
	}

	public void onFinish(ITestContext context) {
		
		extent.flush();
		
	}
	public static String  getcapture() {
		TakesScreenshot ts=(TakesScreenshot) driver;
		return ts.getScreenshotAs(OutputType.BASE64);
		
		
			
	}
	

}
