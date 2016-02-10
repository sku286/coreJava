package com.training.example;
import java.sql.*;

public class CallableExample {
	public static void main(String[] args) {
		
		try{
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:system/SYS@localhost:1521/XE";
			Connection con = DriverManager.getConnection(url);
			
			CallableStatement st = con.prepareCall("call updatePhoneNumber(?,?)");
			st.setInt(1, 123);
			st.setLong(2, 9875463L);
			st.execute();
			int count = st.getUpdateCount();
			//st.registerOutParameter(3, java.sql.Types.NUMERIC);
			System.out.println("Thanks for updating");
			System.out.println(count+ " rows updated");
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
