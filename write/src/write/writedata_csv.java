package write;

import com.csvreader.CsvWriter;  
import java.io.BufferedReader;  
import java.io.File;  
import java.io.FileNotFoundException;  
import java.io.FileReader;  
import java.io.FileWriter;  
import java.io.IOException;  
public class writedata_csv {  
  public static void main(String[] args) throws FileNotFoundException, IOException {  
    boolean alreadyExists = new File("D:\\Sumit\\Output123_csv.csv").exists();  
    try {  
 // use FileWriter constructor that specifies open for appending  
CsvWriter csvOutput = new CsvWriter(new FileWriter("D:\\Sumit\\Output123_csv.csv",true),',');  
// if the file didn't already exist then we need to write out the header line  
      if (!alreadyExists) {  
        csvOutput.write("Name");  
        csvOutput.write("Deparment");  
        csvOutput.write("Year");  
        csvOutput.endRecord();  
      }  
      // write out a few records  
      for (int i = 0; i < 10; i++) {  
        csvOutput.write("Studen " + i);  
        csvOutput.write("Deparment " + i);  
        csvOutput.write("201" + i);  
        csvOutput.endRecord();  
      }  
      csvOutput.close();  
    } catch (IOException e) {  
      e.printStackTrace();  
    }  
    // Read data from CSV file.    
    FileReader fr = new FileReader(new File("D:\\Sumit\\Output123_csv.csv"));  
    BufferedReader br = new BufferedReader(fr);  
    String st;  
    while ((st = br.readLine()) != null) {  
      System.out.println(st);  
    }  
  }  
}  