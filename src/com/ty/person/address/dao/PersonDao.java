package com.ty.person.address.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ty.person.address.dto.Person;
import com.ty.person.address.util.ConnectionObject;

public class PersonDao {
	public int savePerson(Person person)
	{
		String sql="insert into person values(?,?,?,?)";
		Connection connection=ConnectionObject.getConnection();
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, person.getPid());
			preparedStatement.setString(2,person.getName());
			preparedStatement.setString(3,person.getEmail());
			preparedStatement.setString(4, person.getPhone());
			
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
			else
				System.out.println("data is not there");
		}
		return 0;
	}
	public Person getPersonById(int pid)
	{
		String sql="select* from person where pid=?";
		//List<Person> list = new ArrayList<Person>();
		Connection connection=ConnectionObject.getConnection();
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, pid);
			ResultSet resultset=preparedStatement.executeQuery();
			Person person = null;
			if(resultset.next())
			{
				person=new Person();
				person.setPid(resultset.getInt(1));
				person.setName(resultset.getString(2));
				person.setEmail(resultset.getString(3));
				person.setPhone(resultset.getString(4));
				//list.add(person);
			}
			return person;
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		finally{
			if(connection!=null)
			{
				try {
					connection.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			}
		}
		return null;
	}

}
