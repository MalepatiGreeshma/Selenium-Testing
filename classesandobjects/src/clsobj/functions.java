package clsobj;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class functions {
	 static ChromeDriver d;
	
	public void details()
	{
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/");
		d.manage().window().maximize();
		d.findElement(By.name("userName")).sendKeys("selenium");
		d.findElement(By.name("password")).sendKeys("123");
		d.findElement(By.name("submit")).click();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		functions f=new functions();
		f.details();
		
		

	}

}
