package write;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class writingdata_txt {

	public static void main(String[] args) throws IOException, Exception, InvalidFormatException {
		// TODO Auto-generated method stub
		
	/*	 FileInputStream file = new FileInputStream(new File("D:\\Sumit\\Data.xls")); 

		 XSSFWorkbook workbook = new XSSFWorkbook(file);
		 XSSFSheet sheet = workbook.getSheetAt(0);


			sheet.getRow(1).createCell(2).setCellValue("Pass");
			
			FileOutputStream outFile =new FileOutputStream(new File("D:\\Sumit\\Data.xls"));
			workbook.write(outFile);
			workbook.close();
*/
		
		 try {  
		      File f1 = new File("D:\\Sumit\\writetextfile.txt");  
		       // if file doesnt exists, then create it  
		       if (!f1.exists()) {  
		         f1.createNewFile();  
		       }  
		       // Write text on txt file.  
		       FileWriter fw = new FileWriter(f1, true);  
		       BufferedWriter bw = new BufferedWriter(fw);  
		       bw.write("How to write and read text file in java\n");  
		       bw.close();  
		       
		    // Read text from file.    
			     FileReader fr = new FileReader(f1);  
			     BufferedReader br = new BufferedReader(fr);  
			     String st;  
			     while ((st = br.readLine()) != null)
			     {  
			       System.out.println(st);  
			     }  
			     
			     
		     } 
		 catch (IOException e) 
		 	{  
		       e.printStackTrace();  
		     }  
		     
		   }  
		
	}


