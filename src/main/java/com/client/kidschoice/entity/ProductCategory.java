package com.client.kidschoice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProductCategory {
	

	@Id
    private Integer MainCategoryID;
    @Column
    private String ProductCategoryName;
    @Column
    private String Description;
    
    
	public Integer getMainCategoryID() {
		return MainCategoryID;
	}
	public void setMainCategoryID(Integer mainCategoryID) {
		MainCategoryID = mainCategoryID;
	}
	public String getProductCategoryName() {
		return ProductCategoryName;
	}
	public void setProductCategoryName(String productCategoryName) {
		ProductCategoryName = productCategoryName;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
   

}
