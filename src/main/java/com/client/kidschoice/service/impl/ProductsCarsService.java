package com.client.kidschoice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.jdbc.core.JdbcTemplate;

import com.client.kidschoice.entity.VwProductsCars;
import com.client.kidschoice.repository.ProductsCarsRepository;

@Service
public class ProductsCarsService {
	
	
	@Autowired
	private ProductsCarsRepository productsCarsRepository;
	
	@Autowired
    private JdbcTemplate jdbcTemplate;
	
	
	 public List<VwProductsCars> getAllProductsCars() {
		    return productsCarsRepository.getAllProductsCars();
		   
		  }
	  
	  public List<VwProductsCars> getProductsCarsByProductID(String productID ) {
		    return productsCarsRepository.getProductsCarsByProductID(productID);
		   }
	  
	  @Transactional(rollbackFor = Exception.class)
	    public void insertOrUpdateCars(Long incidentUpdateID, String insertOrUpdate, String productID, int categoryID, String productName, String description, 
	    		Double price, Double sellingPrice, String genericName, String brand,String  modelNumber,  
	                                       String type, String ageGroup, String maximumUserWeight, Integer netQuantity,  String speed, String deliveryCondition, Integer numberOfSeats,
	                                       Boolean batteryOperated,Integer noOfBatteries,Boolean batteryIncluded,Boolean rechargeable,String batteryType,String OtherPowerFeatures,Boolean keyStart,Boolean seatbeltIncluded,Boolean mpThreePlayerSupported,Boolean parentalRemote,String light, String horn, String otherConvenienceFeatures, String dimentions, String weight, String countryOfOrigin, 
	                                       String manufacturer, String warrenty, String coveredInWarranty, String notCoveredInWarranty,String color,Integer quantity,Boolean stockAvailability  ) {

	        // Execute stored procedure to insert or update incidents
	        try {
	            String sql = "{CALL dbo.InsertOrUpdateCars(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
	            jdbcTemplate.update(sql,incidentUpdateID, insertOrUpdate, productID, categoryID, productName, description,price, sellingPrice, brand, modelNumber,
	            		 type, ageGroup, maximumUserWeight,netQuantity,speed, deliveryCondition, numberOfSeats, batteryOperated,noOfBatteries,batteryIncluded,rechargeable,  batteryType, OtherPowerFeatures, keyStart, seatbeltIncluded,mpThreePlayerSupported,parentalRemote,light,horn, otherConvenienceFeatures,dimentions,weight,countryOfOrigin,
	            		 manufacturer, warrenty, coveredInWarranty, notCoveredInWarranty, color, quantity, stockAvailability);
	        } catch (Exception e) {
	            throw new RuntimeException("Error occurred while executing the stored procedure", e);
	        }
	    }

}
