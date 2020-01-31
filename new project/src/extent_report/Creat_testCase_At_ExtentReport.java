package extent_report;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Creat_testCase_At_ExtentReport {

	public static void main(String[] args) 
	{
	String Filepath="C:\\Users\\AMAR'S\\eclipse-workspace\\new project\\ExtentReports\\report2.html";
	ExtentReports logger=new ExtentReports(Filepath, true);
	System.out.println("file report is created");
	
	ExtentTest test1=logger.startTest("TC001-login_valid");
	logger.endTest(test1);
	
	ExtentTest test2=logger.startTest("TC002-login_invalid");
	logger.endTest(test2);
	
	ExtentTest login=logger.startTest("login-test");
	login.appendChild(test1).appendChild(test2);
	logger.endTest(login);
	
	
	logger.flush();
	

	}

}
