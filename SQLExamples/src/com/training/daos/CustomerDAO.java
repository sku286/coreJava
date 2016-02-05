package com.training.daos;

import com.training.ifaces.DAO;
import com.training.utils.SqlConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.training.entity.Customer;;

public class CustomerDAO implements DAO<Customer> {
	
	private Connection con = null;
	

	public CustomerDAO() {
		super();
		// TODO Auto-generated constructor stub
		
		con =SqlConnection.getOracleConnection(); 
	}

	public CustomerDAO(Connection con) {
		super();
		this.con = con;
	}



	@Override
	public int add(Customer t) {
		// TODO Auto-generated method stub
		int rowadded=0;
		String sql = "insert into customer values(?,?,?,?)";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, t.getCutomerid());
			pstmt.setString(2, t.getCustomername());
			pstmt.setString(3, t.getEmail_id());
			pstmt.setLong(4, t.getHandPhone());
			 rowadded = pstmt.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		return rowadded;
	}

	@Override
	public Customer find(int key1) {
		
		String sql1 = "select * from customer where cutomerid=?";
		Customer cus =null;
		try {
			PreparedStatement pstmt = con.prepareStatement(sql1);
			pstmt.setInt(1,key1);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next())
			{
				
				String cus1 = rs.getString("Customername");
				String email=rs.getString("email_id");
				long phone = rs.getLong("handPhone");
				cus = new Customer(key1,cus1,email,phone);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cus;
	}
	private Customer getCustomer(ResultSet rs){
		Customer cus =null;
		try
		{
			while(rs.next())
			{
				
		int customerid = rs.getInt("Cutomerid");
		String customer = rs.getString("Customername");
		String email=rs.getString("email_id");
		long phone = rs.getLong("handPhone");
		cus = new Customer(customerid,customer,email,phone);
		   }
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return cus;
		
	}

	@Override
	public List<Customer> findAll() {
	
		String sql = "select * from customer";
		ArrayList<Customer> custlist = new ArrayList<Customer>();
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
		
			ResultSet rs = pstmt.executeQuery();
			while(rs.next())
			{		
			Customer cust = getCustomer(rs);
			custlist.add(cust);
			} 
		} 
		catch (Exception e)
		   {
			e.printStackTrace();
		   }
		
		return custlist;
	}

	@Override
	public int update(int key) {
		int f=0;
		String sql = "update customer set customername='rajesh' where cutomerid=?";
		try {
			PreparedStatement ptmst = con.prepareStatement(sql);
			ptmst.setInt(1, key);
			 f= ptmst.executeUpdate();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return f;
	}
		

	@Override
	public int delete(int key) {
		int f=0;
		String sql = "delete from customer where cutomerid=?";
		try {
			PreparedStatement ptmst = con.prepareStatement(sql);
			ptmst.setInt(1, key);
			 f= ptmst.executeUpdate();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return f;
	}
	

}
