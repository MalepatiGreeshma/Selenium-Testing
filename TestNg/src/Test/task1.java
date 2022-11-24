package Test;

import org.testng.annotations.Test;

public class task1 {
  @Test(priority=1)
  public void open_browser()
  {
	  System.out.println("application opened successfully");
  }
  @Test(priority=5)
  public void Customerdetails() {
	  System.out.println("product is successfully updated");
  }
  @Test(priority=2)
  public void paymentdetails()
  {
	  System.out.println("payment done through credit card");
  }
  @Test(enabled=false)//skip
  public void deliveryprocess()
  {
	  System.out.println("delivered to right address");
	  
  }
  @Test(priority=3)
  public void feedbackprocess()
  {
	  System.out.println("feedback successfully collected from customer");
	  
  }
  @Test(priority=6)
  public void logoff()
  {
	  System.out.println("application successsfully closed");
	  
  }
  
}
