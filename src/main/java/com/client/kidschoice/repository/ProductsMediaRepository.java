package com.client.kidschoice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.client.kidschoice.entity.ProductsMedia;
import com.client.kidschoice.entity.VwProductsMedia;

@Repository
public interface ProductsMediaRepository extends CrudRepository<ProductsMedia, Long>{
	
	

	  @Query("SELECT vw  FROM VwProductsMedia vw ")
	  List<VwProductsMedia> getAllProductsMedia();
	  
	  @Query("SELECT vw  FROM VwProductsMedia vw  where ProductID = :productID ")
	  List<VwProductsMedia> getProductsMediaByProductID(@Param("productID") String productID);

}
