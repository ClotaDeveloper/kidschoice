package com.client.kidschoice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.client.kidschoice.entity.VwProductsGiftsAndArts;
import com.client.kidschoice.repository.ProductsGiftsAndArtsRepository;

@Service
public class ProductsGiftsAndArtsService {

    @Autowired
	private ProductsGiftsAndArtsRepository productsGiftsAndArtsRepository;
    
    
    public List<VwProductsGiftsAndArts> getAllProductsGiftsAndToys() {
	    return productsGiftsAndArtsRepository.getAllProductsGiftsAndToys();
	   
	  }
  
  public List<VwProductsGiftsAndArts> getProductsGiftsAndToysByProductID(String productID ) {
	    return productsGiftsAndArtsRepository.getProductsGiftsAndToysByProductID(productID);
	   }
}
