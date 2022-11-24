package virtusa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pom1 {
	WebDriver d;
	By Fname=By.name("firstName");
	By Lname=By.name("lastName");
	By num=By.name("phone");
	By email=By.name("userName");
	pom1(WebDriver d)
	{
		this.d=d;
	}
	public void firstname()
	{
		d.findElement(Fname).sendKeys("greeshma");	
			
	}
	public void lastname()
	{
		d.findElement(Lname).sendKeys("malepati");		
	}
	public void number()
	{
		d.findElement(num).sendKeys("85208707050");
	}
	
	public void emailid()
	{
		d.findElement(email).sendKeys("malepati.greeshma2002@gmail.com");
	}
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/register.php");
		d.manage().window().maximize();
		pom1 p1=new pom1(d);
		p1.firstname();
		p1.lastname();
		p1.number();
		p1.emailid();
		
	}



}


	