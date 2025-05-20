package com.client.kidschoice.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.client.kidschoice.entity.VwProductsCars;
import com.client.kidschoice.repository.ProductsCarsRepository;

@Service
public class ProductsCarsService {
	
	@Autowired
	private ProductsCarsRepository productsCarsRepository;
	
	
	 public List<VwProductsCars> getAllProductsCars() {
		    return productsCarsRepository.getAllProductsCars();
		   
		  }
	  
	  public List<VwProductsCars> getProductsCarsByProductID(String productID ) {
		    return productsCarsRepository.getProductsCarsByProductID(productID);
		   }

	 
}
