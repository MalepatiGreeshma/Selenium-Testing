package virtusa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pom {
		WebDriver d;
		By username=By.name("userName");
		By password=By.name("password");
		By button=By.name("submit");
		pom(WebDriver d)
		{
			this.d=d;
		}
		public void uname()
		{
			d.findElement(username).sendKeys("greeshma");	
				
		}
		public void pass()
		{
			d.findElement(password).sendKeys("@05052002");		
		}
		public void button1()
		{
			d.findElement(button).click();
		}
		public static void main(String args[])
		{
			System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
			ChromeDriver d=new ChromeDriver();
			d.get("https://demo.guru99.com/test/newtours/");
			d.manage().window().maximize();
			pom p1=new pom(d);
			p1.uname();
			p1.pass();
			p1. button1();
			
			
		}

	

}
