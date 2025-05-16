package com.client.kidschoice.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.client.kidschoice.service.impl.*;
import com.client.kidschoice.entity.*;


@RestController
public class RestUserControllerCars {
	
	@Autowired
	private ProductsCarsService productsCarsService;

	   @GetMapping("/allCars")
	    public List<VwProductsCars> getAllProductsCars() {
	        return productsCarsService.getAllProductsCars();
	    }
	   @GetMapping("/allCarsByPID/{productID}")
	    public List<VwProductsCars> getProductsCarsByProductID(@PathVariable String productID) {
	        return productsCarsService.getProductsCarsByProductID(productID);
	    }

}
