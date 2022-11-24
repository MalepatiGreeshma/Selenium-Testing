package jar;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class internal {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream f=new FileInputStream("C:\\Users\\malepatigreeshma\\eclipse-workspace\\jarfile1\\src\\jar\\internal.properties");
		Properties p1=new Properties();
		p1.load(f);
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get(p1.getProperty("url"));
		d.findElement(By.name("userName")).sendKeys(p1.getProperty("uname"));
		d.findElement(By.name("password")).sendKeys(p1.getProperty("password"));
		d.manage().window().maximize();

	}

}
