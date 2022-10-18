package Com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com.Utility.BaseClass;
import Com.Utility.Library;
import Com.pages.LoginPom;

public class Test1 extends BaseClass {
	
	
	@Test
	public void verifytest1() {
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		Library.custom_sendkeys(login.gettxt_email(), excel.getStringData("Sheet1", 0, 0),"Email");
		Library.custom_sendkeys(login.gettxt_password(), excel.getStringData("Sheet1", 0, 1),"Password");
		Library.custom_click(login.getbtn_login(),"Login Button");
		
	
		
	}

}
