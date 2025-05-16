package com.client.kidschoice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.client.kidschoice.repository.ProductCategoryRepository;

@Service
public class ProductCategoryService {
	
	@Autowired
	private ProductCategoryRepository productCategoryRepository;
	

}
