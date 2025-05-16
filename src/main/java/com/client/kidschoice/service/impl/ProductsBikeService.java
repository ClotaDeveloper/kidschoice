package com.client.kidschoice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.client.kidschoice.repository.ProductsBikeRepository;
import com.client.kidschoice.entity.VwProductsBike;

@Service
public class ProductsBikeService {
	
	@Autowired
	private ProductsBikeRepository productsBikeRepository;

	
	
	 public List<VwProductsBike> getAllProductsBikes() {
		    return productsBikeRepository.getAllProductsBikes();
		   
		  }
	  
	  public List<VwProductsBike> getProductsBikesByProductID(String productID ) {
		    return productsBikeRepository.getProductsBikesByProductID(productID);
		   }
}
