package Com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenrator {
	

    public static ExtentReports extent;
	public static ExtentReports getReports() {
		//ExtentSSparkReporter
		//ExtentReports
		String reportPath="C:\\Users\\Shubhu\\eclipse-workspace\\Bug_Spotter_Framework\\Report\\index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(reportPath);
		reporter.config().setDocumentTitle("AutomationTest Report");
		reporter.config().setReportName("BugSpotter_Framework");
		reporter.config().setTheme(Theme.STANDARD);
		
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		
		extent.setSystemInfo("ProjectName", "Bug_Spotter_Framework");
		extent.setSystemInfo("Module", "Automation_Test_Module");
		extent.setSystemInfo("Tool", "Selenium");
		extent.setSystemInfo("QA Name", "Mamta");
		return extent;
		
		
		
		
		
	}
	
	
}
