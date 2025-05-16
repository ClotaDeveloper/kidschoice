package com.client.kidschoice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.client.kidschoice.entity.ProductsGiftsAndArts;
import com.client.kidschoice.entity.VwProductsGiftsAndArts;

@Repository
public interface ProductsGiftsAndArtsRepository extends CrudRepository<ProductsGiftsAndArts, Integer> {

	

	  @Query("SELECT vw  FROM VwProductsGiftsAndArts vw ")
	  List<VwProductsGiftsAndArts> getAllProductsGiftsAndToys();
	  
	  @Query("SELECT vw  FROM VwProductsGiftsAndArts vw  where ProductID = :productID ")
	  List<VwProductsGiftsAndArts> getProductsGiftsAndToysByProductID(@Param("productID") String productID);
	
}
