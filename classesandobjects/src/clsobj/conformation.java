package clsobj;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class conformation {
	
		WebDriver d;
		public void open_browser()
		{
			System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
			 d=new ChromeDriver();
			d.get("https://demoqa.com/alerts");
			d.manage().window().maximize();
		}

		public void Title()
		{
			System.out.println(d.getTitle());
			
		}
		public void Url()
		{
			String b=d.getCurrentUrl();
			System.out.println(b);
		}
		public void alert_message()throws InterruptedException
		{
			d.findElement(By.id("confirmButton")).click();
			Alert alt=d.switchTo().alert();
			System.out.println(alt.getText());
			Thread.sleep(2000);
			alt.accept();
			WebElement text=d.findElement(By.id("confirmResult"));
			System.out.println(text.getText());
		}
		public void close()
		{
			d.close();
		}
		public static void main(String[] args)throws InterruptedException
		{
			
			conformation a1=new conformation();
			a1.open_browser();
			a1.Title();
			a1.Url();
			a1.alert_message();
			a1.close();
		}

		

	
}
