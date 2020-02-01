package testNGfiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class TestBase {
	public WebDriver driver = null;
	@Test
	public void login() throws IOException {
	
		Properties prop= new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\soumya balu\\eclipse-workspace\\Framework\\src\\testNGfiles\\datadriven.properties");
		prop.load(fis);
		//System.out.println(prop.getProperty("username"));
		//driver.findelement(By.xpath:'').sendkeys(username);

		if(prop.getProperty("browser").equals("firefox")){
		
	     System.setProperty("webdriver.gecko.driver","C:\\Users\\soumya balu\\workspace\\New folder\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(prop.getProperty("browser").equals("chrome")) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\soumya balu\\workspace\\New folder\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else {
		 
			System.setProperty("webdriver.ie.driver","C:\\Users\\soumya balu\\workspace\\New folder\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.get(prop.getProperty("url"));
		
	}
	
	
	
	
	@Test
	public void software() {
	System.out.println("I am the test");
	
}

}
