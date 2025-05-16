package com.client.kidschoice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.client.kidschoice.entity.ProductsToys;
import com.client.kidschoice.entity.VwProductsToys;

@Repository
public interface ProductsToysRepository extends CrudRepository<ProductsToys, Integer>{

	

	  @Query("SELECT vw  FROM VwProductsToys vw ")
	  List<VwProductsToys> getAllProductsToys();
	  
	  @Query("SELECT vw  FROM VwProductsToys vw  where ProductID = :productID ")
	  List<VwProductsToys> getProductsToysByProductID(@Param("productID") String productID);
	
}
