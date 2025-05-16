package com.client.kidschoice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProductsMedia {

	

	@Id
	private Long ID;
	@Column
    private Integer ProductCategory;
    @Column
    private String ProductID;
    @Column
    private byte[] ProductImages;
    
    public ProductsMedia () {}
    
	public Long getID() {
		return ID;
	}
	public void setID(Long iD) {
		ID = iD;
	}
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
	public byte[] getProductImages() {
		return ProductImages;
	}
	public void setProductImages(byte[] productImages) {
		ProductImages = productImages;
	}
    



   
}
