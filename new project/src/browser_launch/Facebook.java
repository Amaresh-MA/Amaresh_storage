package browser_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AMAR'S\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http:\\facebook.com");
		driver.manage().window().maximize(); 
		driver.findElement(By.id("email")).sendKeys("amaresh77");
		driver.findElement(By.id("pass")).sendKeys("12345678");
		
		

	}

		
}


