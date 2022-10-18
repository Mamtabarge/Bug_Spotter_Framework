package Com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConFigDataProvider {
	
	Properties pro;
	
	public ConFigDataProvider() throws Exception {
		
		String filepath="C:\\Users\\Shubhu\\eclipse-workspace\\Bug_Spotter_Framework\\Config\\Config.Properties";
		FileInputStream fis=new FileInputStream(filepath);
		
		pro=new Properties();
		pro.load(fis);	
	}
	
	public String getBaseUrl() {
		return pro.getProperty("BaseUrl");
	}

}
