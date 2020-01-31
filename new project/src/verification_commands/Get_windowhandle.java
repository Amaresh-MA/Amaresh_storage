package verification_commands;

import org.openqa.selenium.chrome.ChromeDriver;

public class Get_windowhandle {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AMAR'S\\eclipse-workspace\\chromedriver.exe");
		ChromeDriver chrome=new ChromeDriver();
		chrome.get("http:\\makemytrip.com");
		chrome.manage().window().maximize();
		String window_Id=chrome.getWindowHandle();
		System.out.println(window_Id);

	}

}
