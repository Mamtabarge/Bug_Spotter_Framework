package Com.Utility;

import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Library {
	
	public static ExtentTest test; 
	
	
	//Sendkeys()
	public static void custom_sendkeys(WebElement element,String value,String fieldname) {
		try {
			element.sendKeys(value);
			test.log(Status.PASS, fieldname+"Value Successfully send=="+value);
		}catch(Exception e) {
			test.log(Status.FAIL, e.getMessage());
		}
	}
	//Click()
	public static void custom_click(WebElement element, String fieldname ) {
		try {
			element.click();
			test.log(Status.PASS, "Clicked succesfully=="+fieldname);
		}catch(Exception e) {
		    test.log(Status.FAIL, e.getMessage());
		    
			
		}
	}
	

}
