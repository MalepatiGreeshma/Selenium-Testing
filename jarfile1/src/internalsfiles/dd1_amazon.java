package internalsfiles;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dd1_amazon {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
			ChromeDriver d=new ChromeDriver();
			FileInputStream f=new FileInputStream("C:\\Users\\malepatigreeshma\\OneDrive\\Documents\\dd1.xlsx");
			XSSFWorkbook wb=new XSSFWorkbook(f);
			XSSFSheet ws=wb.getSheet("Sheet1");
			Row r=null;
			Cell c=null;
			d.get("https://amazon.com");
			d.manage().window().maximize();
			WebElement drop=d.findElement(By.id("searchDropdownBox"));
			List<WebElement>drop1=drop.findElements(By.tagName("option"));
			System.out.println(drop1.size());
			for(int i=0;i<drop1.size();i++)
			{
				System.out.println(drop1.get(i).getText());
				r=ws.createRow(i);
				r.createCell(0).setCellValue(drop1.get(i).getText());
				drop1.get(i).click();
				if(!drop1.get(i).isSelected())
				{
					r.createCell(1).setCellValue("false");
					
				}
				else
				{
					r.createCell(1).setCellValue("true");
				}
			}
			
			FileOutputStream f1=new FileOutputStream("C:\\Users\\malepatigreeshma\\OneDrive\\Documents\\dd1.xlsx");
			wb.write(f1);
			d.close();
			
		}

	}


