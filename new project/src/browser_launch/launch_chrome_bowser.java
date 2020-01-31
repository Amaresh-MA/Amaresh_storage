package browser_launch;

import org.openqa.selenium.chrome.ChromeDriver;

public class launch_chrome_bowser 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AMAR'S\\eclipse-workspace\\chromedriver.exe");	
		ChromeDriver chrome=new ChromeDriver();
		
		chrome.manage().window().maximize();
		chrome.get("http://twitter.com");
		Thread.sleep(5000);
		chrome.findElementByXPath("//a[@class='js-nav EdgeButton EdgeButton--medium EdgeButton--primary StaticLoggedOutHomePage-buttonSignup'][contains(.,'Sign up')]").click();
		//chrome.get("https://twitter.com/signup");
		//chrome.findElementByName("firstname").sendKeys("amaresh"+Keys.ENTER);
		//chrome.findElementByName("lastname").sendKeys("babu");
		
		

	}
}
