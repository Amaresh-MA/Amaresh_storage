package extent_report;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;



public class ExtentReport_using_screenshot {

	public static void main(String[] args) throws IOException, Exception 
	{
		WebDriver driver;
		String driver_path="C:\\Users\\AMAR'S\\eclipse-workspace\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driver_path);
		driver=new ChromeDriver();
		driver.get("http:\\facebook.com");
		driver.manage().window().maximize();
		
		
		
		String Filepath="C:\\Users\\AMAR'S\\eclipse-workspace\\new project\\ExtentReports\\fbscreen.html";
		ExtentReports logger=new ExtentReports(Filepath, true);
		System.out.println("file report is created");
		
		ExtentTest test1=logger.startTest("FB_homePage");
		
		String fbscreen_path="C:\\Users\\AMAR'S\\eclipse-workspace\\new project\\screens\\fbimage.png";
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(fbscreen_path));
		
		test1.log(LogStatus.PASS, "fb home page is displayed "+test1.addScreenCapture(fbscreen_path));
		Thread.sleep(5000);
		
		logger.endTest(test1);
		
		logger.flush();
	}

}
