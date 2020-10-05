import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class main {
    



 
    public static final String delimiter = ",";
   
   public static void read(String csvFile1) {
  
	   String csvFile = csvFile1;
		BufferedReader br = null;
		String line = "";
		try
		{
			String[] tempArr;
			br = new BufferedReader(new FileReader(csvFile));
		
			
			while((line = br.readLine()) != null) {
	            tempArr = line.split(delimiter);
	            for(String tempStr : tempArr) {
	               System.out.print(tempStr + " - ");
	            }
	            System.out.println();
			}
			 br.close();
		}	
		
		catch(IOException ioe) {
        ioe.printStackTrace();
		}
		
	
	}

	   
	   
	   
  
   public static void main(String[] args) {
      // csv file to read
      String csvFile = "data/PromedioCSVjava.csv";
      main.read(csvFile);
   }
}