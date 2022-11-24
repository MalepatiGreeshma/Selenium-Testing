package gridpackage;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class prog2 {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		String nodeurl="http://localhost:4444/wd/hub";
		String baseurl="https:www.google.com";
		DesiredCapabilities cap=DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		WebDriver d=new RemoteWebDriver(new URL(nodeurl),cap);
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		d=new ChromeDriver();
		d.get(baseurl);
		d.manage().window().maximize();
		d.findElement(By.name("q")).sendKeys("manual testing");
		d.findElement(By.name("btnK")).click();
		d.close();
		

	}

}
