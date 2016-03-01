package com.training.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;
public class SqlConnection {
	
	public static Connection getOracleConnection(){
		
		Connection con = null;
		
		try{
			
			InputStream stream =Thread.currentThread().getContextClassLoader().getResourceAsStream("DbConnection.properties");
			Properties prop = new Properties();
			//FileInputStream inStream = new FileInputStream(new File("DbConnection.properties"));
			//prop.load(inStream);
			
			System.out.println(stream);
			prop.load(stream);
			
			Class.forName(prop.getProperty("db.className"));
			con = DriverManager.getConnection(prop.getProperty("db.url"),prop.getProperty("db.userName"), prop.getProperty("db.passWord"));
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}
	
	

}
