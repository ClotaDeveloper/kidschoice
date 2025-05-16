package com.client.kidschoice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.client.kidschoice.repository.ProductsInventoryRepository;

@Service
public class ProductsInventoryService {

    @Autowired
	private ProductsInventoryRepository productsInventoryRepository;
}
