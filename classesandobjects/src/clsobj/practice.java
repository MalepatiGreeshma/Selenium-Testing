package clsobj;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {

	public static void main(String[] args)throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver,chrome.driver","c://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://demoqa.com/text-box");
		d.findElement(By.id("userName")).sendKeys("greeshma");
		d.findElement(By.id("userEmail")).sendKeys("malepati.greesham2002@gmail.com");
		d.findElement(By.id("currentAddress")).sendKeys("bapuji nagar");
		d.findElement(By.id("permanentAddress")).sendKeys("bapuji nagar");
		Thread.sleep(2000);
		d.findElement(By.id("submit")).click();
		
		

	}

}
