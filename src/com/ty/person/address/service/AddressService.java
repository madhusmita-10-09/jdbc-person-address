package com.ty.person.address.service;

import java.util.List;

import com.ty.person.address.dao.AddressDao;
import com.ty.person.address.dto.Address;

public class AddressService {
	AddressDao addressdao=new AddressDao();
	public int saveAddress(Address address)
	{
	  return addressdao.saveAddress(address);
	}
	public  List<Address> getAddress(int aid)
	{
		return addressdao.getAddress(aid);
	}
	

}
