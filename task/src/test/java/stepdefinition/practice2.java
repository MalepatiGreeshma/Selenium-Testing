package stepdefinition;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import stepdefinition.practice2;

public class practice2 {
	WebDriver d;
	By username=By.name("userName");
	By pass=By.name("password");
	By button=By.name("submit");
	By button2=By.xpath("html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]");
	practice2(WebDriver d)
	{
		this.d=d;
	}
	public void uname(String uname)
	{
		d.findElement(username).sendKeys(uname);	
			
	}
	public void pass(String password)
	{
		d.findElement(pass).sendKeys(password);		
	}
	public void button()
	{
		d.findElement(button).click();
	}
	public void back() throws IOException
	{
		d.navigate().back();
		d.findElement(button2).click();
		FileInputStream f=new FileInputStream("C:\\Users\\malepatigreeshma\\AppData\\Roaming\\Microsoft\\Windows\\Network Shortcuts\\practice.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("Sheet1");
		Row r=null;
		Cell c=null;
		d.manage().window().maximize();
		WebElement drop=d.findElement(By.name("country"));
		List<WebElement>drop1=drop.findElements(By.tagName("option"));
		System.out.println(drop1.size());
		for(int i=0;i<drop1.size();i++)
		{
			String s=drop1.get(i).getText();
			r=ws.createRow(i);
			r.createCell(0).setCellValue(s);
			//r.createCell(1).setCellValue("sheet1");
			
		}
		
		FileOutputStream f1=new FileOutputStream("C:\\Users\\malepatigreeshma\\AppData\\Roaming\\Microsoft\\Windows\\Network Shortcuts\\practice.xlsx");
		wb.write(f1);
		File a1=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(a1,new File("C:\\Users\\malepatigreeshma\\OneDrive\\Pictures\\greesh.png"));
		
		d.close();
	}
}
	
		
	



