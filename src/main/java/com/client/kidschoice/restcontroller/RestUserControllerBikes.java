package com.client.kidschoice.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.client.kidschoice.service.impl.ProductsBikeService;
import com.client.kidschoice.entity.VwProductsBike;

@RestController
public class RestUserControllerBikes {
	
	@Autowired
	private ProductsBikeService productsBikeService;
	
	
	   @GetMapping("/allBikes")
	    public List<VwProductsBike> getAllProductsBikes() {
	        return productsBikeService.getAllProductsBikes();
	    }
	   @GetMapping("/allBikesByPID/{productID}")
	    public List<VwProductsBike> getProductsBikesByProductID(@PathVariable String productID) {
	        return productsBikeService.getProductsBikesByProductID(productID);
	    }

}
