package poi;

import java.io.File;  
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import com.gargoylesoftware.htmlunit.javascript.host.Iterator;

import org.testng.annotations.BeforeSuite;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;

public class poiuse {
  @Test
  public void f() throws IOException {
	  
	   int totalNoOfRows, totalNoOfcolmn ;	  
	   System.setProperty("webdriver.gecko.driver", "D://Sumit/setup/geckodriver-v0.10.0-win64/geckodriver.exe");
	    File file =  new File("D:/Sumit/software/usepoi/src/poi/userdata.xlsx");;
	    FileInputStream fis=new FileInputStream(file);;
	   XSSFWorkbook wb=new XSSFWorkbook(fis);   
       XSSFSheet sh1= wb.getSheet("All_Address");		    
	   

	   totalNoOfRows = sh1.getLastRowNum()-sh1.getFirstRowNum();;
	   totalNoOfcolmn=2;
	   
	   	 for (int i = 0; i < totalNoOfRows-2; i++)
	 {	        
	      for (int j = 0; j < 2; j++) 
	        {
	    	 String cellval= sh1.getRow(i).getCell(j).getStringCellValue();
	    	  /*Cell cell=row.getCell(j);
	    	  System.out.println(cell);
	    	  String cellval=cell.getStringCellValue();*/
	    	  System.out.print(cellval +"| ");
	         }
	       
	        System.out.println();
	  }
	 
	/*   sh.getCell(col, row).getContents() 	
	    * if (cell.getCellType() == XSSFCell.CELL_TYPE_STRING) {
					System.out.print(cell.getStringCellValue() + " ");
				} else if (cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC) {
					System.out.print(cell.getNumericCellValue() + " ");
				} else if (cell.getCellType() == XSSFCell.CELL_TYPE_BOOLEAN) {
					System.out.print(cell.getBooleanCellValue() + " ");

				} else { // //Here if require, we can also add below methods to
							// read the cell content
							// XSSFCell.CELL_TYPE_BLANK
							// XSSFCell.CELL_TYPE_FORMULA
							// XSSFCell.CELL_TYPE_ERROR
				}
			}
			System.out.println();
			try {
				XlsxFileToRead.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

  */
		    
		System.out.println("totalNoOfRows :"+totalNoOfRows); 
		System.out.println("totalNoOfCols :"+totalNoOfcolmn);    
		    
		 
		    
		 /*   Sheet All_Address_Sheet = All_Address.getSheet(All_Address);

		    //Find number of rows in excel file

		    int rowCount = All_Address.getLastRowNum()-All_Address.getFirstRowNum();

		    //Create a loop over all the rows of excel file to read it

		    for (int i = 0; i < rowCount+1; i++) {

		        Row row = All_Address.getRow(i);

		        //Create a loop to print cell values in a row

		        for (int j = 0; j < row.getLastCellNum(); j++) {

		            //Print excel data in console

		            System.out.print(row.getCell(j).getStringCellValue()+"|| ");

		        }*/

		        System.out.println("end of test1");

 }

		    
		    

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}



/*
Workbook: XSSFWorkbook and HSSFWorkbook classes implement this interface.
XSSFWorkbook: Is a class representation of XLSX file.
HSSFWorkbook: Is a class representation of XLS file.
Sheet: XSSFSheet and HSSFSheet classes implement this interface.
XSSFSheet: Is a class representing a sheet in a XLSX file.
HSSFSheet: Is a class representing a sheet in a XLS file.
Row: XSSFRow and HSSFRow classes implement this interface.
XSSFRow: Is a class representing a row in sheet of XLSX file.
HSSFRow: Is a class representing a row in sheet of XLS file.
Cell: XSSFCell and HSSFCell classes implement this interface.
XSSFCell: Is a class representing a cell in a row of XLSX file.
HSSFCell: Is a class representing a cell in a row of XLS file.
*/


