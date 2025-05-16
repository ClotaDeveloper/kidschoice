package com.client.kidschoice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.client.kidschoice.entity.ProductCategory;

@Repository
public interface ProductCategoryRepository extends CrudRepository<ProductCategory, Integer>{

}
