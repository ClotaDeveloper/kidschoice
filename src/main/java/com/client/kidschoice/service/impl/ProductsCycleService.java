package com.client.kidschoice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.client.kidschoice.repository.ProductsCycleRepository;

import com.client.kidschoice.entity.VwProductsCycle;



@Service
public class ProductsCycleService {


	@Autowired
	private ProductsCycleRepository productsCycleRepository;
	
	 public List<VwProductsCycle> getAllProductsCycles() {
		    return productsCycleRepository.getAllProductsCycles();
		   
		  }
	  
	  public List<VwProductsCycle> getProductsCyclesByProductID(String productID ) {
		    return productsCycleRepository.getProductsCyclesByProductID(productID);
		   }
	

    
}
