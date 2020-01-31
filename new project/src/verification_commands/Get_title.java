package verification_commands;

import org.openqa.selenium.chrome.ChromeDriver;

public class Get_title {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AMAR'S\\eclipse-workspace\\chromedriver.exe");
		ChromeDriver chrome=new ChromeDriver();
		chrome.manage().window().maximize();
		chrome.get("https://selenium.dev/");
		String actual_title=chrome.getTitle();
		System.out.println("the current web page title is-->"+actual_title);
		Thread.sleep(4000);
		String ecpected_title="SeleniumHQ Browser Automation";
		
		boolean flag=actual_title.equals(ecpected_title);
		System.out.println("web page title verificationis-->"+flag);
		
		if(flag==true)
		{
			System.out.println("expected title prented at selenium home page");

	    }
		else
			throw new Exception("expected title not prented at selenium home page");
		

     }
}
