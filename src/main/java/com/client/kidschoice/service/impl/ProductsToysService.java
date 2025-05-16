package com.client.kidschoice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.client.kidschoice.entity.VwProductsCars;
import com.client.kidschoice.entity.VwProductsToys;
import com.client.kidschoice.repository.ProductsToysRepository;

@Service
public class ProductsToysService {
	
	@Autowired
	ProductsToysRepository productsToysRepository;

	 public List<VwProductsToys> getAllProductsToys() {
		    return productsToysRepository.getAllProductsToys();
		   
		  }
	  
	  public List<VwProductsToys> getProductsToysByProductID(String productID ) {
		    return productsToysRepository.getProductsToysByProductID(productID);
		   }
	
	
	
}
