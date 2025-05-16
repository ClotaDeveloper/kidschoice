package com.client.kidschoice.restcontroller;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.client.kidschoice.entity.ProductsMedia;
import com.client.kidschoice.entity.VwProductsCars;
import com.client.kidschoice.entity.VwProductsMedia;
import com.client.kidschoice.service.impl.ProductsMediaService;

@RestController
public class RestUserController {


	@Autowired
	private ProductsMediaService productsMediaService;
	
	
	@PostMapping("/addProductsMediaDetails")
    public String addEmployeeExpenseDetailWithFile(@RequestParam("productImages") MultipartFile productImages,
    		@RequestParam("id") Long id,
    		@RequestParam("productCategory") Integer productCategory, 
            @RequestParam("productID") String productID) {
        try {
        	ProductsMedia productsMedia = new ProductsMedia();
        	productsMedia.setID(id);
        	productsMedia.setProductCategory(productCategory);
        	productsMedia.setProductID(productID);
        	productsMedia.setProductImages(productImages.getBytes());
        	productsMediaService.addProductsMediaDetails(productsMedia);
            return "File uploaded successfully!";
        } catch (IOException e) {
            return "Failed to upload file: " + e.getMessage();
        }
    }
	
	
	@PutMapping("/updateProductsMediaDetails")
	public String updateProductsMediaDetails(
	        @RequestParam("productImages") MultipartFile productImages,
	        @RequestParam("id") Long id,
	        @RequestParam("productCategory") Integer productCategory,
	        @RequestParam("productID") String productID) {
	    
	    try {
	        // Check if media with the given ID exists
	        Optional<ProductsMedia> optionalMedia = productsMediaService.getById(id);
	        if (optionalMedia.isPresent()) {
	            ProductsMedia productsMedia = optionalMedia.get();
	            productsMedia.setProductCategory(productCategory);
	            productsMedia.setProductID(productID);
	            productsMedia.setProductImages(productImages.getBytes());
	            productsMediaService.addProductsMediaDetails(productsMedia); // same method used for save/update
	            return "Media details updated successfully!";
	        } else {
	            return "Media with ID " + id + " not found.";
	        }
	    } catch (IOException e) {
	        return "Failed to update file: " + e.getMessage();
	    }
	}

	
	   @GetMapping("/allProductsMedia")
	    public List<VwProductsMedia> getAllProductsMedia() {
	        return productsMediaService.getAllProductsMedia();
	    }
	   @GetMapping("/allProductsMediaByPID/{productID}")
	    public List<VwProductsMedia> getProductsMediaByProductID(@PathVariable String productID) {
	        return productsMediaService.getProductsMediaByProductID(productID);
	    }
	
	
	
}
