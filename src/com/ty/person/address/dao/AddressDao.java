package com.ty.person.address.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ty.person.address.dto.Address;
import com.ty.person.address.util.ConnectionObject;

public class AddressDao {
	public int saveAddress(Address address)
	{
		String sql="insert into  address values(?,?,?,?,?,?)";
		Connection connection=ConnectionObject.getConnection();
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1,address.getAid());
			preparedStatement.setString(2,address.getStreet());
			preparedStatement.setString(3,address.getDoor_num());
			preparedStatement.setString(4, address.getCity());
			preparedStatement.setString(5,address.getPin());
			preparedStatement.setInt(6,address.getPid());
			
			
			return preparedStatement.executeUpdate();
			
			
		} catch (SQLException e) {
						e.printStackTrace();
		}
		finally
		{
			if(connection!=null)
			{
				try {
					connection.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			}
		}
		return 0;
		
	}
	public List<Address>getAddress(int pid)
	{
		List<Address>list= new ArrayList<Address>();
		String sql="select * from address where pid=?";
		Connection connection=ConnectionObject.getConnection();
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, pid);
			ResultSet resultset=preparedStatement.executeQuery();
			while(resultset.next())
			{
				Address address=new Address();
				address.setAid(resultset.getInt(1));
				address.setStreet(resultset.getString(2));
			    address.setDoor_num(resultset.getString(3));
			    address.setCity(resultset.getString(4));
			    address.setPid(resultset.getInt(6));
			    address.setPin(resultset.getString(5));
			    
			    list.add(address);
				
			}
			 return list;
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return null;
		
		
        		
	}

}
