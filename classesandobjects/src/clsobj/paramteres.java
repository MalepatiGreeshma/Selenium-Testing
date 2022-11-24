package clsobj;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class paramteres {
	 static ChromeDriver d;
	
	public void details( String username,String password)
	{
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/");
		d.manage().window().maximize();
		d.findElement(By.name("userName")).sendKeys("username");
		d.findElement(By.name("password")).sendKeys("password");
		d.findElement(By.name("submit")).click();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		paramteres p=new paramteres();
		p.details("greeshma","@05052002");
		
		

	}

}
