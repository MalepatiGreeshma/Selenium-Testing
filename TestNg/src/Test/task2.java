package Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class task2 {
	 WebDriver d;
	 @Test(priority=1)
	 public void open_browser()
	 {
		 System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		 d=new ChromeDriver();
		 d.get("https://www.amazon.com");
		 d.manage().window().maximize();
  }
	 @Test(priority=2)
	 public void getTitle()
	 {
		 System.out.println(d.getTitle());
		 
	 }
	 @Test(priority=3)
	 public void getCurrentUrl()
	 {
		 System.out.println(d.getCurrentUrl());
		 
	 }
	 @Test(priority=4)
	 public void Screenshots()throws InterruptedException, IOException
	 {
		File a1=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(a1,new File("C:\\Users\\malepatigreeshma\\OneDrive\\Pictures//pic2.png"));
	 }
	 @Test(priority=5)
	 public void close()
	 {
		 d.close();
	 }
	 
}

