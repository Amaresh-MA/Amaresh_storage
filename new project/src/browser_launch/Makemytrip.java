package browser_launch;

import org.openqa.selenium.chrome.ChromeDriver;

public class Makemytrip {

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\AMAR'S\\eclipse-workspace\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("http:\\makemytrip.com");
	driver.manage().window().maximize();
	driver.findElementByXPath("(//span[contains(@class,'tabsCircle appendRight5')])[2]").click();   			//round trip radio button
	driver.findElementById("fromCity").click();																	// selecting from city box
	driver.findElementByXPath("//input[@placeholder='From']").sendKeys("hyd");     								 // typing in from city box
	Thread.sleep(3000);
	driver.findElementByXPath("//p[@class='font14 appendBottom5 blackText'][contains(.,'Hyderabad, India')]").click();
	driver.findElementByXPath("//input[@placeholder='To']").sendKeys("del"); 									// typing in to city box
	driver.findElementByXPath("//p[@class='font14 appendBottom5 blackText'][contains(.,'Delhi, India')]").click();
	driver.findElementByCssSelector("div[aria-label='Sat Nov 30 2019']").click();
	driver.findElementByCssSelector("div[aria-label='Mon Dec 30 2019']").click();
	driver.findElementByXPath("//span[@class='lbl_input latoBold appendBottom10'][contains(.,'Travellers & CLASS')]").click();
	driver.findElementByXPath("//li[@data-cy='adults-1']").click();
	driver.findElementByXPath("//li[@data-cy='children-0']").click();
	driver.findElementByXPath("//li[@data-cy='infants-0']").click();
	driver.findElementByXPath("//li[contains(.,'Business')]").click();
	driver.findElementByXPath("//button[contains(.,'APPLY')]").click();
	// here i used cssSelector 
	/* syntax :   driver.findElementByCssSelector("tagname.classname");
	 * [.] dot is refers to class property 
	 */
	driver.findElementByCssSelector("a.primaryBtn.font24.latoBlack.widgetSearchBtn ").click(); // here i am clicking on search button 
	

	}

}
