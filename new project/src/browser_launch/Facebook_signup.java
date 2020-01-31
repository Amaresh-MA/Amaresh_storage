package browser_launch;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_signup 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AMAR'S\\eclipse-workspace\\chromedriver.exe");
		ChromeDriver chrome=new ChromeDriver();
		chrome.get("https://www.facebook.com/");
		chrome.manage().window().maximize();
		chrome.findElementByName("firstname").sendKeys("amaresh"+Keys.ENTER);
		chrome.findElementByName("lastname").sendKeys("babu"+Keys.ENTER);
		chrome.findElementById("u_0_r").sendKeys("1234567891"+Keys.ENTER);
		chrome.findElementById("u_0_w").sendKeys("12345678"+Keys.ENTER);

	}

}
