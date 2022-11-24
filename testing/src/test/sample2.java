package test;

import org.openqa.selenium.By;


import org.openqa.selenium.chrome.ChromeDriver;

public class sample2 {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.amazon.com");
		d.manage().window().maximize();
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		d.findElement(By.id("searchDropdownBox")).sendKeys("Deals");
		d.findElement(By.id("twotabsearchtextbox")).sendKeys("laptops");
		boolean selected=d.findElement(By.id("twotabsearchtextbox")).isSelected();
		d.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
		
		
		System.out.println(selected);
		
		d.close();
		

	}

}

