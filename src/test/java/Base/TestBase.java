package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;

public class TestBase {
	
	public  static FirefoxDriver driver ;
	public static Properties OR= new Properties();
	public static FileInputStream fis;
	public static Properties Sendkeys = new Properties();
	public static FileInputStream key;
	
	
	@BeforeSuite
	public void di() throws IOException {
		
		if(driver == null) {
			
			fis = new FileInputStream("C:\\Users\\dell\\eclipse-workspace\\wednesday\\src\\test\\resources\\Properties\\OR.properties");
			OR.load(fis);
		}
		
		if (driver==null) {
			key = new FileInputStream("C:\\Users\\dell\\eclipse-workspace\\wednesday\\src\\test\\resources\\Properties\\Sendkey.properties");
			Sendkeys.load(key);
		}
		
		driver = new FirefoxDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
	}

}
