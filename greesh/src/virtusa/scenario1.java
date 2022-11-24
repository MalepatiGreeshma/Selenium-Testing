package virtusa;

import org.openqa.selenium.chrome.ChromeDriver;

public class scenario1 {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		
						System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
						ChromeDriver d=new ChromeDriver();
						d.get("http://www.amazon.com");
						d.manage().window().maximize();
						System.out.println(d.getCurrentUrl());
						System.out.println(d.getTitle());
						Thread.sleep(2000);
						d.close();


	}

}
