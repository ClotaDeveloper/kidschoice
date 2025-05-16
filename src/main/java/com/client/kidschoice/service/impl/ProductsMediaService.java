package com.client.kidschoice.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.client.kidschoice.entity.ProductsMedia;
import com.client.kidschoice.entity.VwProductsCars;
import com.client.kidschoice.entity.VwProductsMedia;
import com.client.kidschoice.repository.ProductsMediaRepository;

@Service
public class ProductsMediaService {

	@Autowired
	private ProductsMediaRepository productsMediaRepository;


public ProductsMedia addProductsMediaDetails(ProductsMedia productsMedia) {
    return productsMediaRepository.save(productsMedia);
}


public Optional<ProductsMedia> getById(Long id) {
    return productsMediaRepository.findById(id); // Because CrudRepository uses Integer
}


public List<VwProductsMedia> getAllProductsMedia() {
    return productsMediaRepository.getAllProductsMedia();
   
  }

public List<VwProductsMedia> getProductsMediaByProductID(String productID ) {
    return productsMediaRepository.getProductsMediaByProductID(productID);
   }

}
