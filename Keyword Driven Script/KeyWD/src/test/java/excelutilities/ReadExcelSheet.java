package excelutilities;

import java.io.File;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;



public class ReadExcelSheet {
	
	public  void readExcelData(int colno)throws IOException 
	{
		//String filepath=Constants.excelfile;
		
		File file=new File("C:\\excel\\Keyw.xlsx");
		
		FileInputStream fis= new FileInputStream(file);
		
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
	
		
			if(sheet.isSelected())
				{
					System.out.println("is selected ");
				}
			
				
				  Iterator row=sheet.rowIterator(); 
				
				  //row.next();
		
				  ArrayList<String> a=new ArrayList(); 
				
				  int rt=0;
				  
				  while(row.hasNext()) {
					  System.out.println(rt++);
					  Row r=(Row) row.next(); 
					  Cell  c=r.getCell(colno);
					  String data=c.getStringCellValue(); 
					  System.out.println(data);
					  a.add(data);
					  a.add(((Row)row.next()).getCell(colno).getStringCellValue());
				  
				  } 
				  System.out.println("List  "+a);
				 
				
		
}
	public static void main(String args[]) throws IOException
	{
		ReadExcelSheet rs=new ReadExcelSheet();
		rs.readExcelData(4);
		
	}
	
	

}
