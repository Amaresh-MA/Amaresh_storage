package screenshot;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Screen_shot_at_location {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AMAR'S\\eclipse-workspace\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		
		// set screen shot location
		WebElement location=driver.findElementByXPath("(//a[@target='_blank'][contains(.,'Employers')])[2]");
		new Actions(driver).moveToElement(location).perform(); 
		Thread.sleep(5000);
		
		//take screen shot
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		// save screen shot in a file 
		FileUtils.copyFile(src, new File("screens\\locatedphic.png"));
		

	}

}
