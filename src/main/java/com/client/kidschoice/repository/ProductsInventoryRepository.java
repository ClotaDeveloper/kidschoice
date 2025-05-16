package com.client.kidschoice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.client.kidschoice.entity.ProductsInventory;

@Repository
public interface ProductsInventoryRepository extends CrudRepository<ProductsInventory, Integer> {

}
