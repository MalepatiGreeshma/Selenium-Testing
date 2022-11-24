package jar;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class exp2 {

	public static void main(String[] args) throws IOException {

				// TODO Auto-generated method stub
				FileInputStream f=new FileInputStream("C:\\Users\\malepatigreeshma\\OneDrive\\Documents\\write.xlsx");
				XSSFWorkbook wb=new XSSFWorkbook(f);
				XSSFSheet xs=wb.getSheet("write");
				Row r=null;
				Cell c=null;
				r=xs.createRow(1);
				r.createCell(1).setCellValue("Manual Testing");
				r=xs.createRow(2);
				r.createCell(2).setCellValue("QTP");
				r=xs.createRow(3);
				r.createCell(3).setCellValue("UFT");
				FileOutputStream f1=new FileOutputStream("C:\\Users\\malepatigreeshma\\OneDrive\\Documents\\write.xlsx");
				wb.write(f1);
				f1.close();
				
				

			}

		

	}


