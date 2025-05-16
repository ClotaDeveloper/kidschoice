package com.client.kidschoice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.client.kidschoice.entity.ProductsBike;
import com.client.kidschoice.entity.VwProductsBike;

@Repository
public interface ProductsBikeRepository extends CrudRepository<ProductsBike, Integer>{
	
	
	  @Query("SELECT vw  FROM VwProductsBike vw ")
	  List<VwProductsBike> getAllProductsBikes();
	  
	  @Query("SELECT vw  FROM VwProductsBike vw  where ProductID = :productID ")
	  List<VwProductsBike> getProductsBikesByProductID(@Param("productID") String productID);

}
