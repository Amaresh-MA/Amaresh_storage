package extent_report;

import com.relevantcodes.extentreports.ExtentReports;

public class Create_extent_report {

	public static void main(String[] args) 
	{
		String Filepath="C:\\Users\\AMAR'S\\eclipse-workspace\\new project\\ExtentReports\\report1.html";
		ExtentReports logger=new ExtentReports(Filepath, true);
		System.out.println("report is created");
		logger.flush();
		

	}

}
