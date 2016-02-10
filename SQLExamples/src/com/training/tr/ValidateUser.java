package com.training.tr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ValidateUser {
	
	public boolean Validate(User obj){
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:system/SYS@localhost:1521:XE");
			String sql = "select * from users where username=? and password=?";
			
			PreparedStatement pt = con.prepareStatement(sql);
			pt.setString(1, obj.getUserName());
			pt.setString(2, obj.getPassWord());
			ResultSet rs=pt.executeQuery();
				if(rs.next())
					return true;
				
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

}
