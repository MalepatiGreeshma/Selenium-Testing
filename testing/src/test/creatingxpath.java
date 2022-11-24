package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class creatingxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d = new FirefoxDriver();
		d.get("https://www.gmail.com");
		d.manage().window().maximize();
		d.get("https://www.amazon.in");
		d.navigate().back();
		d.close();
		

	}

}
