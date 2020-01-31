package framework.Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testng_priority {
  @Test (priority=0)
  public void f() 
  {
	  Reporter.log("f method is executed",true);
  }
  
  @Test (priority=2)
  public void m() 
  {
	  Reporter.log("m method is executed",true);
  }
  
  @Test (priority=3)
  public void z() 
  {
	  Reporter.log("z method is executed",true);
  }
  
  @Test (priority=4)
  public void a() 
  {
	  Reporter.log("a method is executed",true);
  }
  
}
