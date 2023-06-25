package com.springboot.main.service;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.main.model.Vendor;
import com.springboot.main.repository.VendorRepository;

@Service
public class VendorService {
	
	@Autowired
	private VendorRepository vendorrepository;

	public Vendor insert(Vendor vendor) {
		
		
		return vendorrepository.save(vendor);
	}

	public Vendor getById(int vendorId) {
		// TODO Auto-generated method stub
		
		Optional<Vendor> optional=vendorrepository.findById(vendorId);
		if(!optional.isPresent())
		{
			return null;
		}
		return optional.get();
	}

}