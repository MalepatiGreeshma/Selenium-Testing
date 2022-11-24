package virtusa;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://knowindia.india.gov.in/states-uts/");
		d.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)d;
		Thread.sleep(2000);
		WebElement g=d.findElement(By.xpath("//*[@id=\"fontSize\"]/section/div/div/div[2]/div[2]/div/div[1]/ul/li[1]/h3/a"));
		js.executeAsyncScript("arguments[0].scrollIntoView()",g);
	}

	}

