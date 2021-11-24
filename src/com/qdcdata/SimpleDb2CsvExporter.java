package com.qdcdata;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.sql.SQLException;
import au.com.bytecode.opencsv.CSVWriter;

public class SimpleDb2CsvExporter {
	
	public static void csvdownload (String prodid){
	 //public static void main(String[] args) throws Exception {
		 //String filename = "c:\\myjdbcfile.csv";
		 try{
			 //FileWriter fw = new FileWriter(filename);
	    	java.sql.ResultSet resultsearch;
	    	java.sql.CallableStatement cstmt;
	    	
	    	//JDBCConnection jcon = new JDBCConnection();
	    	java.sql.Connection conn; 
	    	String searchvalue=prodid;
	    	System.out.println(" searchvalue " + searchvalue);
	    	//searchvalue=request.getParameter("searchmfname");
	    	conn = JDBCConnection.getConnection("QDC");
	    	//stmt = conn.createStatement();
	    	cstmt= conn.prepareCall("exec GetSKU_Header @p_prodid ='"+searchvalue+"'");
	    	resultsearch =cstmt.executeQuery();
	    	
	    	  String filename = "D://"+searchvalue+".csv";
	    	// String filename = searchvalue+".csv";
	    	  System.out.println("filename " + filename);
	            
	    	/*FileWriter my_csv=new FileWriter("D://out.csv");*/
	    	  FileWriter my_csv=new FileWriter(filename);
	    	CSVWriter my_csv_output=new CSVWriter(my_csv); //Create a writer object
	    	boolean includecolumnnames=true;
	    	my_csv_output.writeAll(resultsearch,includecolumnnames); //write output by directly reading the Resultset, include column names in report
	    	my_csv_output.close();
	            
	             
	           // cstmt.close();
	            //resultsearch.close();
	           // cstmt.close();
	            conn.close();
	            
	             
	        } catch (Exception e)
	        {
	        	e.printStackTrace();
	        }
	         
	    }
	

}
