package com.client.kidschoice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.client.kidschoice.entity.ProductsCars;
import com.client.kidschoice.entity.VwProductsCars;

@Repository
public interface ProductsCarsRepository extends CrudRepository<ProductsCars, String> {

	
	  @Query("SELECT vw  FROM VwProductsCars vw ")
	  List<VwProductsCars> getAllProductsCars();
	  
	  @Query("SELECT vw  FROM VwProductsCars vw  where ProductID = :productID ")
	  List<VwProductsCars> getProductsCarsByProductID(@Param("productID") String productID);
}
