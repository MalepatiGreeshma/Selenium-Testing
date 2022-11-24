package clsobj;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clss {
	WebDriver d;

		public void open_chrome() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.amazon.com/");
		d.manage().window().maximize();
		}
		public void get_current_url()
	{
		System.out.println(d.getCurrentUrl());

	}
	public void drop() {
		WebElement a=d.findElement(By.id("searchDropdownBox"));
		List<WebElement> a1=a.findElements(By.tagName("option"));
		System.out.println(a1.size());
		for(int i=0;i<a1.size();i++)
		{
			
		}
		
	}

}
