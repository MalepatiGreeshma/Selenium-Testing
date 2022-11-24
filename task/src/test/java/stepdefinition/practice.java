package stepdefinition;

import java.io.FileInputStream;

import java.io.IOException;

import java.util.Properties;
import org.openqa.selenium.chrome.ChromeDriver;
public class practice {
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream f=new FileInputStream("C:\\Users\\malepatigreeshma\\eclipse-workspace\\task\\src\\test\\java\\stepdefinition\\p1.properties");
		Properties p1=new Properties();
		p1.load(f);
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get(p1.getProperty("url"));
		practice2 p2=new practice2(d);
		p2.uname(p1.getProperty("uname"));
		p2.pass(p1.getProperty("pass"));
		p2.button();
		p2.back();
	}
		
		
	}
	

