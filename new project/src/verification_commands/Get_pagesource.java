package verification_commands;

import org.openqa.selenium.chrome.ChromeDriver;

public class Get_pagesource {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AMAR'S\\eclipse-workspace\\chromedriver.exe");
		ChromeDriver chrome=new ChromeDriver();
		chrome.get("http:\\makemytrip.com");
		chrome.manage().window().maximize();
		String page_source=chrome.getPageSource();
		
		System.out.println("the current web page source is-->"+page_source);
		

	}

}
