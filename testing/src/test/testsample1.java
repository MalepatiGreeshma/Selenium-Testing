package test;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class testsample1 {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.navigate().to("https://www.google.com");
		d.manage().window().maximize();
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		d.findElement(By.linkText("Gmail")).click();
		d.navigate().back();
		d.navigate().forward();
		Thread.sleep(2000);
		d.close();
		

	}

}
