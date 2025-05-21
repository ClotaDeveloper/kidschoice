package com.client.kidschoice.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	   
		 @PostMapping("/insertOrUpdateIncidents")
		    public ResponseEntity<String> insertOrUpdateCars(@RequestBody ProductsInsertUpdateDTO productsInsertUpdateDTO) {
		        try {
		        	productsCarsService.insertOrUpdateCars(
			            
		        			productsInsertUpdateDTO.getIncidentUpdateID(),
		        			productsInsertUpdateDTO.getInsertOrUpdate(),
		        			productsInsertUpdateDTO.getProductID(),
		        			productsInsertUpdateDTO.getCategoryID(),
		        			productsInsertUpdateDTO.getProductName(),
		        			productsInsertUpdateDTO.getDescription(),
		        			productsInsertUpdateDTO.getPrice(),
		        			productsInsertUpdateDTO.getSellingPrice(),
		        			productsInsertUpdateDTO.getGenericName(),
		        			productsInsertUpdateDTO.getBrand(),
		        			productsInsertUpdateDTO.getModelNumber(),
		        			productsInsertUpdateDTO.getType(),
		        			productsInsertUpdateDTO.getAgeGroup(),
		        			productsInsertUpdateDTO.getMaximumUserWeight(),
		        			productsInsertUpdateDTO.getNetQuantity(),
		        			productsInsertUpdateDTO.getSpeed(),
		        			productsInsertUpdateDTO.getDeliveryCondition(),
		        			productsInsertUpdateDTO.getNumberOfSeats(),
		        			productsInsertUpdateDTO.getBatteryOperated(),
		        			productsInsertUpdateDTO.getNoOfBatteries(),
		        			productsInsertUpdateDTO.getBatteryIncluded(),
		        			productsInsertUpdateDTO.getRechargeable(),
		        			productsInsertUpdateDTO.getBatteryType(),
		        			productsInsertUpdateDTO.getOtherPowerFeatures(),
		        			productsInsertUpdateDTO.getKeyStart(),
		        			productsInsertUpdateDTO.getSeatbeltIncluded(),
		        			productsInsertUpdateDTO.getMpThreePlayerSupported(),
		        			productsInsertUpdateDTO.getParentalRemote(),
		        			productsInsertUpdateDTO.getLights(),
		        			productsInsertUpdateDTO.getHorn(),
		        			productsInsertUpdateDTO.getOtherConvenienceFeatures(),
		        			productsInsertUpdateDTO.getDimentions(),
		        			productsInsertUpdateDTO.getWeight(),
		        			productsInsertUpdateDTO.getCountryOfOrigin(),
		        			productsInsertUpdateDTO.getManufacturer(),
		        			productsInsertUpdateDTO.getWarrenty(),
		        			productsInsertUpdateDTO.getCoveredInWarranty(),
		        			productsInsertUpdateDTO.getNotCoveredInWarranty(),
		        			productsInsertUpdateDTO.getColor(),
		        			productsInsertUpdateDTO.getQuantity(),
		        			productsInsertUpdateDTO.getStockAvailability()
		        		);

		            return new ResponseEntity<>("Data Inserted successfully", HttpStatus.OK);
		        } catch (Exception e) {
		            return new ResponseEntity<>("Error processing Request", HttpStatus.INTERNAL_SERVER_ERROR);
		        }
		    }

		 
		 
		 @PutMapping("/insertOrUpdateIncidents")
		    public ResponseEntity<String> updateCarsBySp(@RequestBody ProductsInsertUpdateDTO productsInsertUpdateDTO) {
		        try {
		        	productsCarsService.insertOrUpdateCars(
			            
		        			productsInsertUpdateDTO.getIncidentUpdateID(),
		        			productsInsertUpdateDTO.getInsertOrUpdate(),
		        			productsInsertUpdateDTO.getProductID(),
		        			productsInsertUpdateDTO.getCategoryID(),
		        			productsInsertUpdateDTO.getProductName(),
		        			productsInsertUpdateDTO.getDescription(),
		        			productsInsertUpdateDTO.getPrice(),
		        			productsInsertUpdateDTO.getSellingPrice(),
		        			productsInsertUpdateDTO.getGenericName(),
		        			productsInsertUpdateDTO.getBrand(),
		        			productsInsertUpdateDTO.getModelNumber(),
		        			productsInsertUpdateDTO.getType(),
		        			productsInsertUpdateDTO.getAgeGroup(),
		        			productsInsertUpdateDTO.getMaximumUserWeight(),
		        			productsInsertUpdateDTO.getNetQuantity(),
		        			productsInsertUpdateDTO.getSpeed(),
		        			productsInsertUpdateDTO.getDeliveryCondition(),
		        			productsInsertUpdateDTO.getNumberOfSeats(),
		        			productsInsertUpdateDTO.getBatteryOperated(),
		        			productsInsertUpdateDTO.getNoOfBatteries(),
		        			productsInsertUpdateDTO.getBatteryIncluded(),
		        			productsInsertUpdateDTO.getRechargeable(),
		        			productsInsertUpdateDTO.getBatteryType(),
		        			productsInsertUpdateDTO.getOtherPowerFeatures(),
		        			productsInsertUpdateDTO.getKeyStart(),
		        			productsInsertUpdateDTO.getSeatbeltIncluded(),
		        			productsInsertUpdateDTO.getMpThreePlayerSupported(),
		        			productsInsertUpdateDTO.getParentalRemote(),
		        			productsInsertUpdateDTO.getLights(),
		        			productsInsertUpdateDTO.getHorn(),
		        			productsInsertUpdateDTO.getOtherConvenienceFeatures(),
		        			productsInsertUpdateDTO.getDimentions(),
		        			productsInsertUpdateDTO.getWeight(),
		        			productsInsertUpdateDTO.getCountryOfOrigin(),
		        			productsInsertUpdateDTO.getManufacturer(),
		        			productsInsertUpdateDTO.getWarrenty(),
		        			productsInsertUpdateDTO.getCoveredInWarranty(),
		        			productsInsertUpdateDTO.getNotCoveredInWarranty(),
		        			productsInsertUpdateDTO.getColor(),
		        			productsInsertUpdateDTO.getQuantity(),
		        			productsInsertUpdateDTO.getStockAvailability()
		        		);

		            return new ResponseEntity<>("Data updated successfully", HttpStatus.OK);
		        } catch (Exception e) {
		            return new ResponseEntity<>("Error processing Request", HttpStatus.INTERNAL_SERVER_ERROR);
		        }
		    }
		 

}
