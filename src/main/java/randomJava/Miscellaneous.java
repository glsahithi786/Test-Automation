package randomJava;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.os.WindowsUtils;
import org.apache.commons.io.FileUtils;


public class Miscellaneous {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		 


		 System.setProperty("webdriver.chrome.driver","C:\\Users\\lganti\\OneDrive - Planit Test Management Solutions Pty Ltd\\Documents\\Learnings\\chromedriver_win32\\chromedriver.exe");
		 
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			WindowsUtils.killByName("excel.exe");
		
		//	driver.manage().deleteCookieNamed("sessionKey");
		
		//click on any link
			//login page- verify login url
			
			
		/*	driver.get("http://google.com");
			
			File src=	 ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src,new File("C:\\Users\\rahul\\screenshot.png"));*/
		
		
	}

}
