package com.ty.person.address.controller;

import com.ty.person.address.dao.PersonDao;
import com.ty.person.address.dto.Person;
import com.ty.person.address.service.PersonService;

public class TestSavePerson {

	public static void main(String[] args) {
		PersonService personservice=new PersonService();
		Person person=new Person();
		
		person.setPid(3);
		person.setName("dipak");
		person.setEmail("dipak@gmail.com");
		person.setPhone("88653373l");
		
		int res=personservice.savePerson(person);
		
		if(res>0)
		{
			System.out.println("Data inserted");
		}
		else
		{
			System.out.println("NO data found");
		}

	}

}
