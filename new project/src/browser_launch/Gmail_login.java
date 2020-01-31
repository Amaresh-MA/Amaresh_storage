package browser_launch;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_login {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AMAR'S\\eclipse-workspace\\chromedriver.exe");
		ChromeDriver chrome=new ChromeDriver();
		chrome.get("http:\\gmail.com");
		chrome.findElementById("identifierId").sendKeys("amaresh77"+Keys.ENTER);
		Thread.sleep(5000);
		chrome.findElementByXPath("//input[contains(@type,'password')]").sendKeys("amaresh77"+Keys.ENTER);
		

	}

}
