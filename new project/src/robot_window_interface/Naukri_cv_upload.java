package robot_window_interface;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri_cv_upload {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AMAR'S\\eclipse-workspace\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElementById("uploadBtnCont").click();
		
		String text="C:\\Users\\AMAR'S\\Desktop\\Democv.doc";
		
		StringSelection Stext=new StringSelection(text);
		//get system clipboard
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		Thread.sleep(5000);
		
		//Set Selection string content to clipboard
		clipboard.setContents(Stext, Stext);
		
		Robot robot=new Robot();
		robot.setAutoDelay(500);
		
		
		
		//Use Keyboard short Cntrl+V to copy text into Notepad interface
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_V);
				
				//Press Enter key
				robot.keyPress(KeyEvent.VK_ENTER);
				
				//Release Control Key
				robot.keyRelease(KeyEvent.VK_CONTROL);
	}

}
