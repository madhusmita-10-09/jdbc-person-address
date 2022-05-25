package com.ty.person.address.controller;

import com.ty.person.address.dao.AddressDao;
import com.ty.person.address.dto.Address;
import com.ty.person.address.service.AddressService;

public class TestSaveAddress {

	public static void main(String[] args) {
		AddressService addressservice=new AddressService();
		
		
		
		Address address=new Address();
		address.setAid(4);
		address.setStreet("puttur");
		address.setDoor_num("6754");
		address.setCity("karwar");
		address.setPin("645354");
		address.setPid(3);
		
		int res=addressservice.saveAddress(address);
		if(res>0)
		{
			System.out.println("data inserted");
		}
		else
			System.out.println("data not found");
		
	}

}
