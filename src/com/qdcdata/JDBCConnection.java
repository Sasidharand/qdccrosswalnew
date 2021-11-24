package com.qdcdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;



public class JDBCConnection  {
	
	//private static ConnectionPool schedulerConnectionPool;

	
	/**
	 * @return void
	 */
	
	
	public static Connection getConnection(String dbname) throws Exception {
		
		java.sql.Connection conn;
		
		conn = null;
		
String dbName = "QDC";
		
		//String dbName=dbname;
		String serverip="164.52.218.134";
		String databaseUserName = "sa";
		String databasePassword = "Pione@123";
		
	/*	String dbName = "QDC";
		String serverip="qoipr.database.windows.net";
		String databaseUserName = "qoipradmin";
		String databasePassword = "QoipR242002";*/
		
		
		String serverport="1433";
		String url = "jdbc:sqlserver://"+serverip+"\\SQLEXPRESS:"+serverport+";databaseName="+dbName+"";
	
	
		 String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver"; 
		/* String driver = "com.microsoft.jdbc.sqlserver.SQLServerDriver"; */
		 
		
		 
		try {
	    Class.forName(driver).newInstance();
	    conn = java.sql.DriverManager.getConnection(url, databaseUserName, databasePassword);
	    
	    
	    
		} catch (Exception e) {
			
			throw new Exception(e);
		}
		
		return conn;
	}
	
	
	
	
}
