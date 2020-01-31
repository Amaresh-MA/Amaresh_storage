package browser_launch;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Rediffsignup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AMAR'S\\eclipse-workspace\\chromedriver.exe");

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		driver.findElementByCssSelector("input[name^='name']").sendKeys("amaresh");
		driver.findElementByCssSelector("input[name^='login']").sendKeys("amaresh77");
		driver.findElementByCssSelector("input[value^='Check availability']").click();
	//driver.findElementByCssSelector("input[value^='mr.amaresh77']").click();
		driver.findElementByCssSelector("input[name^='passwd']").sendKeys("Iamtyping77@");
		driver.findElementByCssSelector("input[name^='confirm_passwd']").sendKeys("Iamtyping77@");
		driver.findElementByCssSelector("input[name^='altemail']").sendKeys("amaramaresh77@gmail.com");
		driver.findElementByCssSelector("input[name^='mobno']").sendKeys("9988776655");
		new Select(driver.findElementByCssSelector("select[name^='DOB_Day']")).selectByValue("01");
		new Select(driver.findElementByCssSelector("select[name^='DOB_Month']")).selectByValue("01");
		new Select(driver.findElementByCssSelector("select[name^='DOB_Year']")).selectByValue("1999");
		new Select(driver.findElementByCssSelector("select[name^='city']")).selectByValue("Hyderabad");
		
		
		

	}

}
