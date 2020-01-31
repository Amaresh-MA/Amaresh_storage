package verification_commands;

import org.openqa.selenium.chrome.ChromeDriver;

public class Get_url {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AMAR'S\\eclipse-workspace\\chromedriver.exe");
		ChromeDriver chrome=new ChromeDriver();
		chrome.get("https://selenium.dev/");
		chrome.manage().window().maximize();
		String actual_url=chrome.getCurrentUrl();
		
		System.out.println(actual_url);
		
		String expecte_url="https://selenium.dev/";
		boolean flag=expecte_url.equals(actual_url);
		
		if(flag==true) 
		{
			System.out.println("the current web page url is verifide");
		
	}
		else
		{
			System.out.println("the current web page url is verifide");
			
		}
    }
}
	
