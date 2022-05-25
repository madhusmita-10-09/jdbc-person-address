package com.ty.person.address.controller;

import com.ty.person.address.dto.Person;
import com.ty.person.address.service.PersonService;

public class TestGetId {
	public static void main(String[] args) {
		PersonService personservice=new PersonService();
		
		Person person=new Person();
		
		person = personservice.getPersonById(2);
		System.out.println(person.getPid() + " " + person.getName() + " " + person.getEmail() + " " + person.getPhone());
		
		
	}

}
