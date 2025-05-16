package com.client.kidschoice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProductsInventory {
	

	@Id
    private Integer ProductCategory;
    @Column
    private String ProductID;
    @Column
    private String Color;
    @Column
    private String Quantity;
    @Column
    private String StockAvailability;
    

	public Integer getProductCategory() {
		return ProductCategory;
	}
	public void setProductCategory(Integer productCategory) {
		ProductCategory = productCategory;
	}
	public String getProductID() {
		return ProductID;
	}
	public void setProductID(String productID) {
		ProductID = productID;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public String getQuantity() {
		return Quantity;
	}
	public void setQuantity(String quantity) {
		Quantity = quantity;
	}
	public String getStockAvailability() {
		return StockAvailability;
	}
	public void setStockAvailability(String stockAvailability) {
		StockAvailability = stockAvailability;
	}
	
	
    

   

}
