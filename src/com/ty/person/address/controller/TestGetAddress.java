package com.ty.person.address.controller;

import java.util.ArrayList;
import java.util.List;

import com.ty.person.address.dao.AddressDao;
import com.ty.person.address.dto.Address;
import com.ty.person.address.service.AddressService;
import com.ty.person.address.service.PersonService;

public class TestGetAddress {

	public static void main(String[] args) {
		AddressService addressservice=new AddressService();
		
		List<Address>list= addressservice.getAddress(1);
	   
	   for(Address e:list)
	   {
		   System.out.println("Id:"+e.getAid());
		   System.out.println("Street: "+e.getStreet());
		   System.out.println("City: "+e.getCity());
		   System.out.println("Pin:"+e.getPin());
		   System.out.println("door_num:"+e.getDoor_num());
		   System.out.println("pid:"+e.getPid());
		   System.out.println("--------------------------");
	   }

	}

}
