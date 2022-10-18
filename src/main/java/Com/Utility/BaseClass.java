package Com.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static ConFigDataProvider config;
	public static ExcelDataProvider excel;
	
	@BeforeSuite
	public void BS() throws Exception {
		config=new ConFigDataProvider();
		excel=new ExcelDataProvider();
		
	}
	
	@Parameters("BrowerName")
	@BeforeMethod
	public void setup(String BrowerName) {
		
		if(BrowerName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(BrowerName.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
	
		driver.get(config.getBaseUrl());
		driver.manage().window().maximize();
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
