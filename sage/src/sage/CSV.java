package sage;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class CSV {
	
	static void read_write_CSV_File() {

		
		  String csvFilePath = "C:/Users/Pratas/git/sage/sage/testfile.csv";

		  String input_line="";
          StringBuilder sbOutput = new StringBuilder();
         

          ArrayList<String> fileInput = new ArrayList<String>();
         
         
                 fileInput.add("João,10,aaaaaaaaaaaa");
                 fileInput.add("Maria,20,bbbbbbbbbbbb");
                 fileInput.add("Celia,30,cccccccccccc");
                 fileInput.add("Alberta,50,ddddddddddddd");
          
          /*
          try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {

              while ((input_line = br.readLine()) != null) {

                
            	  fileInput.add(input_line);
           

              }

              br.close();
          } catch (IOException e) {
              e.printStackTrace();
             
          }

      //   for(String s: fileInput) System.out.println(s);
          Collections.sort(fileInput);
          Collections.reverse(fileInput);
          
         for(String s: fileInput) System.out.println(s);
            */
          ////////////////////////////////////////////////////////////////////////////////  
          PrintWriter pw = null;
          try {
              pw = new PrintWriter(new File(csvFilePath));
          } catch (FileNotFoundException e) {
              e.printStackTrace();
          }
          StringBuilder builder = new StringBuilder();
          String columnNamesList = "Name,Id,Desc";
          
          builder.append(columnNamesList +"\n");
          for(String s: fileInput) {
        	  String[] line = s.split(",");
	          
	          builder.append(line[0]+",");
	          builder.append(line[1]+",");
	          builder.append(line[2]);
	          builder.append('\n');
	         
          }
          pw.write(builder.toString());
          pw.close();
          System.out.println("done!");
          ////////////////////////////////////////////////////////////////////////////////
         
      }
	  
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Sage!");
			
			CSV.read_write_CSV_File();
	}

	
	

}
