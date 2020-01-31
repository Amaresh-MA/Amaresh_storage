package cleartrip;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newswap {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AMAR'S\\eclipse-workspace\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http:\\cleartrip.com");
		Thread.sleep(5000);
		driver.findElement(By.id("RoundTrip")).click();
		Thread.sleep(13000);
		driver.findElementByXPath("//a[@class='iconSprite switchFields']").click();
		

	}

}
