package com.ty.person.address.service;

import java.util.List;

import com.ty.person.address.dao.PersonDao;
import com.ty.person.address.dto.Person;

public class PersonService {
	PersonDao persondao=new PersonDao();
	public int savePerson(Person person) {
		return persondao.savePerson(person);
	}
	
	public Person getPersonById(int pid)
	{
		return persondao.getPersonById(pid);
	}
	

}
