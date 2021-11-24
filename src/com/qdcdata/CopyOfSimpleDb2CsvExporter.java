package com.qdcdata;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.sql.SQLException;
import au.com.bytecode.opencsv.CSVWriter;

public class CopyOfSimpleDb2CsvExporter {/*
	
	
	 public static void main(String[] args) throws Exception {
		 //String filename = "c:\\myjdbcfile.csv";
		 String searchvalue="1000165";
		 try{
			 //FileWriter fw = new FileWriter(filename);
	    	java.sql.ResultSet resultsearch;
	    	java.sql.CallableStatement cstmt;
	    	
	    	//JDBCConnection jcon = new JDBCConnection();
	    	java.sql.Connection conn; 
	    	
	    	
	    	
	    	System.out.println(" searchvalue " + searchvalue);
	    	//searchvalue=request.getParameter("searchmfname");
	    	conn = JDBCConnection.getConnection("QDC");
	    	//stmt = conn.createStatement();
	    	cstmt= conn.prepareCall("exec GetSKU_Header @p_prodid ='"+searchvalue+"'");
	    	resultsearch =cstmt.executeQuery();
	    	
	    	  String filename = "D://"+searchvalue+".csv";
	    	 String filename = searchvalue+".csv";
	    	  System.out.println("filename " + filename);
	            
	    	FileWriter my_csv=new FileWriter("D://out.csv");
	    	  FileWriter my_csv=new FileWriter(filename);
	    	CSVWriter my_csv_output=new CSVWriter(my_csv); //Create a writer object
	    	boolean includecolumnnames=true;
	    	my_csv_output.writeAll(resultsearch,includecolumnnames); //write output by directly reading the Resultset, include column names in report
	    	my_csv_output.close();
	            
	             
	           // cstmt.close();
	            //resultsearch.close();
	           // cstmt.close();
	            conn.close();
	            
	            
	            
	            String filePath="";
	           // String fileNameNew="statistics.csv";
	            filePath="D://"+filename;
	            
	            response.setContentType("text/csv");
	            // response.setContentType("application/x-msdownload");
	            // or
	            // response.setContentType("application/unknown");
	            response.addHeader("Content-Disposition", "attachment; filename="+filename);
	            try{
	            File uFile= new File(filePath);
	            int fSize=(int)uFile.length();
	            FileInputStream fis = new FileInputStream(uFile);
	            PrintWriter pw = response.getWriter();
	            int c=-1;
	            // Loop to read and write bytes.
	            //pw.print("Test");

	            while ((c = fis.read()) != -1){
	            pw.print((char)c);
	            }
	            // Close output and input resources.
	            fis.close();
	            pw.flush();
	            pw=null;
	            }catch(Exception e){
	            }
	            
	            
	            
	             
	        } catch (Exception e)
	        {
	        	e.printStackTrace();
	        }
	         
	    }
	

*/}
