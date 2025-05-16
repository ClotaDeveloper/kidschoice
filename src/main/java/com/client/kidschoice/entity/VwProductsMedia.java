package com.client.kidschoice.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class VwProductsMedia {

	@Id
	private Long ID;
	@Column
    private Integer ProductCategory;
    @Column
    private String ProductID;
    @Column
    private byte[] ProductImages;
    @Column
    private Date CreatedOn;
    @Column
    private String CreatedBy;
    @Column
    private Date UpdatedOn;
    @Column
    private String UpdatedBy;
    
    public VwProductsMedia () {}
    
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
	public Date getCreatedOn() {
		return CreatedOn;
	}
	public void setCreatedOn(Date createdOn) {
		CreatedOn = createdOn;
	}
	public String getCreatedBy() {
		return CreatedBy;
	}
	public void setCreatedBy(String createdBy) {
		CreatedBy = createdBy;
	}
	public Date getUpdatedOn() {
		return UpdatedOn;
	}
	public void setUpdatedOn(Date updatedOn) {
		UpdatedOn = updatedOn;
	}
	public String getUpdatedBy() {
		return UpdatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		UpdatedBy = updatedBy;
	}
    

    
    
    
    
}
