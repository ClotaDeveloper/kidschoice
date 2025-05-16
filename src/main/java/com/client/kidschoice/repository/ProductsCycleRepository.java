package com.client.kidschoice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.client.kidschoice.entity.ProductsCycle;
import com.client.kidschoice.entity.VwProductsCycle;

@Repository
public interface ProductsCycleRepository extends CrudRepository<ProductsCycle, Integer> {

	
	  @Query("SELECT vw  FROM VwProductsCycle vw")
	  List<VwProductsCycle> getAllProductsCycles();
	  
	  @Query("SELECT vw  FROM VwProductsCycle vw  where ProductID = :productID")
	  List<VwProductsCycle> getProductsCyclesByProductID(@Param("productID") String productID);
	
}
