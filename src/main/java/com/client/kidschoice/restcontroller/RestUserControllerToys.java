package com.client.kidschoice.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.client.kidschoice.entity.VwProductsGiftsAndArts;
import com.client.kidschoice.entity.VwProductsToys;
import com.client.kidschoice.service.impl.ProductsGiftsAndArtsService;
import com.client.kidschoice.service.impl.ProductsToysService;

@RestController
public class RestUserControllerToys {
	
	@Autowired
	private ProductsToysService productsToysService;
	
	@Autowired
	private ProductsGiftsAndArtsService productsGiftsAndArtsService;
	
	   @GetMapping("/allToys")
	    public List<VwProductsToys> getAllProductsToys() {
	        return productsToysService.getAllProductsToys();
	    }
	   @GetMapping("/allToysByPID/{productID}")
	    public List<VwProductsToys> getProductsToysByProductID(@PathVariable String productID) {
	        return productsToysService.getProductsToysByProductID(productID);
	    }
	   
	   @GetMapping("/allGiftsAndArts")
	    public List<VwProductsGiftsAndArts> getAllProductsGiftsAndToys() {
	        return productsGiftsAndArtsService.getAllProductsGiftsAndToys();
	    }
	   @GetMapping("/allGiftsAndArtsByPID/{productID}")
	    public List<VwProductsGiftsAndArts> getProductsGiftsAndToysByProductID(@PathVariable String productID) {
	        return productsGiftsAndArtsService.getProductsGiftsAndToysByProductID(productID);
	    }

}
