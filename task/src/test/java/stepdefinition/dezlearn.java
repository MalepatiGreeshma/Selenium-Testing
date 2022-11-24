package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class dezlearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.dezlearn.com/webtable-example/");
		d.manage().window().maximize();
		String a="//*[@id=\"post-9373\"]/div/div/div/div/section/div/div/div/div/div/section/div/div/div/div/div/div/div/table/tbody/tr[";
		String b="]/td[";
		String e="]";
		for(int i=2;i<=7;i++) {
			for(int j=1;j<=2;j++) {
				String c=d.findElement(By.xpath(a+i+b+j+e)).getText();
				System.out.println(c);
			}
		}
	}
	
}


